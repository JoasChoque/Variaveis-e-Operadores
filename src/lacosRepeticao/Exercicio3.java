package lacosRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i,idade,cont21=0,cont50=0;
		
		System.out.println("Digite uma idade:");
		idade = s.nextInt();
		
		while(idade>0) {
			if(idade<21) {
				cont21++;
			}
			else if(idade>50){
				cont50++;
			}
			System.out.println("Digite uma idade:");
			idade = s.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: "+cont21);
		System.out.println("Total de pessoas maiores de 50 anos: "+cont50);

	}

}
