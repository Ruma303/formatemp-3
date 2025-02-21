package Scanner;

public class Main {

	public static void main(String[] args) {
		
		java.util.Scanner input;
		input = new java.util.Scanner(System.in);
		
		int n1, n2, sum;
		String s1;
		
		System.out.println("Digita un numero!");
		s1 = input.nextLine();
		n1 = Integer.parseInt(s1);
		
		System.out.println("Digita un secondo numero!");
		s1 = input.nextLine();
		n2 = Integer.parseInt(s1);
		
		sum = n1 + n2;
		
		// Usa String.format() per salvare la stringa formattata senza stamparla direttamente
        String output = String.format("La somma tra %d e %d è %d", n1, n2, sum);

        // Ora possiamo stampare l'output successivamente
        System.out.println(output);

        input.close(); // È buona pratica chiudere lo Scanner quando non serve più
    }

}
