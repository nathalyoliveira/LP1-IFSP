package Lista7;

import java.util.ArrayList;

public class Exercicio4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> valor = new ArrayList<Integer>();
		for(int i = 1; i<=100;++i) {
			if(i % 2 != 0)
				valor.add(i);
		} System.out.println(valor);
		
		int soma = 0;
		for(int i = 0; i < valor.size(); i++){
			soma += valor.get(i);
		}
		
		System.out.println("Soma: " + soma);
		
	}

}
