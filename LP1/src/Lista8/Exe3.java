package Lista8;

public class Exe3 {
	
	public static void main(String[] args) {
		
		String x = null;
		String y = null;
		
		try {
			y = x.toLowerCase();
		}
		catch (NullPointerException e){
			System.out.println("A vari�vel tem o valor nulo");
			x = "TESTE";
		}
		finally {
			y = x.toLowerCase();
		}
		
		System.out.println("Primeira vari�vel:" + x);
		System.out.println("Segunda vari�vel:" + y);
	}

}
