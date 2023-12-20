package misClases.avaliacion2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("all")
public class CCadena {
	private int i;
	private char[] letras = new char[30];
	private String frase;

	public void recolleCadena() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca una cadena de caracteres: ");
		frase = teclado.nextLine();
		for (i = 0; i < frase.length(); i++) {
			letras[i] = frase.charAt(i);

		}
		teclado.close();
	}

	public void amosaCadena() {
		System.out.println("los valores recogidos en la cadena letras son:");
		for (i = 0; i < letras.length; i++) {
			if (letras[i] != '\0')
				System.out.print(letras[i]);
		}
	}

	public void amosaRevesCadena() {

		for (i = (letras.length) - 1; i >= 0; i--) {
			if (letras[i] != '\0')
				System.out.print(letras[i]);
		}

	}

	// Método para recoger cadena al azar
	public void recolleCadenaAlAzar() {

		Random random = new Random();

		for (int i = 0; i < letras.length; i++) {

			// Generar un carácter aleatorio entre 'a' y 'z'
			char randomChar = (char) (random.nextInt(26) + 'a');
			letras[i] = randomChar;
		}
	}

	public void invierteCadena() {
		char temp;
		for (i = 0; i < (letras.length) / 2; i++) {
			temp = letras[i];
			letras[i] = letras[(letras.length - i) - 1];
			letras[letras.length - i - 1] = temp;

		}

	}

	public void capicua() {

		// Crear un nuevo array con el doble de longitud
		char[] resultado = new char[letras.length * 2];

		// Copiar la cadena original en la primera mitad del nuevo array
		System.arraycopy(letras, 0, resultado, 0, letras.length);

		// invertimos cadena con nuestro método
		invierteCadena();

		// Copiar la cadena invertida en la segunda mitad del nuevo array
		System.arraycopy(letras, 0, resultado, letras.length, letras.length);

		// Actualizar la cadena original con la versión sumada
		this.letras = resultado;

	}

	public void capicua2() {
        int j=frase.length();
		for (i = frase.length() - 1; i >= 0; i--) {
			letras[j]=letras[i];
			j++;
			

		
		}

	}

	public void eliminaEnCadena(char a) {
		for (i = 0; i < letras.length; i++) {
			if (letras[i] == a) {
				letras[i] = '\0';
				int s=i;
				for(int j=s;j<letras.length-1;j++) {
					
					letras[j]=letras[s+1];
					s++;
					
					
					}
				i--;
			
				}
		}
	}

	public void repiteUnha() {
		// Crear un nuevo array con el doble de longitud
		char[] letrasRepetidas = new char[letras.length * 2];

		// Iterar sobre cada valor del array original
		for (int i = 0; i < letras.length; i++) {
			// Obtener el valor actual
			char valor = letras[i];

			// Repetir el valor dos veces y agregarlo al nuevo array
			letrasRepetidas[2 * i] = valor;
			letrasRepetidas[2 * i + 1] = valor;
		}

		// Actualizar el array original con la versión repetida
		this.letras = letrasRepetidas;
	}

	public void eliminaPares() {

		for (i = 0; i < letras.length; i++) {
			if (i % 2 == 0)
				letras[i] = 0;

		}

	}

}
