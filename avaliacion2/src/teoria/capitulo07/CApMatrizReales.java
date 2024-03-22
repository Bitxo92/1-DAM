package teoria.capitulo07;

import misClases.teoria.CMatrizReales;

class CApMatrizReales {
	public static void main(String[] args) {
		CMatrizReales matriz = new CMatrizReales();
		matriz.crea();
		matriz.llena();
		matriz.amosa();
		System.out.println("\nModificamos Elemento");
		int indice = matriz.dameIndice();
		matriz.modificaElemento(indice);
		matriz.amosa();
	}
}