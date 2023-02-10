package lacosRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n1,n2,i;
		
		System.out.println("Digite o primeiro número: ");
		n1 = s.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = s.nextInt();
		
		if(n1<n2) {
			for(i=n1;i<=n2;i++) {
				if(i%3 == 0 && i%5==0) {
					System.out.printf("%d é múltiplo de 3 e 5\n",i);
				}
			}
		}
		else {
			System.out.println("Intervalo inválido!");
		}

	}

}
