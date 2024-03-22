package compilador01_08;

import java.util.Scanner;

public class compi03f {
	public static void main(String[] args) {
		float base, altura;
		Scanner teclado = new Scanner(System.in);

		System.out.print("\nDame a base: ");
		base = teclado.nextFloat();
		System.out.print("Dame a altura: ");
		altura = teclado.nextFloat();
		System.out.print("Area do triángulo:");
		System.out.print(base*altura/2);
		teclado.close();
	}
}