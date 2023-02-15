package vetoresAndMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int numeros[][] = new int[3][3];
		int linha,coluna,somaDiagonalPrincipal=0,somaDiagonalSecundaria=0;
		String valoresDiagonalPrincipal="",valoresDiagonalSecundaria="";
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("Digite um numero na posição [%d][%d]: ",linha,coluna);
				numeros[linha][coluna] = s.nextInt();
				
				if(linha==coluna) {
					valoresDiagonalPrincipal+=numeros[linha][coluna]+" ";
					somaDiagonalPrincipal+= numeros[linha][coluna];
				}
				if(linha+coluna == 2) {
					valoresDiagonalSecundaria+=numeros[linha][coluna]+" ";
					somaDiagonalSecundaria+= numeros[linha][coluna];
				}
			}
		}
		
		System.out.println("Elementos da diagonal principal: \n"+valoresDiagonalPrincipal);
		System.out.println("Elementos da diagonal secundária: \n"+valoresDiagonalSecundaria);
		System.out.println("Soma dos elementos da diagonal principal: \n"+somaDiagonalPrincipal);
		System.out.println("Soma dos elementos da diagonal secundária: \n"+somaDiagonalSecundaria);
		

	}

}
