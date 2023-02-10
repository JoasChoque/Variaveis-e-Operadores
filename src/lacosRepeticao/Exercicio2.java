package lacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n,i,contp=0,conti=0;
		
		for(i=1;i<=10;i++) {
			System.out.printf("Digite o %dº número: ",i);
			n = s.nextInt();
			
			if(n%2==0) {
				contp++;
			}
			else {
				conti++;
			}
		}
		
		System.out.println("Total de números pares: "+contp);
		System.out.println("Total de números ímpares: "+conti);
		

	}

}
