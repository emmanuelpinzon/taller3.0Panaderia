package co.edu.unbosque.util.exception;

/**
 * Excepción que se lanza cuando un número no tiene el formato decimal válido.
 * 
 * <p>
 * Esta excepción se utiliza para indicar que una entrada debe ser un número
 * entero o decimal, sin letras, símbolos o valores negativos.
 * </p>
 * 
 * <p>
 * Es útil para validar entradas en operaciones matemáticas y asegurarse de que
 * los datos son correctos antes de ser procesados.
 * </p>
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class InvalidDoubleFormatException extends Exception {

	/**
	 * Crea una nueva instancia de InvalidDoubleFormatException con un mensaje
	 * predeterminado.
	 */
	public InvalidDoubleFormatException() {
		super("Tiene que ser un número entero o decimal, no letras ni símbolos, ni tampoco negativos.");
	}
}
