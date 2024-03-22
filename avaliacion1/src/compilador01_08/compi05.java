package compilador01_08;

import java.util.Scanner;

public class compi05 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero do 1 ao 10: ");
		int a = teclado.nextInt();
		teclado.close();
		if (a >= 1 && a <= 10) {// introducimos restriccion para asegurar que los valores introducidos estan en
								// los rangos aceptados
			int i = 1;
			System.out.println("Tabla do " + a + "\n========");

			while (i <= 10) { // bucle while haciendo tabla hasta numero 10
				int j = a * i;
				System.out.println(a + " x " + i + " = " + j);
				i++;
			}
		} 
		else {
			System.out.println("O teu numero non se encontra entre o 1 ao 10 ");
		}

	}

}
