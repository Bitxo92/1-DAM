package compilador26_34;

import java.util.Scanner;

public class compi33 {
	public static void main(String[] args) {
		int valor= 0;
		int sumValor= 0;

		Scanner teclado = new Scanner(System.in);

		for (int i = 1; i <= 6; i++) {
			System.out.println("Ingrese valor" + i + " : ");
			valor = teclado.nextInt();
			if (i > 3 && i <= 6) {
				 sumValor = sumValor+valor;

			}
			else {
				
			}

		}
		teclado.close();
		System.out.println("La suma de los 3 ultimos valores es: "+sumValor);

	}

}
