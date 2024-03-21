package examePractico.avaliacion2;

import java.io.IOException;

public class CRecursivo {
	private char[] cadena = new char[40];

	public void recogerCadena() throws IOException {
		int i = 0;
		char letra;
		System.out.print("Dame cadena: ");
		letra = (char) System.in.read();
		while (letra != '\r') {
			cadena[i] = letra;
			letra = (char) System.in.read();
			i++;

		}

	}

	public void amosa467DuplicadosReves(int i) {

		if (cadena[i] != '\0') {
			amosa467DuplicadosReves(i + 1);
			if (cadena[i] == '4' || cadena[i] == '6' || cadena[i] == '7') {

				System.out.print(cadena[i]);
				System.out.print(cadena[i]);
			} else {

				System.out.print(cadena[i]);

			}
		}
	}

}
