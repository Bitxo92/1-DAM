package pizarra37_42;

import misClases.avaliacion1.CNotas;

public class piza42 {
	public static void main(String[] args) {
		CNotas notas = new CNotas();
		float media = notas.dameNotaMedia();

		System.out.println("=====================");
		System.out.println("Nota Media: " + media);
	}

}
