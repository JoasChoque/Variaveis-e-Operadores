package filaPilha;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
		
		do {
			//criando menu
			System.out.println("***************************");
			System.out.println("\n1 - Adicionar Clientes na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair\n");
			System.out.println("***************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = s.nextInt();
			
			//trabalhando com as opcoes
			switch(opcao) {
			
			//adicionar clientes na fila
			case 1:
				s.nextLine();
				System.out.println("Digite o nome: ");
				String nome = s.next();
				fila.add(nome);
				System.out.println("\nCliente adicionado!\n");
			break;
			
			case 2:
				s.nextLine();
				System.out.println("Lista de Clientes na lista: \n");
				//imprimindo lista usando iterator local
				for(Iterator<String> it = fila.iterator(); it.hasNext();) {
					System.out.println(it.next());
				}
			break;
			
			case 3:
				s.nextLine();
				//verificando se a fila está vazia
				if(fila.isEmpty()==true) {
					System.out.println("A fila está vazia\n");
				}
				else {
					System.out.printf("O(A) cliente %s foi chamado(a)!\n",fila.poll());
					System.out.println("Fila: \n");
					//imprimindo lista usando iterator local
					for(Iterator<String> it = fila.iterator(); it.hasNext();) {
						System.out.println(it.next());
						
					}
					System.out.println();
				}
			break;
			
			case 0:
				s.nextLine();
				System.out.println("Programa Finalizado!");
			break;
				
				default:
					System.out.println("Opção inválida!");
			}
			
		}while(opcao!=0);

	}

}