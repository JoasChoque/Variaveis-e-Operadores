package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		//adicionando valores;
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		//Lendo o valor a ser encontrado
		System.out.println("Digite o número que você deseja encontrar: ");
		int n= s.nextInt();
		
		//Verificando se o número esta dentro do array
		boolean verifica;
		verifica = numeros.contains(n);
		
		if(verifica == true) {
			System.out.printf("O número %d foi encontrado!",n);
		}
		else {
			System.out.printf("O número %d não foi encontrado!",n);
		}
	}

}
