package compilador26_34;

import java.util.Scanner;

public class compi34 {
	public static void main(String[] args) {
		int valor = 0;// scanner input values
		int n = 0;// negativos
		int p = 0;// positivos
		int c = 0;// multiplos 5
		int sumValor1 = 0;
		int sumValor2 = 0;

		Scanner teclado = new Scanner(System.in);

		for (int i = 1; i <= 8; i++) {
			System.out.println("Ingrese valor" + i + " : ");
			valor = teclado.nextInt();
			if (valor < 0) {
				n++;
				if (valor % 5 == 0) {
					c++;
				}

				if (valor % 2 == 0) {
					sumValor1 += valor;
				}
			} else if (valor > 0) {
				p++;
				if (valor % 5 == 0) {
					c++;
				}
				if (valor % 2 == 0) {
					sumValor2 += valor;
				}
			}

		}
		teclado.close();
		int sumValorTotal = sumValor1 + sumValor2;
		System.out.println("Cantidad de valores negativos: " + n);
		System.out.println("Cantidad de valores positivos: " + p);
		System.out.println("Cantidad de valores multiplos de 5: " + c);
		System.out.println("Suma de los valores pares: " + sumValorTotal);
	}

}
