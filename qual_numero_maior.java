package cursojava;

import java.util.Scanner;

public class qual_numero_maior {
	public static void main (String srgs[]) {
		
		int num1,num2,num3;
		Scanner numero = new Scanner (System.in);
		
			System.out.printf("Digite o numero 1: ");
			num1 = numero.nextInt();
			System.out.printf("Digite o numero 2: ");
			num2 = numero.nextInt();
			System.out.printf("Digite o numero 3: ");
			num3 = numero.nextInt();
			
			if(num1 > num2 && num1 > num3) {
				System.out.printf("o numero 1 è maior");
			}
			else if(num2 > num1 && num2 > num3) {
				System.out.printf("o numero 2 è maior");
			}
			else {
				System.out.printf("o numero 3 è maior");
			}
		
		
		
		
		
		
	}

}
