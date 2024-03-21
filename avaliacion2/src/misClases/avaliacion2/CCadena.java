package misClases.avaliacion2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("all")
public class CCadena {
	private int i;
	private char[] cadena = new char[80];

	private String frase;

	public void recolleCadena() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca una cadena de caracteres: ");
		frase = teclado.nextLine();
		for (i = 0; i < frase.length(); i++) {
			cadena[i] = frase.charAt(i);

		}
		teclado.close();
	}

	public void recogerCadena() throws IOException {
		int i = 0;
		char letra;
		System.out.println("introduzca cadena: ");
		letra = (char) System.in.read();
		while (letra != '\r') {
			cadena[i] = letra;
			letra = (char) System.in.read();
			i++;

		}

	}

	public void amosaCadena() {
		System.out.println();
		for (i = 0; i < cadena.length; i++) {
			if (cadena[i] != '\0')
				System.out.print(cadena[i]);
		}
	}

	public void amosaRevesCadena() {

		for (i = (cadena.length) - 1; i >= 0; i--) {
			if (cadena[i] != '\0')
				System.out.print(cadena[i]);
		}

	}

	// Método para recoger cadena al azar
	public void recolleCadenaAlAzar() {

		Random random = new Random();

		for (int i = 0; i < cadena.length; i++) {

			// Generar un carácter aleatorio entre 'a' y 'z'
			char randomChar = (char) (random.nextInt(26) + 'a');
			cadena[i] = randomChar;
		}
	}

	public void invierteCadena() {
		int i, j;
		char letra;
		i = 0;
		while (cadena[i] != '\0')
			i++;
		i--;
		j = 0;
		while (j < i) {
			letra = cadena[j];
			cadena[j] = cadena[i];
			cadena[i] = letra;
			j++;
			i--;
		}
	}

	public void capicua() {

		// Crear un nuevo array con el doble de longitud
		char[] resultado = new char[cadena.length * 2];

		// Copiar la cadena original en la primera mitad del nuevo array
		System.arraycopy(cadena, 0, resultado, 0, cadena.length);

		// invertimos cadena con nuestro método
		invierteCadena();

		// Copiar la cadena invertida en la segunda mitad del nuevo array
		System.arraycopy(cadena, 0, resultado, cadena.length, cadena.length);

		// Actualizar la cadena original con la versión sumada
		this.cadena = resultado;

	}

	public void capicua2() {
		int j = frase.length();
		for (i = frase.length() - 1; i >= 0; i--) {
			cadena[j] = cadena[i];
			j++;

		}

	}

	public void eliminaEnCadena(char a) {
		for (i = 0; i < cadena.length; i++) {
			if (cadena[i] == a) {
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

	public void repiteUnha() {
		// Crear un nuevo array con el doble de longitud
		char[] letrasRepetidas = new char[cadena.length * 2];

		// Iterar sobre cada valor del array original
		for (int i = 0; i < cadena.length; i++) {
			// Obtener el valor actual
			char valor = cadena[i];

			// Repetir el valor dos veces y agregarlo al nuevo array
			letrasRepetidas[2 * i] = valor;
			letrasRepetidas[2 * i + 1] = valor;
		}

		// Actualizar el array original con la versión repetida
		this.cadena = letrasRepetidas;
	}

	public void repiteUna() {

		for (int i = frase.length() - 1; i >= 0; i--) {
			int j = i * 2 + 1;
			cadena[j] = cadena[i];
			cadena[j - 1] = cadena[i];

		}
	}

	public void eliminaPares() {
		int j = 0;

		for (i = 0; i < cadena.length; i++) {
			if (i % 2 == 0) {
				cadena[i] = '\0';

			}

		}

	}

	public void duplicaCaracteres3Numeros2() {
		int i = 0;
		int contNum = 0;
		int contChar = 0;

		while (cadena[i] != '\0') {

			if ((cadena[i] >= 'A' && cadena[i] <= 'z'))
				contChar = contChar + 2;
			else if (cadena[i] >= '0' && cadena[i] <= '9')
				contNum++;
			i++;

		}
		i--;
		int j = i + contNum + contChar;

		while (i >= 0) {
			if ((cadena[i] >= 'A' && cadena[i] <= 'Z') || (cadena[i] >= 'a' && cadena[i] <= 'z')) {
				cadena[j] = cadena[i];
				cadena[j - 1] = cadena[i];
				cadena[j - 2] = cadena[i];
				j = j - 2;
			} else if (cadena[i] >= '0' && cadena[i] <= '9') {
				cadena[j] = cadena[i];
				cadena[j - 1] = cadena[i];
				j--;
			} else
				cadena[j] = cadena[i];
			i--;
			j--;
		}

	}

	public void eliminaPares2() {
		int i, j;
		i = 0;
		j = 0;
		while (cadena[i] != '\0') {
			if (i % 2 != 0) {
				cadena[j] = cadena[i];
				j++;
			}
			i++;
		}
		while (j < i) {
			cadena[j] = cadena[i];
			j++;
		}
	}

	public void elimina125EnCadena() {
		// creamos un objeto stringbuffer para poder manipular la cadena
		StringBuffer stringBuffer = new StringBuffer();

		// Iteramos sobre la cadena original controlando la longitud a traves del tamaño
		// de string
		// y añadimos solo los caracteres que no están en las posiciones 1, 2 y 5
		for (int i = 0; i < frase.length(); i++) {
			if (i != 1 && i != 2 && i != 5) {
				stringBuffer.append(cadena[i]);
			}
		}

		// Actualizamos la cadena original con la cadena modificada
		cadena = stringBuffer.toString().toCharArray();
	}

	public void duplica125EnCadena() {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < frase.length(); i++) {
			if (i != 1 && i != 2 && i != 5) {
				stringBuffer.append(cadena[i]);
			} else
				stringBuffer.append(cadena[i]).append(cadena[i]);
		}

		// Actualizamos la cadena original con la cadena modificada
		cadena = stringBuffer.toString().toCharArray();

	}

	public void duplicaNumerosEnCadena() {

		StringBuffer stringBuffer = new StringBuffer();

		for (int i = 0; i < frase.length(); i++) {
			if (cadena[i] < '0' || cadena[i] > '9') {
				stringBuffer.append(cadena[i]);
			} else
				stringBuffer.append(cadena[i]).append(cadena[i]);
		}

		// Actualizamos la cadena original con la cadena modificada
		cadena = stringBuffer.toString().toCharArray();

	}

	public void duplica125EnCadena2() {
		int i = frase.length(), j = i + 3;

		while (i >= 0) {
			if (i != 1 && i != 2 && i != 5)
				cadena[j] = cadena[i];
			else {
				cadena[j] = cadena[i];
				cadena[j - 1] = cadena[i];
				j--;

			}
			j--;
			i--;

		}

	}

	public void duplicaNumerosEnCadena2() {
		int i = 0;
		int cont = 0;
		while (cadena[i] != '\0') {
			if (cadena[i] >= '0' && cadena[i] <= '9')
				cont++;
			i++;

		}
		i--;
		int j = i + cont;

		while (i >= 0) {
			if (cadena[i] < '0' || cadena[i] > '9')
				cadena[j] = cadena[i];
			else {
				cadena[j] = cadena[i];
				cadena[j - 1] = cadena[i];
				j--;

			}
			j--;
			i--;

		}

	}

}
