/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria
 * FileName: SortController
 * Author:   Fabián Juárez , Sara Echeverria , José Pablo Kiesling
 * Date:     4/03/2022
 * @author José Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version:
        - Creación: 23/02/2022
        - Última modificación:

    Clase que controlará al modelo, y permitirá que funcione de la manera esperada.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

public class SortController{
    //---------------------------PROPIEDADES--------------------------
    Comparator comparator = new Comparator();
    Sorts sort = new Sorts(comparator);
    int size = 3000; //Tamaño variable para las pruebas en Visual VM
    Integer[] array = new Integer[size];

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
	 * Creara el archivo donde iran los 3000 numeros
     */
    public void Filecreator(){
        try {
            String ruta = "datos.txt";
            Random rand = new Random();
            String contenido = "";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i <= size ;i ++)
                contenido += rand.nextInt(10000 + 0) + 0 + "\n";
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //****************************************************************

    /*****************************************************************
	 * Sort: según la opción que se le indique, realizará el sort
     */
    public void Sort(int opcion){
        switch (opcion) {
            case 1: //Gnome sort
                sort.GnomeSort(array);
            break;
            case 2://Merge sort
                sort.MergeSort();
            break;
            case 3: // Quick sort
                sort.QuickSort(array, 1, size);
            break;
            case 4: // Radix sort
                sort.RadixSort();
            break;
            case 5: // Bubble sort
                sort.BubbleSort(array);
            break;
        }
    }
    //****************************************************************
}
