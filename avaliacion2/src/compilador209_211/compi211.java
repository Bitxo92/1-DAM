package compilador209_211;

import misClases.avaliacion2.CArrayCadenas;

public class compi211 {
	public static void main(String[] args) {
		
		CArrayCadenas vector = new CArrayCadenas();
		
		
		int opcion;
		
		do{
			opcion= vector.recolleOpcion();
			switch(opcion) {
			case 1:
				vector.inicializaVector();
				break;
			case 2:
				vector.amoseVector();
				break;
			case 3:
				vector.ordenarAscendente();
				break;
			case 4:
				vector.ordenarDescendente();
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
