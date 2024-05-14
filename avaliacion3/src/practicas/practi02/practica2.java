package practicas.practi02;

public class practica2 {
	public static void main(String[] args) {
		CJuzgado juzgado = new CJuzgado();

		int opcion;
		do {
			opcion = juzgado.dameOpcion();
			String identificador;
			switch (opcion) {
			case 1:
				juzgado.llenar();
				System.out.println("Juzgado LLENO");
				break;
			case 2:
				juzgado.vaciar();
				System.out.println("Juzgado VACIO");
				break;
			case 3:
				juzgado.mostrar();
				break;
			case 4:
				juzgado.insertarProceso();
				break;
			case 5:
				System.out.print("Dame identificador de proceso: ");
				identificador = Leer.datoString();
				juzgado.modificarProceso(identificador);
				break;
			case 6:
				System.out.print("Dame identificador de proceso: ");
				identificador = Leer.datoString();
				juzgado.eliminarProceso(identificador);
				break;
			case 7:
				System.out.println("FINAL");
				break;
			case 8:
				System.out.print("Dame identificador de proceso: ");
				identificador = Leer.datoString();
				juzgado.mostrarProceso(identificador);
				break;
			default:
				System.out.println("OPCION Erronea");
			}
		} while (opcion != 7);

	}
}
