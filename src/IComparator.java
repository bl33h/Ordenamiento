/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
 * FileName: IComparator
 * Author:   Fabián Juárez , Sara Echeverria , José Pablo Kiesling
 * Date:     4/03/2022
 * @author José Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version: 
        - Creación: 23/02/2022
        - Última modificación: 

	Interfaz de comparator
 */

public interface IComparator<T> {
	/*****************************************************************
	 * Compara dos objetos genéricos y devuelve un entero que dice cuál es mayor
	 * Si es 1, el primero es mayor; si es -1, el segundo es mayor; si es 0, ambos son iguales
	 * @param objetos a comparar
	 * @return entero que indica cuál es mayor
	 */
	public int Compare(T _object1, T _object2);
	//****************************************************************
}