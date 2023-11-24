package pizarra15_22;

import java.util.Scanner;

public class piza18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Pulsa unha tecla: ");
		char letra = scanner.nextLine().charAt(0);// charAT(0) recoge la primera letra de la cadena que comienza en 0

		if (Character.isUpperCase(letra)) {
			System.out.println("Pulsouse esta tecla: " + letra);
			System.out.println("E MAYÚSCULA");
		} else if (Character.isLowerCase(letra)) {
			System.out.println("Pulsouse esta tecla: " + letra);
			System.out.println("E MINUSCULA");
		} else
			System.out.println("Tecla NON PERMITIDA " + letra);

		scanner.close();
	}
}
