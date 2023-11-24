package pizarra30_36;

import java.io.IOException;
import java.util.Scanner;

public class piza36f {
	public static void main(String[] args) throws IOException {

		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una vocal minúscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();
		while (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Correcto e Vocal minúscula" + letra);
			System.out.println("Dame otra vocal minúscula: ");
			letra=(char)System.in.read();
			teclado.nextLine();

		}
		teclado.close();
		System.out.println("Incorrecto, non é vocal minúscula: "+letra);
	}

}
