/**
 * Copyright (C), 2022-2023, The_Kiesling FabianJuarez SaraEcheverria 
 * FileName: IComparator
 * Author:   Fabian Juarez , Sara Echeverria , Jose Pablo Kiesling
 * Date:     4/03/2022
 * @author Jose Pablo Kiesling, Fabian Juarez y Sara Echeverria
 * @version: 
        - Creacion: 23/02/2022
        - Ultima modificacion: 

	Interfaz de comparator
 */

public interface IComparator<T> {
	/*****************************************************************
	 * Compara dos objetos genericos y devuelve un entero que dice cual es mayor
	 * Si es 1, el primero es mayor; si es -1, el segundo es mayor; si es 0, ambos son iguales
	 * @param objetos a comparar
	 * @return entero que indica cual es mayor
	 */
	public int Compare(T _object1, T _object2);
	//****************************************************************
}