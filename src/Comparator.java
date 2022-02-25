/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria
 * FileName: Controller
 * Author:   Fabián Juárez , Sara Echeverria , José Pablo Kiesling
 * Date:     4/03/2022
 * @author José Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version:
        - Creación: 25/02/2022
        - Última modificación:
    Clase que comunica el modelo con la vista y controla sus acciones
 */

public class Comparator implements IComparator{

    /*****************************************************************
	 * Compara dos objetos genéricos y devuelve un entero que dice cuál es mayor
	 * Si es 1, el primero es mayor; si es -1, el segundo es mayor; si es 0, ambos son iguales
	 * @param objetos a comparar
	 * @return entero que indica cuál es mayor
	 */
    public int Compare(Object _object1, Object _object2) {
        Integer num1 = (Integer)_object1;
        Integer num2 = (Integer)_object2;

        if(num1.compareTo(num2) > 0)
            return 1;
        else if (num1.compareTo(num2) < 0)
            return -1;
        else
            return 1;
    }
    //****************************************************************
}
