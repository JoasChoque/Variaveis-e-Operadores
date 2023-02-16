package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		//Lendo o Set
		for(int i=0;i<10;i++) {
			System.out.println("Digite um número");
			int n= s.nextInt();
			//Adicionando os números no set
			numeros.add(n);
		}
		
		//Criando o iterator
		Iterator<Integer> it = numeros.iterator();
		
		//Mostrando os números adicionador (iterator)
		System.out.println("Listar dados do Set: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
