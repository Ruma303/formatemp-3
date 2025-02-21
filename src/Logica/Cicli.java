package Logica;

public class Cicli {

	public static void main(String[] args) {

		// --- while

		int count = 1;
		System.out.println("Cicli while\n");
		
		while (count <= 10) {
			// Istruzioni da eseguire nel ciclo
			System.out.println("Istruzione numero: " + count);
			count++;
		}

		System.out.println("Siamo fuori dal ciclo while. Yuppie! Non si è buggato tutto!\n");

		
		
		// --- do while

		int count1 = 10;
		System.out.println("Cicli do while\n");
		
		do { // Queste istruzioni verranno eseguite almeno una volta in ogni caso
			System.out.println("Valore count down: " + count1);
			count1--;
		} while (count1 >= 5);

		System.out.println("Siamo fuori dal ciclo do while. Yuppie! Non si è buggato tutto!\n");

		

		// --- for

		// In questo ciclo mostriamo solo numeri pari da 0 a 10
		System.out.println("Cicli for\n");
		for (int i = 2; i <= 20; i += 2) {
			if (i == 6) continue;
			if (i == 16) break;
			System.out.println("Valore della variabile contatore i: " + i);
		}
		
		System.out.println("\n");

		
		
		// --- for each

		System.out.println("Cicli for each\n");
		String[] myArray = new String[] { "Maria", "Juan", "Pedro", "Ana", "Luis" };

		for (String element : myArray) {
			System.out.println("Valore attuale dell'elemento: " + element);
		}
		System.out.println("\n");
		
		
		
		// --- Labeled loops
		
		System.out.println("Cicli labeled loops\n");
		System.out.println("Inizio ciclo esterno\n");

		OUTER_LABEL: for (int i = 0; i < 10; i++) { // Inizio ciclo esterno
			System.out.println("Ciclo esterno -> i = " + i);

			INNER_LABEL: for (int k = 0; k <= 10; k++) { // Inizio ciclo interno
				System.out.println("\t Ciclo interno -> k = " + k);

				if (i == 2)
					break OUTER_LABEL; // Se i è uguale a 2, usciamo da entrambi i cicli

				if (k == 2) { // Se k è uguale a 2, usciamo solo dal ciclo interno
					System.out.println("Usciamo dal ciclo interno.");
					break INNER_LABEL;
				}
			} // Fine ciclo interno

			System.out.println("Fine iterazione ciclo esterno: " + i + "\n");
		} // Fine ciclo esterno

		System.out.println("\nSei fuori dal ciclo esterno...");
	}

}
