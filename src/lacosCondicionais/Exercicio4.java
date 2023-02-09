package lacosCondicionais;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String c1,c2,c3;
		
		System.out.println("Digite a primeira característica: ");
		c1 = s.next();
		
		System.out.println("Digite a segunda característica: ");
		c2 = s.next();
		
		System.out.println("Digite a terceira característica: ");
		c3 = s.next();
		
		//if caraterística 1
		if(c1.equalsIgnoreCase("vertebrado")) {
			
			//segunda caracteristica
			if(c2.equalsIgnoreCase( "ave")) {
				
				//terceira caracteristica
				if(c3.equalsIgnoreCase("carnivoro")) {
					System.out.println("Águia");
				}
				else {
					System.out.println("Pomba");
				}
			}
			
			//else segunda caracteristica
			else {
				//terceira caracteristica
				if(c3.equalsIgnoreCase("onivoro")) {
					System.out.println("Homem");
				}
				else {
					System.out.println("Vaca");
				}
			}
		}
		
		//elif caracteristica 1
		else if(c1.equalsIgnoreCase("invertebrado")){
			//segunda caracteristica
			if(c2.equalsIgnoreCase("inseto")) {
				//terceira caracteristica
				if(c3.equalsIgnoreCase("hematofago")) {
					System.out.println("Pulga");
				}
				else{
					System.out.println("Lagarta");
				}
			}
			//else segunda caracteristica
			else {
				if(c3.equalsIgnoreCase("hematofago")) {
					System.out.println("Sanguessuga");
				}
				else{
					System.out.println("Minhoca");
				}
			}
		}
		
		//else caracteristica 1
		else {
			System.out.println("Característica inválida.");
		}

	}
}

