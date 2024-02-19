package misClases.teoria;

import misClases.utilidades.DatosPersonales;

public class CMatrizStringBuffer {
	private StringBuffer[] matriz;

	public void crea() {
		System.out.print("Numero de personas: ");
		int n = Leer.datoInt();
		matriz = new StringBuffer[n];
	}

	private StringBuffer dameDato() {
		StringBuffer dato = new StringBuffer(DatosPersonales.dameNombre());
		dato.append(" ").append(DatosPersonales.dameApellido());
		dato.append(" ").append(DatosPersonales.dameApellido());
		return dato;
	}

	public void llena() {
		for (int i = 0; i < matriz.length; ++i) {
			this.matriz[i] = dameDato();
		}

	}

	public void amosa() {
		System.out.println("\nMatriz de Personas");

		for (int i = 0; i < matriz.length; ++i) {
			int longitud = matriz[i].length();
			System.out.println(i + "->  " + matriz[i].toString() + " (" + longitud + ")");
		}

	}

	public int dameIndice() {
		int indice;
		do {
			System.out.print("Dame indice: ");
			indice = Leer.datoInt();
		} while (indice < 0 || indice > matriz.length - 1);

		return indice;
	}

	public void modificaElemento(int indice) {
		matriz[indice] = dameDato();
	}
}