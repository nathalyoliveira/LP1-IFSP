package Lista1;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		  
	    Scanner sc = new Scanner (System.in);
	    
	    System.out.println("Digite um n�mero");
	    Integer n = sc.nextInt();
	    
	    if (n%2==0)
	       System.out.println("N�mero par");
	    else
	        System.out.println("N�mero �mpar");

	}

}
