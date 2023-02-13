package exerciciosExtrasRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int pessoas=0,idade,gen,cp;
		int cCalma=0,cMulheresNervosas=0,cHomensAgressivos=0,cOutrosCalmos=0,c40N=0,cCalma18=0;
		
		while(pessoas<150) {
			System.out.println("Digite sua idade: ");
			idade = s.nextInt();
			
			System.out.println("Identificação de Gênero: ");
			System.out.println("1 - feminino\n2 - masculino\n3 - Outros");
			gen = s.nextInt();
			
			System.out.println("Características Psicológicas");
			System.out.println("1 - Pessoa calma\n2 - Pessoa nervosa\n3 - Pessoa agressiva");
			cp = s.nextInt();
			
			if(cp==1) {
				cCalma++;
			}
			if(gen==1 && cp ==2) {
				cMulheresNervosas++;
			}
			if(gen==2 && cp==3) {
				cHomensAgressivos++;
			}
			if(gen==3 && cp==1) {
				cOutrosCalmos++;
			}
			if(idade>40 && cp==2) {
				c40N++;
			}
			if(idade<18 && cp==1) {
				cCalma18++;
			}
			pessoas++;
		}
		System.out.println("Número de pessoas calmas: "+cCalma);
		System.out.println("Número de mulheres nervosas: "+cMulheresNervosas);
		System.out.println("Número de homens agressivos: "+cHomensAgressivos);
		System.out.println("Número de outros calmos: "+cOutrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+c40N);
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+cCalma18);

	}

}
