package Scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Eseguiamo il la somma tra due numeri.");
		
		int n1, n2, sum;
		String s1;
		
		System.out.println("Digita un numero!");
		s1 = input.nextLine(); // Salviamo la stringa digitata in una variabile
		n1 = Integer.parseInt(s1); // Converte la stringa in un numero intero
		
		System.out.println("Digita un secondo numero!");
		s1 = input.nextLine();
		n2 = Integer.parseInt(s1);
		
		sum = n1 + n2;
		
		// Possiamo anche usare String.format() per salvare la stringa formattata 
		// senza stamparla direttamente. Possiamo stamparla in un secondo momento.
        String output = String.format("La somma tra %d e %d è %d", n1, n2, sum);

        // Usiamo la stringa formattata per stampare l'output
        System.out.println(output);
        
        
        
        
        System.out.println("\nEseguiamo il ora la differenza tra due numeri.");
        
        long l1, l2, difference;
        
        System.out.println("Digita un numero!");
		// Possiamo direttamente inviare l'input della tastiera in questo metodo
        // senza salvare la stringa in una variabile. Risparmiamo un po' di memoria.
        l1 = Long.parseLong(input.nextLine()); 
        
        System.out.println("Digita un secondo numero!");
        l2 = Long.parseLong(input.nextLine());
        
        difference = l1 - l2;
        output = String.format("La differenza tra %d e %d è %d", l1, l2, difference);
        
        System.out.println(output);
        
        
        
        
        System.out.println("\nEseguiamo ora il prodotto tra due numeri.");
        
        double d1, d2, product;
        
        System.out.println("Digita un numero, anche con la virgola!");
        d1 = Double.parseDouble(input.nextLine());
        
        System.out.println("Digita un secondo numero, anche con la virgola!");
        d2 = Double.parseDouble(input.nextLine());
        
        product = d1 * d2;
        output = String.format("Il prodotto tra %f e %f è %f", d1, d2, product);
        System.out.println(output);

        input.close(); // È buona pratica chiudere lo Scanner quando non serve più
    }

}
