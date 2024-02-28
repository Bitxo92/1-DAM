package preparatorios;
import misClases.avaliacion2.CMatrizCuadrada;
public class prepara01 {
	public static void main(String[] args) {
		CMatrizCuadrada matriz = new CMatrizCuadrada();
		matriz.amosaMatrizA();
		matriz.copiaAenBcolumna1Repe();
		System.out.println("\n");
		matriz.amosaMatrizB();
		//Propuestos en clase
		System.out.println();
		// matrizB={{9,6,3},{7,4,1},{9,6,3}}
		matriz.copiaAenB963741963();
		System.out.println("\n");
		matriz.amosaMatrizB();
		
		//matriz={{3,6,9},{3,6,9},{1,4,7}}
		System.out.println("\n");
		matriz.copiaAenB369369147();
		matriz.amosaMatrizB();
	
		
	}

}
