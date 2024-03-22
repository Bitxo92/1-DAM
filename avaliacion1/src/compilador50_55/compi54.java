package compilador50_55;

import java.util.Scanner;

public class compi54 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("MENU");
		System.out.println("======");
		System.out.println("1.- Dame un ENTEIRO");
		System.out.println("2.- Dame un REAL");
		System.out.println("3.- Dame una CADEA");
		System.out.println("FINAL");
		System.out.println(">");
		int num = teclado.nextInt();

		while (num != 4) {
			switch (num) {
			case 1:
				System.out.print("Dame un numero enteiro: ");
				int a = teclado.nextInt();
				System.out.println(a);
				break;

			case 2:
				System.out.print("Dame un numero real: ");
				float b = teclado.nextFloat();
				System.out.println(b);
				break;

			case 3:
				System.out.print("Dame una cadena: ");
				teclado.nextLine();
				String c = teclado.nextLine();
				System.out.println(c);
				break;
			

			default:
				System.out.println("OPCION Erronea");

			}
			System.out.println("MENU");
			System.out.println("======");
			System.out.println("1.- Dame un ENTEIRO");
			System.out.println("2.- Dame un REAL");
			System.out.println("3.- Dame una CADEA");
			System.out.println("FINAL");
			System.out.println(">");
			num = teclado.nextInt();
		}

		System.out.println("FINAL");
		teclado.close();
	}

}
