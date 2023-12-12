package Generation;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Queue<String> agenda = new LinkedList<>();
		
		int op;
		
		do {
			System.out.println("----------------------------------");
			System.out.println("\t\tMenu de Agendamento");
			System.out.println("\n(1) Adicionar Agedamento?");
			System.out.println("(2) Mostrar Agenda?");
			System.out.println("(3) Pesquisar Agendamento?");
			System.out.println("(4) Agendamento concluido?");
			System.out.println("(0) Sair?");
			System.out.println("-----------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				sc.nextLine();
				System.out.println("\nDigite o nome: ");
				agenda.add(sc.nextLine());
				break;
			case 2:
				System.out.println("\nNomes agendados: ");
				System.out.println(agenda);
				break;
			case 3:
				sc.nextLine();
				System.out.println("\nDigite o nome para pesquisa: ");
				System.out.println(agenda.contains(sc.nextLine()));
				break;
			case 4:
				sc.nextLine();
				System.out.println("\nNome: " + agenda.remove() + " atendimento concluído");
				break;
			
			}
			
			
			
		} while (op != 0);
				
		sc.close();

	}

}
