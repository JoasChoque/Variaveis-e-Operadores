package entradasESaidas;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int idade,dias,meses,ano;
		
		System.out.println("Digite a sua idade em dias: \n");
		idade = s.nextInt();
		
		ano = idade/365;
		meses = (idade%365)/30; 
		dias = ((idade%365)%30); 
		
		System.out.printf("Voce tem %d anos, %d meses e %d dias",ano,meses,dias);
	}

}
