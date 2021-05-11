package Lista1;

import java.util.Scanner;

public class Produto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	    
	    System.out.println("Digite o valor do produto: ");
	    Double valor = sc.nextDouble();
	    
	    Double total;
	    
	    if (valor < 20.0)
	      total = valor + (valor * 0.45);
	    else 
	      total = valor + (valor * 0.30);
	    
	    System.out.println("Total: R$ " + total);

	}

}
