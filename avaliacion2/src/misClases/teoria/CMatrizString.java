package misClases.teoria;

import misClases.utilidades.DatosPersonales;

public class CMatrizString {
	private String[] matriz;

	public void crea() {
		System.out.print("Numero de personas: ");
		int n = Leer.datoInt();
		matriz = new String[n];
	}

	public void llena() {
		for (int i = 0; i < matriz.length; ++i) {
			matriz[i] = dameDato();
		}

	}

	public void amosa() {
		System.out.println("\nMatriz de Personas");

		for (int i = 0; i < matriz.length; ++i) {
			int longitud = matriz[i].length();
			System.out.println(i + "->  " + matriz[i] + " (" + longitud + ")");
		}

	}

	private String dameDato() {
		String dato = DatosPersonales.dameNombre();
		dato = dato + " " + DatosPersonales.dameApellido();
		dato = dato + " " + DatosPersonales.dameApellido();
		return dato;
	}
}