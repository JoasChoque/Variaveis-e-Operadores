package vetoresAndMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] numeros= new int[10];
		String impares="",pares="";
		int i,soma=0;
		float qtd,somaF;
	
		//Lendo e armazenando valores no vetor
		for(i=0;i<numeros.length;i++) {
			System.out.println("Digite o número da posição "+i);
			numeros[i]= s.nextInt();
			
			//somando os valores:
			soma+=numeros[i];
		}
		
		
		for(i=0;i<numeros.length;i++) {
			
			//Indices impares
			if(i%2!=0) {
				impares += numeros[i]+" ";
			}
			
			//Elementos pares
			if(numeros[i]%2==0) {
				pares += numeros[i]+" ";
			}
		}
		
		System.out.printf("Números nos índices ímpares: \n"+impares);
		System.out.println("Elementos pares: \n"+pares);
		System.out.println("Soma: "+soma);
	}

}
