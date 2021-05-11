package Lista1;

import java.util.Scanner;

public class Eleitor {
	
	 public static void main(String[] args) {
		    
		    Scanner sc = new Scanner (System.in);
		    
		    System.out.println("Digite sua idade:");
		    Integer idade = sc.nextInt();
		    
		    if (idade <16)
		      System.out.println("Não pode votar.");
		    else
		      System.out.println("Pode votar!");
		    
		  }

}
