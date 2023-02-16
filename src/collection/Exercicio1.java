package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//criar ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		
		//leitura da Array
		for(int i=0;i<5;i++) {
			System.out.println("Digite a cor número "+(i+1)+":");
			String cor = s.next();
			cores.add(cor);
		}
		
		Iterator<String> iterator = cores.iterator();
		
		//Listando as cores:
		System.out.println("\nListar todas as cores:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//Listando as cores em ordem:
		Collections.sort(cores);
		System.out.println("Cores ordenadas: ");
		System.out.println("\n"+cores);
		

	}

}
