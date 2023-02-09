package lacosCondicionais;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n1,n2;
		int op;
		
		System.out.println("Digite o primeiro número: ");
		n1 = s.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		n2 = s.nextDouble();
		
		System.out.println("Digite o código da operação matemática: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		op = s.nextInt();
		
		switch(op) {
		case 1:
			System.out.printf("%.1f + %.1f = %.1f",n1,n2,(n1+n2));
		break;
		
		case 2:
			System.out.printf("%.1f - %.1f = %.1f",n1,n2,(n1-n2));
		break;
		
		case 3:
			System.out.printf("%.1f * %.1f = %.1f",n1,n2,(n1*n2));
		break;
		
		case 4:
			System.out.printf("%.1f / %.1f = %.1f",n1,n2,(n1/n2));
		break;
		
		default:
			System.out.println("Operação inválida!");
		}
	}

}
