package Lista6;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		
		LocalDate nasc1 = LocalDate.of(2003,8,12);
		Gato g1 = new Gato("Nina", nasc1, "preta");
		
		LocalDate nasc2 = LocalDate.of(2005,12,8);
		Cachorro c1 = new Cachorro("Simba", nasc2, "Laranja");
		
		System.out.println(g1.toString());
		System.out.println(g1.idade());
		
		System.out.println(c1.toString());
		System.out.println(c1.idade());

	}

}
