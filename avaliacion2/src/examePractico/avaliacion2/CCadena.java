package examePractico.avaliacion2;

import java.io.IOException;

public class CCadena {
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

	public void amosaCadena() {

		for (int i = 0; cadena[i]!='\0'; i++) {
				System.out.print(cadena[i]);
		}
	}

	public void eliminaVocalesEnCadena() {
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i] == 'a' || cadena[i] == 'e' || cadena[i] == 'i' || cadena[i] == 'o' || cadena[i] == 'u') {
				cadena[i] = '\0';
				int s = i;
				for (int j = s; j < cadena.length - 1; j++) {

					cadena[j] = cadena[s + 1];
					s++;

				}
				i--;

			}
		}
	}

}
