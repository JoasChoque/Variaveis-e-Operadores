package entradasESaidas;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double cf,pd,i,cc;
		
		System.out.println("Digite o valor de custo de fabrica: ");
		cf = s.nextDouble();
		
		pd = cf * 0.28;
		i = cf * 0.45;
		cc = cf + pd + i;
		
		System.out.printf("O custo ao consumidor eh de R$%.2f",cc);
	}

}
