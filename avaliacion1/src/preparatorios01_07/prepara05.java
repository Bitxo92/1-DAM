package preparatorios01_07;

import java.util.Scanner;

public class prepara05 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame IDADE: ");
		int edad = teclado.nextInt();
		while (edad >= 3 && edad <= 17 || edad >= 25 && edad <= 65) {
			System.out.print("\nCORRECTO, idade pulsada: " + edad + "-> modificado este intervalo: ");
			if (edad >= 3 && edad <= 17) {
				System.out.print("(3,17)");
				a++;

				if (edad >= 9 && edad <= 12) {
					System.out.print("(9,12)");
					b++;
				}
			} else {
				System.out.print("(25,65)");
				c++;

				if (edad >= 35 && edad <= 40) {
					System.out.print("(35,40)");
					d++;
				}
			}
			System.out.print("\nDame IDADE: ");
			edad = teclado.nextInt();
		}

		teclado.close();
		System.out.println("+++++> Entre 3 a 17 pulsaronse " + a + " idades");
		System.out.println("+++++> Entre 9 a 12 pulsaronse " + b + " idades");
		System.out.println("+++++> Entre 25 a 65 pulsaronse " + c + " idades");
		System.out.println("+++++> Entre 35 a 40 pulsaronse " + d + " idades");

	}

}
