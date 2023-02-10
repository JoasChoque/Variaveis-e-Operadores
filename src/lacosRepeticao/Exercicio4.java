package lacosRepeticao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int idade,sexo,cat,cont1=0,cont2=0,cont3=0,cont4=0;
		String escolha="s";
		
		/*System.out.println("Digite a idade: ");
		idade = s.nextInt();
		
		System.out.println("Digite o sexo: ");
		System.out.println("1-Masculino\n2-Feminino\n3-Outros");
		sexo = s.nextInt();
		
		System.out.println("Digite a categoria: ");
		System.out.println("1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
		cat = s.nextInt();*/
		
		/*System.out.println("Deseja continuar? S/N");
		escolha = s.next();*/
		
		/*if(cat == 1) {
			cont1++;
		}
		else if(cat == 2 && sexo == 2) {
			cont2++;
		}
		else if(cat == 3 && idade > 40){
			cont3++;
		}
		else if(cat == 4 && idade < 30) {
			cont4++;
		}*/
		
		while(escolha.equalsIgnoreCase("s")){
			System.out.println("Digite a idade: ");
			idade = s.nextInt();
			
			System.out.println("Digite o sexo: ");
			System.out.println("1-Masculino\n2-Feminino\n3-Outros");
			sexo = s.nextInt();
			
			System.out.println("Digite a categoria: ");
			System.out.println("1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
			cat = s.nextInt();
			
			System.out.println("Deseja continuar? S/N");
			escolha = s.next();
			
			if(cat == 1) {
				cont1++;
			}
			else if(cat == 2 && sexo == 2) {
				cont2++;
			}
			else if(cat == 3 && idade > 40){
				cont3++;
			}
			else if(cat == 4 && idade < 30) {
				cont4++;
			}
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+cont1);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+cont2);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: "+cont3);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+cont4);
	}

}
