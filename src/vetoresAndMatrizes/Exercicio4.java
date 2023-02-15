package vetoresAndMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float notas[][] = new float[10][4];
		int linhas,colunas;
		
		for(linhas=0;linhas<notas.length;linhas++) {
			for(colunas=0;colunas<notas[colunas].length;colunas++) {
				System.out.printf("Digite um número para a posição [%d][%d]",linhas,colunas);
				notas[linhas][colunas]=s.nextFloat();
			}
		}
		
		
		
		

	}

}
