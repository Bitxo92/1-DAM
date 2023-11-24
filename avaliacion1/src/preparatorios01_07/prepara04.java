package preparatorios01_07;

import java.io.IOException;
import java.util.Scanner;

public class prepara04 {
	public static void main(String[] args) throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame CONSONANTE minúscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();
		while (letra < 'b' || letra > 'z' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("INCORRECTO, pulsaches esta tecla: " + letra);
			System.out.print("Dame CONSONANTE minúscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		teclado.close();
		System.out.println("+++++> CORRECTO, pulsaches esta CONSONANTE minuscula: " + letra);

	}
}
