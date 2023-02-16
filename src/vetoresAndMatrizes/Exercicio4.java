package vetoresAndMatrizes;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float notas[][] = new float[10][4];
		float media[] = new float[10];
		float soma=0;
		int linhas,colunas;
		
		//Lendo matriz
		for(linhas=0;linhas<notas.length;linhas++) {
			for(colunas=0;colunas<notas[colunas].length;colunas++) {
				System.out.printf("Digite um número para a posição [%d][%d]",linhas,colunas);
				notas[linhas][colunas]=s.nextFloat();
		}
	}
			//Criando vetor Média
		    for(int i=0;i<10;i++) {
		    	for(int j=0;j<4;j++) {
					media[i]+=notas[i][j];
				}
		    	
		    	media[i] = media[i]/4;
		    }
		    
		    for(int i=0;i<10;i++) {
		    	System.out.printf("\nMédia do aluno %d: %.1f\n",(i+1),media[i]);
		    }

	}

}
