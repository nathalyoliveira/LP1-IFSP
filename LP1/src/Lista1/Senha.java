package Lista1;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner (System.in);
	    
	    //Código abaixo não funciona
/*	    Integer senha = 0;
	    do{
	      
	      System.out.println("Digite a senha");
	      senha = sc.nextInt();
	      
	      System.out.println("Acesso Negado");
	      
	    } while (senha!=1234);
	   
	    if (senha==1234)
	        System.out.println("Acesso Permitido");
*/	    
	    //Código abaixo funciona
	    System.out.println("Digite a senha");
	    String Senha = sc.next();
	    
	    if(Senha.equals("1234")){
	    	System.out.println("Acesso Permitido");
	    }else {
	    	System.out.println("Acesso Negado");
	    }

	}

}
