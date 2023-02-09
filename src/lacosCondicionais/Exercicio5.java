package lacosCondicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int cod,qtd;
		double total=0;
		String prod="";
		
		//Menu
		System.out.println("=-=-=-=-=-=Produtos:=-=-=-=-=-=");
		System.out.println("1 - Cachorro quente (R$10,00)");
		System.out.println("2 - Salada (R$15,00)");
		System.out.println("3 - X-Bacon (R$18,00)");
		System.out.println("4 - Bauru (R$12,00)");
		System.out.println("5 - Refrigerante (R$8,00)");
		System.out.println("6 - Suco de Laranja (R$13,00)");
		
		System.out.println("\nDigite o código do produto: ");
		cod = s.nextInt();
		
		System.out.println("Digite a quantidade desejada:");
		qtd = s.nextInt();
		
		switch(cod){
		 	case 1:
		 		total = qtd*10;
		 		prod = "Cachorro Quente";
		 	break;
		 	
		 	case 2:
		 		total = qtd*15;
		 		prod = "X-Salada";
		 	break;
		 	
		 	case 3:
		 		total = qtd*18;
		 		prod = "X-Bacon";
		 	break;
		 	
		 	case 4:
		 		total = qtd*12;
		 		prod = "Bauru";
		 	break;
		 	
		 	case 5:
		 		total = qtd*8;
		 	break;
		 	
		 	case 6:
		 		total = qtd*13;
		 	break;
		 	
		 	default:
		 		System.out.println("Opção inválida!");
		}
		System.out.println("Produto: "+prod);
		System.out.printf("O valor do preço total é de R$%.2f",total);

	}

}
