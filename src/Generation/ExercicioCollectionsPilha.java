package Generation;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioCollectionsPilha {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<>();
		
		int op;
		
		do {
			System.out.println("---------------------------------------------------------");
			System.out.println("\n\t\tMenu de Agendamento");
			System.out.println("\n1 - Adicionar Livro na Pilha");
			System.out.println("2 - Listar Todos os Livros");
			System.out.println("3 - Retirar Livro da Pilha");
			System.out.println("0 - Sair");
			System.out.println("\n---------------------------------------------------------");
			System.out.println("\nEntre com a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("\nDigite o nome: ");
				pilha.push(sc.nextLine());
				System.out.println("Pilha: ");
				for (String livro : pilha) {
					System.out.println(livro);
				}
				System.out.println("\nLivro adicionado! ");
				break;
			case 2:
				System.out.println("\nLista de Livros na Pilha: ");
				for (String livro : pilha) {
					System.out.println(livro);
				}
				break;
			case 3:
				sc.nextLine();
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha Está Vazia!");
				}
				else {
					pilha.pop();
					for (String livro : pilha) {
						System.out.println(livro);
					}
					System.out.println("\nUm Livro foi Retirado da Pilha!");
				}
				break;			
			}
			
			
			
		} while (op != 0);
		
		System.out.println("Programa Finalizado! ");
		
		sc.close();

	}

}
