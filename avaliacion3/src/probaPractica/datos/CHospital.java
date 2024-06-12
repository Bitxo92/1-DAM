package probaPractica.datos;

import probaPractica.utilidades.Leer;

public class CHospital {

	private CPaciente[] paciente = new CPaciente[10];
	private int total = 0;

	public void llenar() {
		paciente[0] = new CPaciente("P01", "Ignacio Arias", 25, 38.2f);
		paciente[1] = new CPaciente("P02", "Ana Menéndez", 39, 39.1f);
		paciente[2] = new CPaciente("P03", "Lucas García", 32, 38.6f);
		paciente[3] = new CPaciente("P04", "Mercedes Novoa", 18, 37.9f);
		paciente[4] = new CPaciente("P05", "María Argüelles", 15, 38.7f);
		total = 5;
	}

	public void vaciar() {

		for (int i = 0; i < total; i++) {
			paciente[i] = null;

		}
		total = 0;
	}

	public void mostrar() {
		if (total == 0) {
			try {
				this.mostrarCabecera();
				for (int i = 0; i < 5; i++) {

					System.out.println(paciente[i]);

				}

			} catch (NullPointerException e) {

			}
		} else {
			this.mostrarCabecera();
			for (int i = 0; i < total; i++) {
				paciente[i].mostrar();
			}
		}
	}

	private int dameIndice(String ide) {
		for (int i = 0; i < total; ++i) {
			if (ide.equals(paciente[i].getCodigo())) {
				return i;
			}
		}

		return -1;
	}

	public void mostrarPaciente(String ide) {
		int i = dameIndice(ide);

		// si no encuentra el indice devuelve -1
		if (i == -1) {
			System.out.println("Paciente no ENCONTRADO");
		} else {
			mostrarCabecera();
			paciente[i].mostrar();

		}

	}

	private void mostrarCabecera() {
		System.out.println("CODIGO \tNOMBRE \t\t\tHABITACION \tTEMPERATURA");
		System.out.println("======\t====== \t\t\t==========\t==========");
	}

	private void menu() {
		System.out.println("\n  M E N U - Exame");
		System.out.println("  ===============");
		System.out.println("1.- LLENAR Hospital");
		System.out.println("2.- VACIAR Hospital");
		System.out.println("3.- Mostrar Hospital");
		System.out.println("4.- Mostrar Paciente");
		System.out.println("5.- FINAL");
		System.out.print("Pulsa opción: ");
	}

	public int dameOpcion() {
		this.menu();
		int opcion = Leer.datoInt();
		System.out.println();
		return opcion;
	}

}
