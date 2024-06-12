package preparatorios.prepara01;

public class preparatorio1 {
	public static void main(String[] args) {
		CFruteria fruteria;
		fruteria = new CFruteria();
		int opcion;

		String codigo;

		do {
			opcion = fruteria.dameOpcion();
			switch (opcion) {
			case 1:
				fruteria.llenar();
				System.out.println("Fruteria LLENA");
				break;
			case 2:
				fruteria.vaciar();
				System.out.println("Fruteria VACIA");
				break;
			case 3:
				fruteria.mostrar();
				break;
			case 4:
				System.out.print("Dame código de fruta: ");
				codigo = Leer.datoString();
				fruteria.mostrarFruta(codigo);
				break;
			case 5:
				System.out.print("Dame código de fruta: ");
				codigo = Leer.datoString();
				fruteria.eliminarFruta(codigo);
				break;
			case 6:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");
				break;
			}
		} while (opcion != 6);
	}

}
