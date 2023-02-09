package lacosCondicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = s.nextInt();
		
		//condicional par
		if(n%2==0) {
			if(n>0) {
				System.out.printf("O número %d é par e positivo",n);
			}
			else {
				System.out.printf("O número %d é par e negativo",n);
			}
		}
		
		//condicional ímpar
		else {
			if(n>0) {
				System.out.printf("O número %d é ímpar e positivo",n);
			}
			else {
				System.out.printf("O número %d é ímpar e negativo",n);
			}
		}
	}

}
