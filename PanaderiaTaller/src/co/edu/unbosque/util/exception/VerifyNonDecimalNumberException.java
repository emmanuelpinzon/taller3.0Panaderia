package co.edu.unbosque.util.exception;

/**
 * Excepción que se lanza cuando un número decimal es encontrado en un contexto
 * donde solo se permiten números naturales (enteros no negativos).
 * 
 * <p>
 * Esta excepción es útil para validar entradas que requieren números enteros,
 * como conteos, identificadores o situaciones donde se espera un valor
 * discreto.
 * </p>
 * 
 * @author Emmanuel
 * @version 1.0
 */
public class VerifyNonDecimalNumberException extends Exception {

	/**
	 * Crea una nueva instancia de VerifyNonDecimalNumberException con un mensaje
	 * predeterminado.
	 */
	public VerifyNonDecimalNumberException() {
		super("Los números no pueden ser decimales, solo números naturales.");
	}
}
