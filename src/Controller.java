/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria
 * FileName: Controller
 * Author:   Fabian Juarez , Sara Echeverria , Jose Pablo Kiesling
 * Date:     4/03/2022
 * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version:
        - Creacion: 23/02/2022
        - Ultima modificacion:
    Clase que comunica el modelo con la vista y controla sus acciones
 */

public class Controller{
    public static void main(String[] args) {

        int numMenu;
        View miVista = new View();
        SortController ControlSort = new SortController();
        ControlSort.Filecreator();//Creacion del archivo
        miVista.Welcome(); //Despliegue el titulo del programa
        numMenu = -1;
        while(numMenu != 6){ //Despliega el menu principal
            if (numMenu < 6)
                ControlSort.Sort(numMenu);
            else
                miVista.Exit();
        }
    }
}