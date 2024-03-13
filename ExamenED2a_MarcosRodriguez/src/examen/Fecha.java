package examen;
/**
 * Esta clase implementa un método para validar una fecha.
 * @version 1.0
 * @author Marcos Daniel Rodriguez
 */
public class Fecha {
	/**
	 * Campo booleano para el método validarFecha
	 */
	public static boolean fechaValida;
	
	/**
	 * 
	 * Este método realiza la comprobación de una fecha introducida para deducir si es una fecha real o no.
	 * 
	 * @param anio Número entero que representa el año.
	 * @param mes Número entero que representa el mes.
	 * @param dia Número entero que representa el día.
	 * @return booleano definido a través del método.
	 */

	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}