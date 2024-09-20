package co.edu.unbosque.util.exception;

public class InvalidDoubleFormatException extends Exception {
public InvalidDoubleFormatException() {
	super("tiene que ser un numero entero o decimal, no letras ni simbolos ni tampoco negativos");
}
}
