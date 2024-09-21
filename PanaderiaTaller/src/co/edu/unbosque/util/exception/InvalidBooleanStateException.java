package co.edu.unbosque.util.exception;

/**
 * Excepción que se lanza cuando una respuesta no es un estado booleano válido.
 * 
 * <p>
 * Esta excepción se utiliza para indicar que una entrada no es "sí" o "no", lo
 * cual es necesario para ciertas operaciones dentro de la aplicación.
 * </p>
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class InvalidBooleanStateException extends Exception {

	/**
	 * Crea una nueva instancia de InvalidBooleanStateException con un mensaje
	 * predeterminado.
	 */
	public InvalidBooleanStateException() {
		super("La respuesta debe ser 'sí' o 'no'.");
	}
}
