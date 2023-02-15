package vetoresAndMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int listaDeNumeros[]= {2,5,1,3,4,9,7,8,10,6};
		int num,i,aux=-1;
		
		
		System.out.println("Digite um número para verificar sua posição: ");
		num = s.nextInt();

		for(i=0;i<listaDeNumeros.length;i++) {
			if(num == listaDeNumeros[i]) {
				aux =i;
			}
		}
		
		if(aux!=-1) {
			System.out.printf("O número %d está localizado na posição: %d",num,aux);
		}
		else {
			System.out.printf("O número %d não foi encontrado",num);
		}
		
		

	}

}
