package practicas.ejem02;

public class ejemplo2 {
	public static void main(String[] args) {
		COposicion oposicion = new COposicion();

		int opcion;
		do {
			opcion = oposicion.dameOpcion();
			switch (opcion) {
			case 1:
				oposicion.llenar();
				System.out.println("Oposición LLENA");
				break;
			case 2:
				oposicion.vaciar();
				System.out.println("Oposición VACIA");
				break;
			case 3:
				oposicion.mostrar();
				break;
			case 4:
				System.out.print("Dame clave de aspirante: ");
				int clave = Leer.datoInt();
				oposicion.eliminarAspirante(clave);
				break;
			case 5:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");
			}
		} while (opcion != 5);

	}
}