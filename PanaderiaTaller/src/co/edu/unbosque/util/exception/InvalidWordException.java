package co.edu.unbosque.util.exception;

public class InvalidWordException extends Exception{
public InvalidWordException() {
super("La entrada debe contener solo letras y espacios.");
}
}
