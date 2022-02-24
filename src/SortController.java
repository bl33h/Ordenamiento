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

public class SortController {
    
    public void Filecreator(){
    /*****************************************************************
	 * Creara el archivo donde iran los 1000 numeros
     **/
    try {
        String ruta = "datos.txt";
        String contenido = "Contenido de ejemplo";
        File file = new File(ruta);
        // Si el archivo no existe es creado
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(contenido);
        bw.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }
}
