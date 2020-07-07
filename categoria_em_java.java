package cursojava;

import java.util.Scanner;

public class categoria_em_java {
	public static void main(String args[]) {

		Scanner numero = new Scanner(System.in);

		int idade;
		System.out.printf("Digite sua idade: ");
		idade = numero.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			
			System.out.printf("Sua categoria é infantil");
		}
		if(idade >= 15 && idade <= 17) {
			
			System.out.printf("Sua categoria é juvenil");
		}
		if(idade >= 18 && idade <= 25) {
			
			System.out.printf("Sua categoria é adulto");
		}
	
		
		
}
}
