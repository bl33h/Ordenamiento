/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
 * FileName: Sorts
 * Author:   Fabián Juárez , Sara Echeverria , José Pablo Kiesling
 * Date:     4/03/2022
 * @author José Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version: 
        - Creación: 23/02/2022
        - Última modificación: 
 
    Clase que tendrá todos los sorts y permitirá ordenar los elementos genéricos
 */

public class Sorts<T> {
    
    private IComparator comparator;

    /*****************************************************************
     * Constructor que requiere el comparador
     * @param comparator
     */
    public Sorts(IComparator comparator){
        this.comparator = comparator;
    }
    //****************************************************************

    /*****************************************************************
     * GnomeSort: método que realiza un ordenamiento bajo el algoritmo Gnome
     * @param array
     */
    public void GnomeSort(T[] array){
        int i = 1;
        while (i < array.length - 1){ //Recorrer el arreglo
            if (comparator.Compare(array[i - 1], array[i]) < 0 ) //Comparar si el elemento anterior es menor que el actual
                i++; //Si el anterior es menor, se pasa a evaluar el siguiente elemento
            else{ //Los elementos no están ordenados

                //swap
                T temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;

                i--; //se reduce el número de elemento que se evalúa, para así seguir evaluando si este elemento puede ser menor que otros anteriores a este 
                if (i == 0) //Si se llega a este punto (y sigue el ciclo activo), es un menor relativo. 
                    i = 1; //Se evaluará el siguiente elemento.
            }
        }

    }
    //****************************************************************

    /*****************************************************************
     * Quick Sort: método que realiza un ordenamiento bajo el algoritmo de un sort recursivo
     * @param array
     * @param size
     */
    public void QuickSort(T[] array, int inf, int sup){
        if (inf >= sup) //Caso trivial
            return ;
        else{ //Salto de fe
            int i = inf - 1, j = sup;
            boolean flag = true;
            T elem_div = array[sup] /* elemento pivote */ , temp;

            while(flag){
                while(comparator.Compare(array[++i], elem_div) < 0); //Compara que elementos son menores que el pivote
                while((comparator.Compare(array[--j], elem_div) > 0) && (j < inf)){ //Compara que elementos son mayores que el pivote
                    if (i < j){
                        //swap
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    else
                        flag = false;
                }
            }
            //Proceso para dividir mitades
            temp = array[i];
            array[i] = array[sup];
            array[sup] = temp;

            //--- RECURSIÓN ---
            QuickSort(array, inf, i-1);
            QuickSort(array, i + 1, sup);
        }
    }
    //*****************************************************************

    /******************************************************************
     * Bubble Sort: método que realiza un ordenamiento bajo el algoritmo de burbuja
     * @param array
     */
    public void BubbleSort(T[] array){
        for (int i = array.length; i < 1; i--) //Ciclo para determinar los elementos a los que se va a evaluar
            for (int j = 0; j < i -1; j++) //Ciclo que indica el elemento actual que se comparará
                if(comparator.Compare(array[j], array[j + 1]) > 0){ //Evalúa si el elemento actual es mayor que el siguiente, de serlo, los intercambia de posición
                    //swap
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    //*****************************************************************


}
