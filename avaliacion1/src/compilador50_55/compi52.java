package compilador50_55;

import java.util.Scanner;

public class compi52 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("MENÚ\n======");
		System.out.println("1.- Amoso UNHA");
		System.out.println("2.- Amoso DUAS DUAS");
		System.out.println("3.- Amoso TRES TRES TRES");
		System.out.print(">");
		int num = teclado.nextInt();

		while (num > 0 && num <= 3) {
			switch (num) {
			case 1:
				System.out.println("UNHA");
				break;
			case 2:
				System.out.println("DUAS DUAS");
				break;
			case 3:
				System.out.println("TRES TRES TRES");
				break;

			}
			System.out.println("\nMENÚ\n======");
			System.out.println("1.- Amoso UNHA");
			System.out.println("2.- Amoso DUAS DUAS");
			System.out.println("3.- Amoso TRES TRES TRES");
			System.out.print(">");
			num = teclado.nextInt();
		}
		teclado.close();
		System.out.println("FINAL");

	}

}
