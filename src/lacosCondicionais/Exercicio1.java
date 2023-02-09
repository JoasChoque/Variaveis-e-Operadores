package lacosCondicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Digite o valor de A: ");
		a = s.nextInt();
		
		System.out.println("\nDigite o valor de B: ");
		b = s.nextInt();
		
		System.out.println("\nDigite o valor de C: ");
		c = s.nextInt();
		
		if((a+b)>c) {
			System.out.println("A soma de A + B é Maior que C");
		}
		else if((a+b)==c) {
			System.out.println("A soma de A + B é Igual a C ");
		}
		else {
			System.out.println("A soma de A + B é Menor que C");
		}

	}

}
