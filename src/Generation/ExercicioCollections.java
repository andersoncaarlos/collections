package Generation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCollections {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> cores = new ArrayList<>();
		
		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {
			String cor = sc.nextLine();
			cores.add(cor);			
		}
		
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		
		
		sc.close();
	}

}
