package co.edu.unbosque.util.exception;

public class ExceptionMain {

	public static void main(String[] args) throws NegativeNumberException {
		// TODO Auto-generated method stub
		String condition= "si";
		try {
			ExceptionChecker.checkCondition(condition);
		} catch (InvalidBooleanStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		String b="2";
		ExceptionChecker.verificarNumeroNegativo(b);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
		String a= "a";
		try {
			ExceptionChecker.checkWord(a);
		} catch (InvalidWordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		String f= "4.5";

		try {
			ExceptionChecker.checkDouble(f);
		} catch (InvalidDoubleFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}



