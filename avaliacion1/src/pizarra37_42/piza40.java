package pizarra37_42;
import misClases.avaliacion1.CNotas;
public class piza40 {
	public static void main(String[] args) {
		
		CNotas notas = new CNotas();
		notas.mostraNotas();
		int maior=notas.dameMaior();
		float notaMax= notas.dameNota(maior);
		
		System.out.println("Alumno con MAIOR nota");
		System.out.println("=====================");
		System.out.println("Alumno " + (maior+1) + ": " + notaMax);
		
	}

}
