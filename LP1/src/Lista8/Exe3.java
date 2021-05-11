package Lista8;

public class Exe3 {
	
	public static void main(String[] args) {
		
		String x = null;
		String y = null;
		
		try {
			y = x.toLowerCase();
		}
		catch (NullPointerException e){
			System.out.println("A variável tem o valor nulo");
			x = "TESTE";
		}
		finally {
			y = x.toLowerCase();
		}
		
		System.out.println("Primeira variável:" + x);
		System.out.println("Segunda variável:" + y);
	}

}
