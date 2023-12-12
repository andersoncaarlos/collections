package Generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCollections3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Integer> numeros = new ArrayList<>();
		
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
		boolean verificador = false;
		
		for (int i = 0; i < numeros.size(); i++) {
			if (n == numeros.get(i)) {
				verificador = true;
				System.out.println("O numero " + n + " está localizado na posição " + i);
			}
		}	
		if (verificador == false) {
			System.out.println("O numero " + n + " não foi encontrado!");	
		} 
	
		
		sc.close();

	}

}
