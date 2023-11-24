package misClases.avaliacion1;

import java.io.IOException;
import java.util.Scanner;

public class CTecla {

	// Atributos privados
	private char dixito;
	private char vocalm;
	private char vocalM;
	private char consonantem;
	private char consonanteM;

	Scanner scanner = new Scanner(System.in);
	
	
	// metodos

	public void dixito() throws IOException {

		do {
			System.out.print("Introduzca un DIXITO: ");
			dixito = (char) System.in.read();
			scanner.nextLine();

		} while (dixito < '0' || dixito > '9');
	}

	public void vocalm() throws IOException {
		do {
			System.out.print("Introduzca una VOCAL minúscula: ");
			vocalm = (char) System.in.read();
			scanner.nextLine();
		} while (vocalm != 'a' && vocalm != 'e' && vocalm != 'i' && vocalm != 'o' && vocalm != 'u');
	}

	public void vocalM() throws IOException {
		do {
			System.out.print("Introduzca una VOCAL mayúscula: ");
			vocalM = (char) System.in.read();
			scanner.nextLine();
		} while (vocalM != 'A' && vocalM != 'E' && vocalM != 'I' && vocalM != 'O' && vocalM != 'U');

	}

	public void consonantem() throws IOException {

		do {
			System.out.print("Introduzca un CONSONANTE minúscula: ");
			consonantem = (char) System.in.read();
			scanner.nextLine();

		} while (consonantem < 'b' || consonantem > 'z' || consonantem == 'e' || consonantem == 'i'
				|| consonantem == 'o' || consonantem == 'u');
	}

	public void consonanteM() throws IOException {

		do {
			System.out.print("Introduzca un CONSONANTE mayúscula: ");
			consonanteM = (char) System.in.read();
			scanner.nextLine();

		} while (consonanteM < 'B' || consonanteM > 'Z' || consonanteM == 'E' || consonanteM == 'I'
				|| consonanteM == 'O' || consonanteM == 'U');

	}

	public void amosarResultado() {
		System.out.print("Resultado: " + Dixito() + Vocalm() + VocalM() + Consonantem() + ConsonanteM());
	}

	// métodos privados

	private String Dixito() {

		return String.format("%2s,", dixito);
	}

	private String Vocalm() {

		return String.format("%3s,", vocalm);
	}

	private String VocalM() {

		return String.format("%3s,", vocalM);
	}

	private String Consonantem() {

		return String.format("%3s,", consonantem);
	}

	private String ConsonanteM() {

		return String.format("%3s", consonanteM);
	}

}
