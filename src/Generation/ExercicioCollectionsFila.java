package Generation;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioCollectionsFila {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Queue<String> atendimento = new LinkedList<>();
		
		
		int op;
		
		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("\t\tMenu de Agendamento");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar Todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("\n------------------------------------------------------------------");
			System.out.print("\nEntre com a opção desejada: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("\nDigite o nome: ");
				atendimento.add(sc.nextLine());
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				System.out.println("\nLista de Clientes na Fila: \n");
				for (String cliente : atendimento) {
					System.out.println(cliente);
				}
				break;
			case 3:
				sc.nextLine();
				if (atendimento.isEmpty()) {
					System.out.println("A Fila Está Vazia! ");
				}
				else {
				System.out.println("\nO Cliente foi Chamado! : ");
				}
				break;			
			}
			
			
			
		} while (op != 0);
		
		System.out.println("Programa Finalizado com Sucesso!");
		
		sc.close();

	}

}
