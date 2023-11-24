package pizarra15_22;

import java.util.Scanner;

public class piza20 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Pulsa unha tecla: ");
		char letra = teclado.nextLine().charAt(0);

		if (Character.isUpperCase(letra) || Character.isLowerCase(letra)) {
			System.out.println("LETRA");
		} else if (Character.isDigit(letra)) {
			System.out.println("DIGITO");
		} else {
			System.out.println("NON PERMITIDA");
		}
		teclado.close();

	}
}
