package exerciciosExtrasRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n,soma=0,qtd=0,media;
		
		do {
			System.out.println("Digite um número: ");
			n = s.nextInt();
			
			if(n%3==0 && n!=0) {
				soma+=n;
				qtd++;
			}
		}while(n!=0);
		
		media = soma/qtd;
		
		System.out.println("Média dos números múltiplos de 3: "+media);
	}

}
