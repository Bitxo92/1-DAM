package examen2023;

import java.io.IOException;
import java.util.Scanner;

public class pregunta2 {
	public static void main(String[] args) throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Dame Consonante MAIUSCULA ou SIMBOLO: ");
		letra = (char) System.in.read();
		teclado.nextLine();

		while ((letra < 'B' || letra > 'Z' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')
				&& letra != '%' && letra != '[' && letra != '{') {
			
			System.out.print(" -> INCORRECTO, pulsaches esta tecla: " + letra);
			System.out.print("\nDame Consonante MAIUSCULA ou SIMBOLO: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}

		teclado.close();

		if (letra >= 'B'&& letra<='Z')
			System.out.println(" +++++> CORRECTO, pulsaches esta Consonante MAIUSCULA: " + letra);
		else
			System.out.println(" +++++> CORRECTO, pulsaches este SIMBOLO: " + letra);

	}

}
