package lacosCondicionais;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double saldo = 1000.00;
		int op;
		
		System.out.println("Sistema Bancário: ");
		System.out.println("Digite a código da operação: ");
		op = s.nextInt();
		
		switch(op) {
		//Saldo
		case 1:
			System.out.println("Operação - Saldo");
			System.out.println("Saldo: R$"+saldo);
		break;

		//Saque
		case 2:
			System.out.println("Operação - Saque: ");
			System.out.println("Digite o valor do Saque: ");
			double vs = s.nextDouble();
			
			if(vs>saldo) {
				System.out.println("Saldo insuficiente!");
			}
			else {
				System.out.println("Saque efetuado com sucesso!");
				System.out.println("Novo saldo: R$"+(saldo-vs));
			}
		break;
		
		//Depósito
		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Digite o valor do depósito: ");
			double vd = s.nextDouble();
			
			System.out.println("Depósito efetuado com sucesso!");
			System.out.println("Novo saldo: R$"+(saldo+vd));
			break;
			
		default:
			System.out.println("Operação inválida");
		}
		
			

	}

}
