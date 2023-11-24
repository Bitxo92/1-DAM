package preparatorios08_16;

import java.util.Scanner;

public class prepara08 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame edad: ");
		int edad = teclado.nextInt();

		while (edad >= 25 && edad <= 60) {
			System.out.print("\nCORRECTO, edad pulsada: " + edad + " -> modificado este intervalo: ");
			if ((edad >= 25 && edad <= 35) && (edad >= 30 && edad <= 45)) {
				System.out.print("(25,35) (30,45)");
				a++;
				b++;
			} else if (edad >= 25 && edad <= 35) {
				System.out.print("(25,35)");
				a++;
			} else if ((edad >= 30 && edad <= 45) && (edad >= 40 && edad <= 60)) {
				System.out.print("(30,45) (40,60)");
				b++;
				c++;
			} else if (edad >= 30 && edad <= 45) {
				System.out.print("(30,45)");
				b++;
			}
			else {
				System.out.print("(40,60)");
				c++;
			}
			System.out.print("\nDame edad: ");
			edad = teclado.nextInt();
		}
		teclado.close();
		System.out.println("+++++> Entre 25 e 35 pulsaronse " + a + " edades");
		System.out.println("+++++> Entre 30 e 45 pulsaronse " + b + " edades");
		System.out.println("+++++> Entre 40 e 60 pulsaronse " + c + " edades");
	}

}
