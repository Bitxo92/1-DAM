package compilador01_08;

import java.util.Scanner;

public class compi03 {
	public static void main(String[] args) {
		int base, altura;
		Scanner teclado = new java.util.Scanner(System.in);

		System.out.print("\nDame a base: ");
		base = teclado.nextInt();
		System.out.print("Dame a altura: ");
		altura = teclado.nextInt();
		System.out.print("Area do triángulo: ");
		System.out.println(base*altura/2.0);
		teclado.close();
	}
}