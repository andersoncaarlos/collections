package Generation;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollections4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>();
		
		numeros.add(2); 
		numeros.add(5); 
		numeros.add(1); 
		numeros.add(3); 
		numeros.add(4); 
		numeros.add(9); 
		numeros.add(7); 
		numeros.add(8); 
		numeros.add(10); 
		numeros.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		Integer n = sc.nextInt();

		if (numeros.contains(n)) {
			System.out.println("O número " + n + " foi encontrado!");
		}
		else {
			System.out.println("O número " + n + " não foi encontrado! ");
		}		
		
		sc.close();
	}

}
