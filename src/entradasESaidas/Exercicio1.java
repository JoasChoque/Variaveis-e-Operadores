package entradasESaidas;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int ano,meses,dias,diasT;
		
		System.out.println("Conversor de idade: \n");
		
		System.out.println("Quantos anos voce tem?\n");
		ano = s.nextInt();
		
		System.out.println("Quantos meses voce tem?\n");
		meses= s.nextInt();
		
		System.out.println("Quantos dias voce tem?\n");
		dias = s.nextInt();
		
		diasT = (ano*365)+(meses*30)+dias;
		
		System.out.printf("Voce tem %d dias de vida",diasT);
	}

}