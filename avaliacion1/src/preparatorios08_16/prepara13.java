package preparatorios08_16;

import java.util.Scanner;

public class prepara13 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame edad: ");
		int edad = teclado.nextInt();

		while (edad >= 10 && edad <= 50) {
			System.out.print("\nCORRECTO, edad pulsada " + edad + " -> modificados estos intervalos: ");

			if ((edad >= 10 && edad <= 30) && (edad >= 15 && edad <= 21) && (edad >= 25 && edad <= 45)) {
				System.out.print("(10,30) (15,21) (25,45)");
				a++;
				b++;
				c++;

			} else if ((edad >= 10 && edad <= 30) && (edad >= 15 && edad <= 21)) {
				System.out.print("(10,30) (15,21)");
				a++;
				b++;

			}

			else if ((edad >= 10 && edad <= 30) && (edad >= 25 && edad <= 45) && (edad >= 30 && edad <= 50)) {
				System.out.print("(10,30) (25,45) (30,50)");
				a++;
				c++;
				d++;

			}

			else if ((edad >= 25 && edad <= 45) && (edad >= 30 && edad <= 50)) {
				System.out.print("(25,45) (30,50)");
				c++;
				d++;

			}

			else if ((edad >= 10 && edad <= 30)) {
				System.out.print("(10,30)");
				a++;

			} else {
				System.out.print("(30,50)");
				d++;

			}

			System.out.print("\rDame edad: ");
			edad = teclado.nextInt();
		}
		teclado.close();
		System.out.println("+++++>Entre 10 e 30 pulsaronse " + a + " edades");
		System.out.println("+++++>Entre 30 e 50 pulsaronse " + d + " edades");
		System.out.println("+++++>Entre 15 e 21 pulsaronse " + b + " edades");
		System.out.println("+++++>Entre 25 e 45 pulsaronse " + c + " edades");
	}
}
