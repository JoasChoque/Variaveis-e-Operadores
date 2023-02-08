package entradasESaidas;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Digite o coeficiente A:");
		a = s.nextDouble();
		
		System.out.println("Digite o coeficiente B:");
		b = s.nextDouble();
		
		System.out.println("Digite o coeficiente C:");
		c = s.nextDouble();
		
		System.out.println("Digite o coeficiente D:");
		d = s.nextDouble();
		
		System.out.println("Digite o coeficiente E:");
		e = s.nextDouble();
		
		System.out.println("Digite o coeficiente F:");
		f = s.nextDouble();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		
		System.out.println("Valor de X: "+x);
		System.out.println("Valor de Y: "+y);
	}

}
