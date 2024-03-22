package pizarra23_29;

import java.util.Scanner;

public class piza24 {
	public static void main(String[] args) {
		int num;
		int multiplo=0;
		

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("Dame un numero entre 10 e 50:");
			num = teclado.nextInt();

			if (num % 3 == 0) {
				multiplo++;
			}

		} while (num >= 10 && num <= 50);
		teclado.close();
		

		System.out.println("Has introducido" + multiplo + " multiplos de 3 entre 10 e 50");
	}

}
