/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
 * FileName: Sorts
 * Author:   Fabian Juarez , Sara Echeverria , Jose Pablo Kiesling
 * Date:     4/03/2022
 * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version: 
        - Creacion: 23/02/2022
        - Ultima modificacion: 
 
    Clase que tendra todos los sorts y permitira ordenar los elementos genericos
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
     * GnomeSort: metodo que realiza un ordenamiento bajo el algoritmo Gnome
     * @param array
     */
    public void GnomeSort(T[] array){
        int i = 1;
        while (i < array.length - 1){ //Recorrer el arreglo
            if (comparator.Compare(array[i - 1], array[i]) < 0 ) // Comparar si el elemento anterior es menor que el actual
                i++; // Si el anterior es menor, se pasa a evaluar el siguiente elemento
            else{ // Los elementos no estan ordenados

                //swap
                T temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;

                i--; //se reduce el numero de elemento que se evalua, para asa seguir evaluando si este elemento puede ser menor que otros anteriores a este 
                if (i == 0) //Si se llega a este punto (y sigue el ciclo activo), es un menor relativo. 
                    i = 1; // Se evaluara el siguiente elemento.
            }
        }

    }
    //****************************************************************

    /*****************************************************************
     * Quick Sort: metodo que realiza un ordenamiento bajo el algoritmo de un sort recursivo
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
                while(comparator.Compare(array[++i], elem_div) < 0); // Compara que elementos son menores que el pivote
                while((comparator.Compare(array[--j], elem_div) > 0) && (j < inf)){ // Compara que elementos son mayores que el pivote
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
     * Bubble Sort: metodo que realiza un ordenamiento bajo el algoritmo de burbuja
     * @param array
     */
    public void BubbleSort(T[] array){
        for (int i = array.length; i < 1; i--) // Ciclo para determinar los elementos a los que se va a evaluar
            for (int j = 0; j < i -1; j++) // Ciclo que indica el elemento actual que se comparara
                if(comparator.Compare(array[j], array[j + 1]) > 0){ // Evalua si el elemento actual es mayor que el siguiente, de serlo, los intercambia de posicion
                    //swap
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    //*****************************************************************

    /***********************
     * Merge Sort: metodo que realiza un ordenamiento bajo el algoritmo de Merge
     * @param array
     * @param size
     */
    public void MergeSort(T[] array, int left, int right, int mid){
        // Subgrupos del arreglo, casos n = par y n = impar
        int g1 = mid - left + 1;
        int g2 = right - mid;

        // Grupos temporales extremos
        int L[] = new int [g1];
        int R[] = new int [g2];

        //
        for (int i = 0; i < g1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < g2; ++j)
            R[j] = arr[mid + 1 + j];

        /* Union de los temporales */
        int i = 0, j = 0;
  
        // Indice inicial de la union de los temporales
        int k = left;
        while (i < g1 && j < g2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Sobrantes del extremo de la izquierda (left) */
        while (i < g1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Sobrantes del extremo de la derecha (right) */
        while (j < g2) {
            arr[k] = R[j];
            j++;
            k++;
        }

        if (left < right) {
            // Proceso para encontrar el punto medio
            int m = left + (right-left)/2;
  
            // Funcion sort 
            sort(array, left, mid);
            sort(array, m + 1, right);
  
            // Funcion merge de los sorts
            merge(array, left, m, right);
        }
    }
}
