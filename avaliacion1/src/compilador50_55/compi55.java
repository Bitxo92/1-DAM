package compilador50_55;

import java.util.Scanner;

public class compi55 {
	public static void main(String[] args) {
		int num;
		
		Scanner teclado = new Scanner(System.in);

		do {  

			compi55.menu();
			num = teclado.nextInt();
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
				System.out.println("Dame una cadena: ");
				teclado.nextLine();
				String c = teclado.nextLine();
				System.out.println(c);
				break;
				
			case 4:
				System.out.println("FINAL");
				break;

			default:
				System.out.println("OPCION Erronea");

			}

		} while (num != 4);

		teclado.close();
	}

	static void menu() {
		System.out.println("MENU");
		System.out.println("======");
		System.out.println("1.- Dame un ENTEIRO");
		System.out.println("2.- Dame un REAL");
		System.out.println("3.- Dame una CADEA");
		System.out.println("FINAL");
		System.out.println(">");

	}

}
