package filaPilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();
		int opcao;
		do {
			//criando menu
			System.out.println("***************************");
			System.out.println("\n1 - Adicionar livros na Pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair\n");
			System.out.println("***************************");
			System.out.println("Entre com a opção desejada: ");
			opcao = s.nextInt();
			
			switch(opcao) {
			//adicionando livros
			case 1:
				s.nextLine();
				System.out.println("Digite o nome: ");
				String nomeLivro = s.nextLine();
				livros.push(nomeLivro);
				System.out.println("Livro adicionado!\n");
			break;
			
			//listando os livros
			case 2:
				System.out.println("Lista de Livros na pilha:\n");
				for(Iterator<String> it = livros.iterator(); it.hasNext();) {
					System.out.println(it.next());
				}
			break;
			
			//verificando a pilha e retirando livros
			case 3:
				if(livros.isEmpty()== true) {
					System.out.println("A pilha está vazia!");
				}
				else {
					System.out.printf("O livro %s foi retirado da pilha\n",livros.peek());
					livros.pop();
					System.out.println("Pilha:");
					//mostrando a pilha com iterator local
					for(Iterator<String> it = livros.iterator(); it.hasNext();) {
						System.out.println(it.next());
					}
				System.out.println();
				}
			break;
			
			case 0:
				System.out.println("Programa Finalizado!");
			break;
			
			default:
				System.out.println("Opção inválida!!");
			}
			
		}while(opcao !=0);
		
	}

}
