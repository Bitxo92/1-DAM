package compilador206_208;
import misClases.avaliacion2.CVectorAleatorio;
public class compi208 {
	public static void main(String[] args) {
		CVectorAleatorio vector = new CVectorAleatorio();
		int opcion;
		do {
			opcion=vector.recolleOpcion();
			switch(opcion) {
			case 1:
				vector.inicilizaAleatorio();
				break;
			case 2:
				vector.amosaVector();
				break;
			case 3:
				vector.ordenaAscendente();
				break;
			case 4:
				vector.ordenaDescendente();
				break;
			case 5:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");
					
			}
			
		}while(opcion!=5);
	}

}