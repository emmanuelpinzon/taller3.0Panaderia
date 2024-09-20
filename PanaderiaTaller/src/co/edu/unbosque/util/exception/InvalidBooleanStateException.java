package co.edu.unbosque.util.exception;

public class InvalidBooleanStateException extends Exception{
	public InvalidBooleanStateException() {
		super("La respuesta debe ser 'sí' o 'no'.");
	}



}
