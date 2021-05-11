package Lista1;

import java.util.Scanner;

public class Fruta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	    
	    System.out.println("Digite a quantidade de maçãs: ");
	    Integer qtde = sc.nextInt();
	    
	    Double valor;
	    
	    if (qtde <12)
	      valor = qtde * 0.30;
	    else 
	      valor = qtde * 0.25;
	    
	    System.out.println("Valor Total: R$ " + valor);

	}

}
