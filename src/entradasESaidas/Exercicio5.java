package entradasESaidas;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double n1,n2,n3,media;
		
		System.out.println("Digite o valor da primeira nota: ");
		n1 = s.nextDouble();
		
		System.out.println("Digite o valor da segunda nota: ");
		n2 = s.nextDouble();
		
		System.out.println("Digite o valor da terceira nota: ");
		n3 = s.nextDouble();
		
		media = ((n1*2)+(n2*3)+(n3*5))/10;

		System.out.printf("Media ponderada do aluno: %.2f",media);
	}

}
