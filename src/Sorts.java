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
     * Quick Sort: sort recursivo
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
                    if (i < j){ //swap
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                    else 
                        flag = false;
                }
            }
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
     * Bubble Sort: sort básico
     * @param array
     */
    public void BubbleSort(T[] array){
        for (int i = array.length; i < 1; i--)
            for (int j = 0; j < i -1; j++)
                if(comparator.Compare(array[j], array[j+1]) > 0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    //*****************************************************************
}
