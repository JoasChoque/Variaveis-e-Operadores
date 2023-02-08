package entradasESaidas;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double x1,y1,x2,y2,distancia;
		
		System.out.println("Digite o valor de x do primeiro ponto:");
		x1 = s.nextDouble();
		
		System.out.println("Digite o valor de y do primeiro ponto: ");
		y1 = s.nextDouble();
		
		System.out.println("Digite o valor de x do segundo ponto:");
		x2 = s.nextDouble();
		
		System.out.println("Digite o valor de y do segundo ponto: ");
		y2 = s.nextDouble();
		
		double parte1,parte2;
	
		parte1 = Math.pow((x2-x1),2);
		parte2 = Math.pow((y2-y1),2);
		
		distancia = Math.sqrt(parte1+parte2);
		
		System.out.printf("A distancia entre os dois pontos eh de: %.2f",distancia);

	}

}
