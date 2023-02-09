package lacosCondicionais;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int idade;
		boolean doacao;
		String nome;
		
		System.out.println("Digite o nome do doador: ");
		nome = s.nextLine();
		
		System.out.println("Digite a idade do doador: ");
		idade = s.nextInt();
		
		System.out.println("Primeira doação de sangue? (true/false)");
		doacao = s.nextBoolean();
		
		//if verifica idade
		if(idade>=18 && idade <=69) {	
			
			//if 60 a 69 anos
			if(idade>=60 && idade <=69) {
				
				//if primeira doacao
				if(doacao==true) {
					System.out.printf("%s não está apto(a) para doar sangue!",nome);
				}
				//else primeira doacao
				else {
					System.out.printf("%s está apto(a) para doar sangue!",nome);
				}
			}
			//else 60 a 69 anos
			else {
				System.out.printf("%s está apto(a) para doar sangue!",nome);
			}
			
		}
		
		//else verifica idade
		else {
			System.out.printf("%s não está apto(a) para doar sangue!",nome);
		}

	}

}
