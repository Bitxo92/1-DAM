package compilador17_25;

import java.util.Scanner;

public class compi21 {
	public static void main(String[] args) {

		int i = 1, j, a = 0, b = 0;
		Scanner teclado = new Scanner(System.in);

		while (i <= 7) {
			System.out.println("Dame nota " + i + ": ");
			j = teclado.nextInt();
			i++;

			if (j >= 6) {
				a++;
			} else {
				b++;
			}
			
		}
		teclado.close();
		System.out.print("\nAlumnos con nota maior"
				+ " ou igual que 6: " + a);
		System.out.print("\nAlumnos con nota menor "
				+ "que 6: " + b);
	}

}
