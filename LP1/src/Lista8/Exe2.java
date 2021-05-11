package Lista8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int x;
		try {
			x = sc.nextInt();
			System.out.println(x);
		}
		catch(InputMismatchException e){
			System.out.println("Digite um número:");
		}


	}

}
