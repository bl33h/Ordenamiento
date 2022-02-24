/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria
 * FileName: Controller
 * Author:   Fabián Juárez , Sara Echeverria , José Pablo Kiesling
 * Date:     4/03/2022
 * @author José Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version:
        - Creación: 23/02/2022
        - Última modificación:
    Clase que comunica el modelo con la vista y controla sus acciones
 */

public class Controller{
    public static void main(String[] args) {

        int numMenu;
        View miVista = new View();


        miVista.Welcome(); //Despliegue el titulo del programa
        numMenu = -1;
        while(numMenu != 7){ //Despliega el menu principal
            numMenu = miVista.menu();
            switch (numMenu) {
                case 1: //Gnome sort

                break;
                case 2://Merge sort

                break;
                case 3: // Quick sort

                break;
                case 4: // Radix sort

                break;
                case 5: // Bubble sort

                break;
                case 6: // Salir
                miVista.Exit();
                break;

            }
        }
    }
}