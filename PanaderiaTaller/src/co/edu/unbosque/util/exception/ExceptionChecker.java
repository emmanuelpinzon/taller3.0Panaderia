package co.edu.unbosque.util.exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionChecker {
public static void verificarNumeroNegativo(int numero) throws NegativeNumberException {
	if(numero<0) {
		throw new NegativeNumberException();
	}
}

public static void verificarNumeroEntero(int numero1) throws VerifyNonDecimalNumberException {
	Pattern p = Pattern.compile("[\\D]");
	Matcher m = p.matcher(String.valueOf(numero1));
	if (m.find()) {
		throw new VerifyNonDecimalNumberException();
	}
}

public static void checkCondition(String condition ) throws InvalidBooleanStateException {
if(!condition.equalsIgnoreCase("si")&& !condition.equalsIgnoreCase("no")) {
	throw new InvalidBooleanStateException();
}
}
public static void checkWord(String word) throws InvalidWordException {
	Pattern p = Pattern.compile("[^a-zA-Z ]");
	Matcher m = p.matcher(word);
	
	if(m.find()) {
		throw new InvalidWordException();
	}
}
public static void checkDouble(double numero) throws InvalidDoubleFormatException {
    String numeroComoString = String.valueOf(numero);
    Pattern p = Pattern.compile("[^0-9.]");
    Matcher m = p.matcher(numeroComoString);
    
    if (m.find()) {
    	throw new InvalidDoubleFormatException();
    }
}
}
