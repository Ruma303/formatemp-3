package Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new java.util.Scanner(System.in);

		System.out.println("Eseguiamo il la somma tra due numeri.\n");

		int n1, n2, sum;
		String s1;

		System.out.println("Digita un numero!");
		s1 = input.nextLine(); // Salviamo la stringa digitata in una variabile
		n1 = Integer.parseInt(s1); // Variante 1: Converte la stringa in un numero intero

		System.out.println("Digita un secondo numero!");
		// Variante 2: al posto di Integer.parseInt(s1)
		n2 = input.nextInt(); // convertiamo direttamente l'input in int
		input.nextLine(); // Dobbiamo però eliminare il carattere newline "\n" con il metodo nextLine()

		sum = n1 + n2;

		// Possiamo anche usare String.format() per salvare la stringa formattata
		// senza stamparla direttamente. Possiamo stamparla in un secondo momento.
		String output = String.format("La somma tra %d e %d è %d", n1, n2, sum);

		// Usiamo la stringa formattata per stampare l'output
		System.out.println(output);

		
		
		
		System.out.println("\n\n\nEseguiamo il ora la differenza tra due numeri.\n");

		long l1, l2, difference;

		System.out.println("Digita un numero!");
		// Variante 1: Converte la stringa in un numero long
		l1 = Long.parseLong(input.nextLine());

		System.out.println("Digita un secondo numero!");
		// Variante 2: al posto di Long.parseLong(input.nextLine())
		l2 = input.nextLong();
		input.nextLine();

		difference = l1 - l2;
		output = String.format("La differenza tra %d e %d è %d", l1, l2, difference);

		System.out.println(output);

		
		
		
		System.out.println("\n\n\nEseguiamo ora il prodotto tra due numeri.\n");

		double d1, d2, product;

		System.out.println("Digita un numero, anche con la virgola!");
		// Variante 1: Converte la stringa in un numero double
		d1 = Double.parseDouble(input.nextLine()); 

		System.out.println("Digita un secondo numero, anche con la virgola!");
		// Variante 2: al posto di Double.parseDouble(input.nextLine())
		d2 = input.nextDouble();
		input.nextLine();
		
		
		product = d1 * d2;
		// %.2f limita a 2 cifre decimali l'output finale
		output = String.format("Il prodotto tra %f e %f è %.2f", d1, d2, product);
		System.out.println(output.replace(".", ","));

		input.close(); // È buona pratica chiudere lo Scanner quando non serve più
	}

}
