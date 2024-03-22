package compilador201_202;

import misClases.avaliacion2.CDameDato;

public class compi202 {
	public static void main(String[] args) {

		CDameDato object = new CDameDato();
		int opcion;

		do {
			opcion = object.dameOpcion();

			switch (opcion) {
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
			case 4:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCIÓN ERRÓNEA");

			}

		} while (opcion != 4);

	}

}
