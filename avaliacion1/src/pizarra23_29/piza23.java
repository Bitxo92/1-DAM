package pizarra23_29;

import java.util.Scanner;

public class piza23 {
	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Dame un numero entre 10 e 50: ");
			num = teclado.nextInt();

		} while (num >= 10 && num <= 50);
		teclado.close();
		System.out.println("O numero "+num+" non esta entre 10 e 50");

	}

}
