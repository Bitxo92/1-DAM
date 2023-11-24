package teoria.capitulo02.racional;

public class CRacional1 {
	int Numerador;
	int Denominador;
	
	void AsignarDatos(int num, int den) {
		Numerador=num;
		
		if(den==0) {
			den=1;
		}
		Denominador=den;
		
		
	}
	void VisualizarRacional() {
		System.out.println(Numerador+ "/"+ Denominador);
	}
	public static void main(String[] args) {
		CRacional1 r1 = new CRacional1();
		
		System.out.print("Racional-1: ");
		r1.AsignarDatos(2,5);
		r1.VisualizarRacional();
		
	}

}
