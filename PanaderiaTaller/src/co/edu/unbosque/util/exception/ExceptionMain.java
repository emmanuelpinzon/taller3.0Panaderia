package co.edu.unbosque.util.exception;

public class ExceptionMain {

	public static void main(String[] args) throws NegativeNumberException {
		// TODO Auto-generated method stub
		String condition= "sinnn";
		try {
			ExceptionChecker.checkCondition(condition);
		} catch (InvalidBooleanStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String a= "a";
		try {
			ExceptionChecker.checkWord(a);
		} catch (InvalidWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int e= 33;
		try {
			ExceptionChecker.verificarNumeroEntero(e);
		} catch (VerifyNonDecimalNumberException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		double f= -4.9;
		try {
			ExceptionChecker.checkDouble(f);
		} catch (InvalidDoubleFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}



