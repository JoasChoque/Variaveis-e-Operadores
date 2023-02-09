package lacosCondicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String nome,cargo="";
		int cod;
		double sal,nsal=0;
		
		System.out.println("Digite o nome do Colaborador: ");
		nome = s.nextLine();
		
		System.out.println("Qual o código do cargo? ");
		System.out.println("1 - Gerente");
		System.out.println("2 - Vendedor");
		System.out.println("3 - Supervisor");
		System.out.println("4 - Motorista");
		System.out.println("5 - Estoquista");
		System.out.println("6 - Técnico de TI");
		cod = s.nextInt();
		
		System.out.println("Digite o salário do Colaborador: ");
		sal = s.nextDouble();
		
		switch(cod) {
		case 1:
			cargo = "Gerente";
			nsal = sal+(sal * 0.10);
		break;
		
		case 2:
			cargo = "Vendedor";
			nsal = sal+(sal * 0.07);
		break;
		
		case 3:
			cargo = "Supervisor";
			nsal = sal+(sal * 0.09);
		break;
		
		case 4:
			cargo = "Motorista";
			nsal = sal+(sal * 0.06);
		break;
		
		case 5:
			cargo = "Estoquista";
			nsal = sal+(sal * 0.05);
		break;
		
		case 6:
			cargo = "Técnico de TI";
			nsal = sal+(sal * 0.08);
		break;
		
		default:
			System.out.println("Código de colaborador inválido!!");
			
		}
		System.out.println("Nome do colaborador: "+nome);
		System.out.println("Cargo: "+cargo);
		System.out.printf("Salário: R$%.2f",nsal);
		
	}

}
