package misClases.avaliacion2;

import java.util.Scanner;

public class CRecursivo {

	private int[] vector = { 1, 3, 6, 2, 8, 7 };

	private char[] cadena = new char[40];

	private String frase;

	public void recolleCadena() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca una cadena de caracteres: ");
		frase = teclado.nextLine();
		for (int i = 0; i < frase.length(); i++) {
			cadena[i] = frase.charAt(i);

		}
		teclado.close();
	}

	public int total() {
		int n = 0;
		for (int i = 0; i < cadena.length; i++) {
<<<<<<< HEAD
			if (cadena[i] != '\0') {
=======
			if (cadena[i] == '\0') {
>>>>>>> origin/main
				n++;

			}
		}

		return n;
	}

	public void amosaDixitosDuplicados(int i) {
		if (i > 0) {
			if (cadena[i] < '0' || cadena[i] > '9') {
				amosaDixitosDuplicados(i - 1);
				System.out.print(cadena[i]);
			} else {
				amosaDixitosDuplicados(i - 1);
				System.out.print(cadena[i]);
				System.out.print(cadena[i]);

			}
		} else {
			if (cadena[i] < '0' || cadena[i] > '9') {
				System.out.print(cadena[i]);
			} else {
				System.out.print(cadena[i]);
				System.out.print(cadena[i]);

			}
		}

	}

	public void amosaRevesCadena(int i) {

		if (i < frase.length() - 1)
			amosaRevesCadena(i + 1);
		System.out.print(cadena[i]);

	}

	public void amosaSenDixitos(int i) {

		if (i < frase.length()) {
			if (cadena[i] >= '0' && cadena[i] <= '9')
				amosaSenDixitos(i + 1);

			else {
				System.out.print(cadena[i]);
				amosaSenDixitos(i + 1);

			}
		}
	}

	public void amosa1_N(int n) {

		if (n >= 1) {
			amosa1_N(n - 1);
			System.out.print(n + " ");

		}
	}

	public void amosaN_1(int n) {
		if (n >= 1) {
			System.out.print(n + " ");
			amosaN_1(n - 1);
		}
	}

	public void amosaA_B(int a, int b) {

		if (a <= b)
			amosaA_B(a, b - 1);
		System.out.print(b + " ");

	}

	public void amosaB_A(int a, int b) {
		if (b >= a) {

			System.out.print(b + " ");
			amosaB_A(a, b - 1);

		}
	}

	public int factorial(int x) {
		if (x >= 1) {
			return x * factorial(x - 1);
		} else {
			return 1; // el factorial de 1 es 1;
		}
	}

	public int suma1_N(int n) {
		if (n >= 1) {
			return n + suma1_N(n - 1);
		} else
			return n;
	}

	public int sumaA_B(int a, int b) {
		if (b >= a) {
			return b + sumaA_B(a, b - 1);
		} else
			return 0;
	}

	public void amosa(int n) {
		if (n >= vector[0]) {
			amosa(n - 1);

			System.out.print(vector[n] + " ");

		} else
			System.out.print(vector[0] + " ");
	}

	public void amosaReves(int n) {
		if (n >= vector[0]) {

			System.out.print(vector[n] + " ");
			amosaReves(n - 1);

		} else
			System.out.print(vector[0] + " ");
	}
<<<<<<< HEAD
=======
	
	

>>>>>>> origin/main

}
