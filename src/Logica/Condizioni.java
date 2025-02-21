package Logica;

public class Condizioni {

	public static void main(String[] args) {

		int myVal = 5;

		if (myVal < 10) { // Inizio blocco condizionale esterno if
			System.out.println("La variabile myVal è inferiore alla condizione e vale: " + myVal);
			myVal = 20;

			if (myVal != 20)// Inizio blocco condizionale interno if
				System.out.println("La variabile myVal è cambiata di valore. Ora vale 20!");

			else // Costrutto else senza parentesi graffe, possibile con una sola istruzione
				System.out.println("La variabile myVal non può essere 20! Sei nel blocco else!");
		} // Fine blocco if esterno

		else { // Blocco else esterno, fa riferimento all'opposto del primo blocco if
			System.out.println("La variabile myVal non può essere ≥ 10! Sei nel blocco else esterno!");
		}

		System.out.println("Codice eseguito dopo i blocchi condizionali");

		// Modifichiamo a piacere il valore della variabile per vedere in quale
		// costrutto condizionale ricade
		String yourName = "Filippo";

		if (yourName == "Alfonso")
			System.out.println("Ciao Alfonso!");

		else if (yourName == "Gianpiero")
			System.out.println("Ciao Gianpiero!");

		else if (yourName == "Marco") {
			System.out.println("Ciao Marco!");

		} else {
			System.out.println("Neanche Marco ti chiami? Forse mi sto confondendo con qualcun altro.");
		}

		// --- Switch case

		String fruit = "Cocomero"; // Prova tutti i valori dei case, o anche altri che non esistono

		switch (fruit) { // Confrontiamo il valore della variabile fruit con i seguenti case

		case "Mela": // Primo confronto
			System.out.println("Il valore di fruit è Mela");
			break; // Se il valore di fruit == "Mela", il codice uscirà dallo switch.

		case "Pesca": // Secondo confronto
			System.out.println("Il valore di fruit è Pesca");
			break; // Se il valore di fruit == "Pesca", il codice uscirà dallo switch.

		// Il primo modo per attivare delle istruzioni è definire più case, e le
		// istruzioni e il break sono all'ultima
		case "Banana":
		case "Avocado":
		case "Mango":
		case "Fragola":
		case "Papaya":
			System.out.println("Il valore di fruit è un frutto tropicale");
			break;

		// Case constant list
		// Il secondo modo per è definire un unico case con più valori da confrontare
		// separati da virgole
		case "Lamponi", "Fragoline di bosco", "Mirtilli":
			System.out.println("Il valore di fruit è un frutto di bosco");
			break;

		default: // Opzionalmente possiamo aggiungere un caso base
			System.out.println("Il valore di fruit non è tra i casi previsti");
			break; // Quest'ultimo break è opzionale

		// NON È CONSIGLIATO INSERIRE ALTRI CASI DOPO IL DEFAULT, ma si potrebbe fare.
		case "Anguria":
			fruit = "Mela";
			break;
		}

		System.out.println("Siamo fuori dallo switch");
		System.out.println("Il valore finale della variabile fruit è: " + fruit);

		// -- Switch expression

		int x = 20;

		String number = switch (x) {
		case 10 -> "Dieci";
		case 20 -> "Venti";
		default -> {
			System.out.println("Opzione di default.");
			yield "Qualsiasi altro valore";
		}
		};

		System.out.println(number);

		// --- Labeled Statement

		// -- Esempio con costrutto if
		int numero = 10;

		controllo: { // Etichetta per il blocco di codice
			if (numero % 2 == 0) {
				System.out.println("Il numero è pari.");
				break controllo; // Esce dal blocco 'controllo'
			}
			System.out.println("Questo messaggio non verrà mai stampato.");
		}

		System.out.println("Fine del programma.");

		// -- Esempio con switch

		int valore = 3;

		elaborazione: {
			System.out.println("Inizio elaborazione...");

			switch (valore) {
			case 1:
				System.out.println("Caso 1");
				break;
			case 2:
				System.out.println("Caso 2");
				break;
			case 3:
				System.out.println("Caso 3, uscita dall'intero blocco elaborazione.");
				break elaborazione; // Esce dall'intero blocco
			default:
				System.out.println("Caso di default");
			}

			System.out.println("Questa parte non viene eseguita se valore = 3.");
		}

		System.out.println("Elaborazione terminata.");
	}
}
