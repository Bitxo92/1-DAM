package practicas.practi02;

public class CJuzgado {
	private CProceso[] juzgado = new CProceso[10];
	private int total = 0;

	public void llenar() {
		juzgado[0] = new CProceso("P101", "Empresa ARA", 1230.5F);
		juzgado[1] = new CProceso("P102", "Punto limpio", 2245.75F);
		juzgado[2] = new CProceso("P103", "Divorcio Pedro", 538.25F);
		juzgado[3] = new CProceso("P104", "Concesionario", 3429.5F);
		juzgado[4] = new CProceso("P105", "Alquiler piso", 826.25F);
		total = 5;
	}

	public void vaciar() {
		total = 0;
	}

	private CProceso nuevoProceso() {
		System.out.print("Identificador: ");
		String identificador = Leer.datoString();
		System.out.print("Titulo: ");
		String titulo = Leer.datoString();
		System.out.print("Arancel: ");
		float arancel = Leer.datoFloat();
		return new CProceso(identificador, titulo, arancel);
	}

	public void insertarProceso() {
		juzgado[total] = nuevoProceso();
		++total;
		System.out.println("Proceso INSERTADO");
	}

	private int dameIndice(String ide) {
		for (int i = 0; i < total; ++i) {
			if (ide.equals(juzgado[i].getIdentificador())) {
				return i;
			}
		}

		return -1;
	}

	private void modifica(int i) {
		mostrarCabecera();
		juzgado[i].mostrar();
		System.out.print("NUEVO identificador: ");
		juzgado[i].setIdentificador(Leer.datoString());
		System.out.print("NUEVO titulo: ");
		juzgado[i].setTitulo(Leer.datoString());
		System.out.print("NUEVO arancel: ");
		juzgado[i].setArancel(Leer.datoFloat());
	}
	public void mostrarProceso(String ide) {
		int i = dameIndice(ide);
		
		//si no encuentra el indice devuelve -1
		if (i == -1) {
			System.out.println("Proceso no ENCONTRADO");
		} else {
			mostrarCabecera();
			juzgado[i].mostrar();
			
		}

	}

	public void modificarProceso(String ide) {
		int indice = dameIndice(ide);
		//si no encuentra el indice devuelve -1
		if (indice == -1) {
			System.out.println("Proceso no ENCONTRADO");
		} else {
			modifica(indice);
			System.out.println("Proceso MODIFICADO");
		}

	}

	private void elimina(int i) {
		while (i < total - 1) {
			juzgado[i] = juzgado[i + 1];
			++i;
		}

		--total;
	}

	public void eliminarProceso(String ide) {
		int indice = dameIndice(ide);
		if (indice == -1) {
			System.out.println("Proceso no ENCONTRADO");
		} else {
			elimina(indice);
			System.out.println("Proceso ELIMINADO");
		}

	}

	public void mostrar() {
		if (total == 0) {
			System.out.println("Juzgado VACIO");
		} else {
			mostrarCabecera();

			for (int i = 0; i < total; ++i) {
				juzgado[i].mostrar();
			}
		}

	}

	private void mostrarCabecera() {
		System.out.println("IDENTIFICADOR\tTITULO  \tARANCEL");
		System.out.println("=============\t======  \t=======");
	}

	private void menu() {
		System.out.println("\n  M E N U - Prática 2");
		System.out.println("  ===================");
		System.out.println("1.- LLENAR Juzgado");
		System.out.println("2.- VACIAR Juzgado");
		System.out.println("3.- MOSTRAR Juzgado");
		System.out.println("4.- INSERTAR Proceso");
		System.out.println("5.- MODIFICAR Proceso");
		System.out.println("6.- ELIMINAR Proceso");
		System.out.println("7.- FINAL");
		System.out.println("8.- MOSTRAR Proceso");
		System.out.print("Pulsa opción: ");
	}

	public int dameOpcion() {
		menu();
		int opcion = Leer.datoInt();
		System.out.println();
		return opcion;
	}
}
