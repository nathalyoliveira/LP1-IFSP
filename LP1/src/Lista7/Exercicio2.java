package Lista7;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<String> nome = new ArrayList<String>();
		
		nome.add("Jo�o");
		nome.add("Maria");
		nome.add("Pedro");
		nome.add("Eduardo");
		nome.add("Ana");
		
		System.out.println("Nomes cadastrados:" + nome);
		System.out.println("\nDeseja excluir um nome? Indique a posi��o:");
		int i = sc.nextInt();
	
		try {
			nome.remove(i);
			System.out.println("Lista de nomes atualizada:" + nome);
		    } catch (IndexOutOfBoundsException e) {
		        System.out.printf("\nErro: posi��o inv�lida (%s).",
		          e.getMessage());
		    }
	}

}
