package co.edu.unbosque.util.exception;

/**
 * Excepción que se lanza cuando un número negativo es encontrado.
 * 
 * <p>
 * Esta excepción se utiliza para validar entradas numéricas, asegurando que no
 * se permitan valores negativos en situaciones donde esto no es aceptable.
 * </p>
 * 
 * <p>
 * Es útil en contextos como cálculos financieros, conteos o cualquier operación
 * que no deba aceptar números negativos.
 * </p>
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class NegativeNumberException extends Exception {

	/**
	 * Crea una nueva instancia de NegativeNumberException con un mensaje
	 * predeterminado.
	 */
	public NegativeNumberException() {
		super("Los números no pueden ser negativos.");
	}
}
