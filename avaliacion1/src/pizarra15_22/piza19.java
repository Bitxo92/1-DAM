package pizarra15_22;

import java.util.Scanner;

public class piza19 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Pulsa unha tecla: ");
		char letra = teclado.nextLine().charAt(0);

		if (Character.isUpperCase(letra)) {
			System.out.println("MAIUSCULA: "+letra);

		}
		else if(Character.isLowerCase(letra)) {
			System.out.println("MINUSCULA: "+letra);
		}
		else if(Character.isDigit(letra)) {
			System.out.println("DIGITO: "+letra);
		}
		else {
			System.out.println("Tecla NON PERMITIDA: "+letra);
		}
		teclado.close();

	}
}
