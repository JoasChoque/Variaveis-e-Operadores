package exerciciosExtrasRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int qtdP=0,qtdI=0,num;
		
		for(int i=1;i<=10;i++) {
			System.out.println("\nDigite um número:");
			num = s.nextInt();
			
			if(num%2==0) {
				qtdP++;
			}
			else {
				qtdI++;
			}
		}
		
		System.out.println("Quantidade de números Pares: "+qtdP);
		System.out.println("Quantidade de número Ímpares: "+qtdI);

	}

}
