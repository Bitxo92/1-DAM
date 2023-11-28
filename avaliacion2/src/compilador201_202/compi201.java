package compilador201_202;
import misClases.avaliacion2.CDameDato;

public class compi201 {
	public static void main(String[] args) {
		CDameDato object = new CDameDato();
		
		int opcion = object.dameOpcion();
		
		
		while(opcion!=4) {
			switch(opcion) {
			case 1:
				object.recolleInt();
				object.mostrarInt();
				break;
			case 2:
				object.recolleFloat();
				object.mostrarFloat();
				break;
			case 3:
				object.recolleString();
				object.mostrarString();
				break;
			default:
				System.out.println("OPCIÓN ERRÓNEA");
				
				
			}
		
			opcion=object.dameOpcion();
		
			
		}
		System.out.println("FINAL");

	
	}

}
