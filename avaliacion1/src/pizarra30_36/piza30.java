package pizarra30_36;

import java.util.Scanner;

public class piza30 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int num = teclado.nextInt();

		while (!(num > 1 && num < 20)) {
			System.out.println("Introduzca un numero de nuevo: ");
			num = teclado.nextInt();

		}
		teclado.close();
		System.out.println("FINAL");

	}

}
