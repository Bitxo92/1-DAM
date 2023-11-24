package compilador01_08;

import java.util.Scanner;

public class compi02f {
	public static void main(String[] args) {
		float base, altura;
		Scanner teclado = new java.util.Scanner(System.in);

		System.out.print("\nDame a base: ");
		base = teclado.nextFloat();
		System.out.print("Dame a altura: ");
		altura = teclado.nextFloat();

		System.out.print("Area do rectángulo: ");
		System.out.println((int)(base*altura));
		teclado.close();
	}
}