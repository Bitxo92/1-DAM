package piza209_215;
import misClases.avaliacion2.CMatriz;
public class piza213 {
	public static void main(String[] args) {
		
		CMatriz matriz = new CMatriz();
		
		matriz.inicializa();
		int max=matriz.oMaior();
		System.out.println("O maior da matriz: " + max);
	}

}
