package Lista4;

public class Teste {

	public static void main(String[] args) {
		
		Tempo t1 = new Tempo();
		t1.setHoras(11);
		t1.setMinutos(14);
		t1.setSegundos(50);
		
		System.out.println(t1.Imprimir(15, 40, 00));
		
		System.out.println(t1.Imprimir(t1.getHoras(), t1.getMinutos(), t1.getSegundos()));

	}

}
