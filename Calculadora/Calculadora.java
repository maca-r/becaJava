package semanaTres;

public class Calculadora {
	
	public static double suma(double a, double b) {
		return a + b;
	}
	
	public static double resta(double a, double b) {
		return a - b;
	}
	
	public static double multiplicacion(double a, double b) {
		return a * b;
	}
	
	public static double division(double a, double b) {
		double c = 0;
		try {
			
			if(b != 0) {
				c = a / b;
			}
			
		}
		catch (Exception e) {
			System.out.println("b no puede ser 0");
		}
		
		
		return c;
	}

}
