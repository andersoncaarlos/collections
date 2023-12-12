package Generation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class ExercicioCollections2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		System.out.println("Digite 10 números inteiros: ");
		for (int i = 0; i < 10; i++) {
			Integer n = sc.nextInt();
			set.add(n);
		}
		
		Iterator<Integer> iSet = set.iterator();
		
		while (iSet.hasNext()) {
			System.out.println(iSet.next());
		}
		
		
		sc.close();
	}

}
