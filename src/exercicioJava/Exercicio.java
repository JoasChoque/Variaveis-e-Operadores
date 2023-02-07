package exercicioJava;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		float salario,abono,novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = s.nextFloat();
		
		System.out.println("Digite o valor do abono:");
		abono = s.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Valor do novo salario: %.2f",novoSalario);
		
		//Exercicio 2
		float nota1,nota2,nota3,nota4,media;
		System.out.println("\n-=-=-= Exercicio 2 -=-=-=");
		
		System.out.println("Digite a nota 1: ");
		nota1 = s.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		nota2 = s.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		nota3 = s.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		nota4 = s.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Media do participante: %.1f",media);
		
		//Exercicio 3
		System.out.println("\n-=-=-= Exercicio 3 -=-=-=");
		float salarioBruto,descontos,horasExtras,adicional;
		float salarioLiquido;
		
		System.out.println("Digite o salário Bruto: ");
		salarioBruto = s.nextFloat();
		
		System.out.println("Digite o adicional Noturno: ");
		adicional = s.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		horasExtras = s.nextFloat();
		
		System.out.println("Digite os descontos: ");
		descontos = s.nextFloat();
		
		salarioLiquido = salarioBruto + adicional+ (horasExtras*5) - descontos;
		
		System.out.printf("Valor do salario liquido: %.2f",salarioLiquido);
		
		//Exercicio 4
		int n1,n2,n3,n4,dif;
		System.out.println("\n-=-=-= Exercicio 4 -=-=-=");
		
		System.out.println("Digite o primeiro numero: ");
		n1 = s.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = s.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		n3 = s.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		n4 = s.nextInt();
		
		dif = (n1*n2)-(n3*n4);
		
		System.out.println("Diferença: "+dif);
	}

	
}
