package Lista7;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> nome = new ArrayList<String>();
		
		System.out.println("Digite 5 nomes");
		for(int i = 1; i<=5;++i)
			nome.add(sc.next());	
    
	   ListIterator li = nome.listIterator(nome.size());

	   while(li.hasPrevious()) {
	   System.out.println(li.previous());
	 }
		
/*	    //Percorrendo o array mostrando a posição
		Integer i = 1;
	    for (String n: nome) {
	      System.out.printf("Posição %d- %s\n", i, n);
	      i++;
	    }

        //Percorrendo o array ao contrário (não funciona)   
		for(Integer i = nome.size(); i>0;i--)
		System.out.println(nome.get(i));
*/		
	}

}
