package exerciciosExtrasRepeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n,soma=0;
		
		do {
			System.out.println("Digite um número:");
			n = s.nextInt();
			
			soma+=n;
		
		}while(n!=0);
		
		System.out.println("Soma dos números digitados: "+soma);
	}

}
