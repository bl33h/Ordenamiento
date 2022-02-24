/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
 * FileName: View
 * Author:   Fabián Juárez , Sara Echeverria , José Pablo Kiesling
 * Date:     4/03/2022
 * @author José Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version: 
        - Creación: 23/02/2022
        - Última modificación: 
    Clase que tiene como fin ser un sistema I/O para la manipulación del programa
 */

import java.util.Scanner;

public class View{
    //---------------------------PROPIEDADES--------------------------
    private Scanner scan; //Scanner

    //---------------------------MÉTODOS------------------------------
    /*****************************************************************
	 * Constructor de la clase View que instancia el Scanner
	 */
    public View(){
        scan = new Scanner(System.in); // Scanner
    }
    //****************************************************************

    /*****************************************************************
	 * Mostrara un mensaje en pantalla de bienvenida para el usuario
	 */
    public void Welcome(){
        System.out.println("------------- Bienvenido/bienvenida a su radio ---------------- "); // Titulo
    }
    //****************************************************************

	/*****************************************************************
	 * Mostrara un mensaje en pantalla determinado por el programador donde se utilice esta clase
	 * @param mensaje a mostrar en pantalla
	 */
    public void mensaje(String mensaje){
        System.out.println(mensaje);
    }
    //****************************************************************

	/*****************************************************************
	 * Menu a utilizar en controladora
	 * @return entero que indicala opcion de menu a utilizar
	 */
    public int menu(){ //Menu principal para que el usuario eliga la opcion a realizar
        String salir = "";
        int numMenu = 0;
        String tmpTexto = "";
        boolean isNumeric = false;
        while(!salir.equalsIgnoreCase("si")){
            //Se imprime el menu en pantalla y se le pide al usuario un numero del menu
            System.out.println("\n************************* Funciones de su ordenamiento ************************************\n");
            System.out.println("1. Gnome sort");
            System.out.println("2. Merge sort");
            System.out.println("3. Quick sort");
            System.out.println("4. Radix sort");
            System.out.println("5. Bubble sort");
            System.out.println("6. Salir");
            System.out.println("\n************ Por, favor elija la opcion que desea ejecutar **********\n");
            tmpTexto = scan.nextLine();

            // Se verifica que el numero que dio el usuario fue valido
            isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
            if (isNumeric && !tmpTexto.isEmpty()){
                numMenu = Integer.parseInt(tmpTexto);
                salir = "si";
            }
            while (tmpTexto.isEmpty()||!isNumeric || numMenu < 1 || numMenu > 6) {
                System.out.println("ERROR, ingresar una opcion de menu mayor que 0" + " o menor que 6");
                tmpTexto = scan.nextLine();
                isNumeric = tmpTexto.chars().allMatch( Character::isDigit );
                numMenu = 0;
                if (isNumeric&&!tmpTexto.isEmpty()){
                    numMenu = Integer.parseInt(tmpTexto);
                    salir = "si";
                    }
                }
            }
        return numMenu;
    }
    //****************************************************************

	/*****************************************************************
	 * Cierre del menu
     */
    public void Exit(){
        System.out.println(" ------------ Gracias por utilizar nuestro programa ------------ \n"); // Mensaje que se mostrara al cerrar el programa
        System.exit(0);
        scan.close();
    }
        //****************************************************************
}