package co.edu.unbosque.util.exception;

/**
 * Excepción que se lanza cuando una entrada contiene caracteres no válidos.
 * 
 * <p>
 * Esta excepción se utiliza para indicar que la entrada debe consistir
 * únicamente en letras y espacios, sin incluir números o símbolos.
 * </p>
 * 
 * <p>
 * Es útil en situaciones donde se requiere que los usuarios ingresen solo
 * texto, como nombres, descripciones o cualquier otra entrada textual.
 * </p>
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class InvalidWordException extends Exception {

	/**
	 * Crea una nueva instancia de InvalidWordException con un mensaje
	 * predeterminado.
	 */
	public InvalidWordException() {
		super("La entrada debe contener solo letras y espacios.");
	}
}
