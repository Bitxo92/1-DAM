package pizarra37_42;
import misClases.avaliacion1.CNotas;
public class piza41 {
	public static void main(String[] args) {
		
		CNotas notas = new CNotas();

		notas.mostraNotas();
		int menor= notas.dameMenor();
		float notaMenor= notas.dameNota(menor);
		System.out.println("Alumno con MENOR nota");
		System.out.println("=====================");
		System.out.println("Alumno " + (menor+1) + ": " + notaMenor);
	}

}
