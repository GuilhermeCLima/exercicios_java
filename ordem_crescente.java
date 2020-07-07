package cursojava;

import java.util.Scanner;

public class ordem_crescente {
	public static void main(String args[]) {
		
		Scanner numero = new Scanner(System.in);
		int a,b,c,numTroca;
		
		System.out.printf("Digite o numero 1: ");// 7
		a = numero.nextInt();
		System.out.printf("Digite o numero 2: ");//8
		b = numero.nextInt();
		System.out.printf("Digite o numero 3: ");//9
		c = numero.nextInt();

	if((a>=b)&&(b>=c)) {
		numTroca = a;
	    a = b;
	    b = numTroca;
	    System.out.println(" ordem crescente dos numeros = " + c +"-" + a + "-" + b);  
	 }
	else if((b>=a)&&(a>=c)) {
		numTroca = b;
	    b = a;
	    a = numTroca;
	    System.out.printf(" ordem crescente dos numeros = "+ c +"-" + b + "-" + a);  
	 }
	else if((c>=a)&&(b>=a)) {
		numTroca = c;
	    c = a;
	    a = numTroca;
	    System.out.printf(" ordem crescente dos numeros = "+ c +"-" + b + "-" + a);  
	 }
	else if((c>=a)&&(a>=b)) {
		numTroca = a;
		a = b;
		b = numTroca;
		System.out.printf(" ordem crescente dos numeros = "+ a +"-" + b + "-" + c); 
	}
	 }

	}
