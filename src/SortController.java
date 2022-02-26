/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria
 * FileName: SortController
 * Author:   Fabian Juarez , Sara Echeverria , Jose Pablo Kiesling
 * Date:     4/03/2022
 * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version:
        - Creacion: 23/02/2022
        - Ultima modificacion: 25/02/2022

    Clase que controlara al modelo, y permitira que funcione de la manera esperada.
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SortController{
    //---------------------------PROPIEDADES--------------------------
    Comparator comparator = new Comparator();
    Sorts sort = new Sorts(comparator);
    int size = 3000; // Tamanio variable para las pruebas en Visual VM
    Integer[] array = new Integer[size];

    //---------------------------METODOS------------------------------
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
            for(int i=0; i < 3000;i ++)
                contenido += rand.nextInt(10000 + 0) + 0 + "\n";
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //****************************************************************

    /*****************************************************************
	 * Creara el archivo donde iran los 3000 numeros
     */
    public void Filewrite(){
        try {
            String ruta = "datos.txt";
            String contenido = "";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i < size ;i ++)
                contenido += array[i] + "\n";
            bw.write(contenido);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*****************************************************************
	 * FileReader: Lee el archivo.
     */
    private boolean read() throws FileNotFoundException{
        boolean read = false;
        try{
            read = true;
            File file = new File("datos.txt");
            Scanner reader = new Scanner(file);
            int i = 0;
            while(reader.hasNextLine() && i<size){
                array[i] = Integer.parseInt(reader.nextLine());
                i++;
            }
            reader.close();
        }catch(FileNotFoundException e){
            String s = "SortController.read:" + e.getMessage();
            throw new FileNotFoundException(s);
        }
        return read;
    }
    //****************************************************************

    /*****************************************************************
	 * Sort: segun la opcion que se le indique, realizara el sort
     * @throws FileNotFoundException
     */
    public void Sort(int opcion) throws FileNotFoundException{
        Filecreator();
        read();
        switch (opcion) {
            case 1: //Gnome sort
                sort.GnomeSort(array);
            break;
            case 2://Merge sort
                sort.MergeSort(array, 0 ,size-1);
            break;
            case 3: // Quick sort
            {
                System.out.println(size-1);
                sort.QuickSort(array, 0, 2999);

            }
            break;
            case 4: // Radix sort
                sort.RadixSort(array);
            break;
            case 5: // Bubble sort
                sort.BubbleSort(array);
            break;
        }
        Filewrite();
    }
    //****************************************************************
}
