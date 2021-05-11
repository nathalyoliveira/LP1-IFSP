package Lista7;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		ArrayList<Integer> valor = new ArrayList<Integer>();

		for(int i = 1; i<=10;++i) {
			valor.add(gerador.nextInt(100));
		} System.out.println(valor);
			
		
		Integer maior = 0;
		
		for(Integer v : valor) {  
		      if(v > maior) {
		            maior = v;
		      }} System.out.println("Maior valor: " + maior);

	}

}
