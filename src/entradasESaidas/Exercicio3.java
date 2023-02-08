package entradasESaidas;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int duracao,hora,minuto,segundo;
		
		System.out.println("Digite a duracao do evento: \n");
		duracao = s.nextInt();
		
		hora = duracao/3600;
		minuto = (duracao%3600)/60;
		segundo = (duracao%3600)%60;
		
		System.out.printf("Tempo formatado: %d horas %d minutos e %d segundos",hora,minuto,segundo);

	}

}
