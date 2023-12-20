package navidad;

public class arbol {

	void dibujarArbol() {
		int altura = 6;

		for (int i = 0; i <= altura; i++) {
			for (int j = 0; j < altura - i; j++) {
				System.out.print(" ");
			}
			// la condicion 2 * i + 1 determina el numero de estrellas que se impriman x
			// linea
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}

			System.out.println();
			esperar(500);
		}
		// determina el numero de espacios que se escriban antes de la estrella
		for (int i = 0; i < altura - 1; i++) {
			System.out.print(" ");
		}

		System.out.println("|||");
	}

	void mostrarMensaje() {
		String navidad = "Feliz Navidad!";
		char letra;
		for (int i = 0; i < navidad.length(); i++) {
			letra = navidad.charAt(i);
			System.out.print(letra);
			esperar(500);

		}

	}

	void mostrarMensajeDam() {
		String navidad = "****1ºDAM****";

		char letra;
		for (int i = 0; i < navidad.length(); i++) {
			letra = navidad.charAt(i);
			System.out.print(letra);
			esperar(500);

		}

	}

	void esperar(int milisegundos) {
		try {
			Thread.sleep(milisegundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
