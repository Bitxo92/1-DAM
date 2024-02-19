package misClases.teoria;

public class CMatrizReales {
	private float[] matriz;

	public void crea() {
		System.out.print("Numero de reales: ");
		int nElementos = Leer.datoInt();
		matriz = new float[nElementos];
	}

	public void llena() {
		for (int i = 0; i < matriz.length; ++i) {
			matriz[i] = dameDato();
		}

	}

	public void amosa() {
		System.out.println("\nMatriz de Reales");

		for (int i = 0; i < matriz.length; ++i) {
			System.out.println(i + "->  " + matriz[i]);
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

	private float dameDato() {
		int dato1 = (int) (10.0D * Math.random());
		int dato2 = (int) (100.0D * Math.random());
		float dato = (float) dato1 + (float) dato2 / 100.0F;
		return dato;
	}
}
