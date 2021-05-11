package Lista4;

public class Calculadora {
	
	public static Integer Multiplicar(Integer a, Integer b) {
		return a * b;
	}
	
	public static Double Multiplicar(Double a, Double b) {
		return a * b;
	}
	
	public static Integer Cubo(Integer a) {
		return a * a * a;
	}
	
	public static String ParImpar(Integer a) {
		if (a%2==0)
			return "Par";
		else if (a%2!=0)
			return "Impar";
		else 
			return "Zero";
	}

}
