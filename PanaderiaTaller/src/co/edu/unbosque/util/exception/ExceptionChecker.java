package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ExceptionChecker proporciona métodos estáticos para verificar condiciones y
 * formatos de entrada, lanzando excepciones personalizadas cuando las
 * condiciones no se cumplen.
 * 
 * <p>
 * Este utilitario se utiliza para validar datos antes de ser procesados por la
 * aplicación.
 * </p>
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class ExceptionChecker {

	/**
	 * Verifica si un número es negativo. Si es negativo, lanza una excepción.
	 * 
	 * @param numero El número a verificar.
	 * @throws NegativeNumberException Si el número es negativo.
	 */
	
	public static int verificarNumeroNegativo(String entrada) throws NegativeNumberException {
        // Expresión regular que asegura que solo sea un número entero positivo
        if (!entrada.matches("^[0-9]")) {
            throw new NegativeNumberException();
        }
        // Convierte a int y retorna el valor
        return Integer.parseInt(entrada);
    }
	
	
	/**
	 * Verifica si una cadena es un estado booleano válido ("si" o "no").
	 * 
	 * @param condition La cadena a verificar.
	 * @throws InvalidBooleanStateException Si la condición no es "si" o "no".
	 */
	public static void checkCondition(String condition) throws InvalidBooleanStateException {
		if (!condition.equalsIgnoreCase("si") && !condition.equalsIgnoreCase("no")) {
			throw new InvalidBooleanStateException();
		}
	}

	/**
	 * Verifica si una palabra contiene solo letras. Si contiene caracteres no
	 * válidos, lanza una excepción.
	 * 
	 * @param word La palabra a verificar.
	 * @throws InvalidWordException Si la palabra contiene caracteres no válidos.
	 */
	public static void checkWord(String word) throws InvalidWordException {
		Pattern p = Pattern.compile("[^a-zA-Z ]");
		Matcher m = p.matcher(word);

		if (m.find()) {
			throw new InvalidWordException();
		}
	}

	/**
	 * Verifica el formato de un número decimal. Si contiene caracteres no válidos,
	 * lanza una excepción.
	 * 
	 * @param numero El número a verificar.
	 * @throws InvalidDoubleFormatException Si el número no tiene un formato decimal
	 *                                      válido.
	 */
	public static double checkDouble(String decimal) throws InvalidDoubleFormatException {
		 if (!decimal.matches ("[^0-9.]")) {
	            throw new InvalidDoubleFormatException();
	        }
	        // Convierte a int y retorna el valor
	        return Double.parseDouble(decimal);
	    }
		
		
	}
	
    



