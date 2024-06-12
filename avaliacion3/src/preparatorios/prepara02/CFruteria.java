package preparatorios.prepara02;

public class CFruteria {

	private CFruta[] fruteria = new CFruta[5];
	int total = 0;

	public void llenar() {
		fruteria[0] = new CFruta("P100", "Naranja Valenciana", 20, 30.5f);
		fruteria[1] = new CFruta("P101", "Naranja Florida Primium", 30, 90.5f);
		fruteria[2] = new CFruta("P102", "Uva Racimo Galicia", 40, 40.5f);
		fruteria[3] = new CFruta("P103", "Melocotón Brazil", 50, 100.5f);
		fruteria[4] = new CFruta("P104", "Limon Lima Primium", 80, 120.5f);
		total = 5;
	}

	public void vaciar() {
		total = 0;
	}

	public void mostrar() {
		this.mostrarCabecera();
		for (int i = 0; i < total; i++) {
			fruteria[i].mostrar();
		}

	}

	public int dameIndice(String codigo) {
		for (int i = 0; i < total; i++) {
			if (fruteria[i].getCodigo().equals(codigo))
				return i;
		}
		return -1;
	}

	public void mostrarFruta(String codigo) {
		int indice = dameIndice(codigo);
		if (indice == -1) {
			System.out.println("Fruta No Encontrada");
		} else {
			this.mostrarCabecera();
			fruteria[indice].mostrar();
		}
	}

	public void eliminarFruta(String codigo) {
		int indice = dameIndice(codigo);
		while (indice < total - 1) {
			fruteria[indice] = fruteria[indice + 1];
			indice++;
		}
		total--;
		System.out.println("Fruta Eliminada");
	}

	private void mostrarCabecera() {
		System.out.println("CODIGO" + "\tNOMBRE  " + "\t\t\tCANTIDAD  " + "\tPRECIO");
		System.out.println("======" + "\t======  " + "\t\t\t========" + "\t======");
	}

	private void menu() {
		System.out.println("\n  M E N U - 1");
		System.out.println("  ===========");
		System.out.println("1.- LLENAR fruteria");
		System.out.println("2.- VACIAR fruteria");
		System.out.println("3.- MOSTRAR fruteria");
		System.out.println("4.- MOSTRAR fruta");
		System.out.println("5.- ELIMINAR fruta");
		System.out.println("6.- FINAL");
		System.out.print("Pulsa opción: ");
	}

	public int dameOpcion() {
		int opcion;

		menu();
		opcion = Leer.datoInt();
		System.out.println();
		return opcion;
	}

}
