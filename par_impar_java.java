package cursojava;

import java.util.Scanner;

public class par_impar_java {

	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);

		double num,raiz,quad;
		System.out.printf("Digite um numero: ");
		num = numero.nextDouble();

		if (num % 2 == 0) {
			
			raiz = Math.sqrt(num);
			System.out.println("Seu numero � par e a raiz dele �:" + raiz);
		}
		 if (num % 2 == 1) {
			 
			 quad = Math.pow(num, 2);
			System.out.println("Seu numero � impar e a pot�ncia dele �: " + quad);
	}
}
}
