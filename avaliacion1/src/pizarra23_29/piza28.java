package pizarra23_29;

import java.io.IOException;

public class piza28 {

	public static void main(String[] args) throws IOException {
		char letra;
		System.out.println("Pulse tecla: ");
		letra = (char) System.in.read();
		while (letra >= 'a' && letra <= 'z' || letra == ' ') {
			System.out.println(letra);
			System.out.println("Pulse tecla: ");
			letra = (char) System.in.read();
			letra = (char) System.in.read();

		}
		System.out.println("Final");
	}
}
