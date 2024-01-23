package teoria.capitulo05;

import misClases.teoria.CEcuacion;

class CAPEcuacion {
	public static void main(String[] args) {
		CEcuacion ecuacion = new CEcuacion();
		ecuacion.recogeDatos();
		if (ecuacion.raicesComplejas()) {
			System.out.println("Las raices son complejas.");
		} else {
			ecuacion.muestraResultado();
		}

	}
}
