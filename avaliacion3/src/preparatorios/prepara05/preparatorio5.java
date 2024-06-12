package preparatorios.prepara05;

import java.io.File;
import java.io.IOException;

public class preparatorio5 {
	public static void main(String[] args) {
		CFruteria fruteria;
		File fichero;
		int opcion;
		String codigo;

		fichero = new File("prepara05.dat");
		try {
			fruteria = new CFruteria(fichero);
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
					System.out.print("Dame código de Fruta: ");
					codigo = Leer.datoString();
					fruteria.mostrarFruta(codigo);
					break;
				case 5:
					fruteria.insertarFruta();
					break;
				case 6:
					System.out.print("Dame código de Fruta: ");
					codigo = Leer.datoString();
					fruteria.modificarFruta(codigo);
					break;
				case 7:
					System.out.print("Dame código de Fruta: ");
					codigo = Leer.datoString();
					fruteria.eliminarFruta(codigo);
					break;
				case 8:
					fruteria.actualizar();
					System.out.println("Fruteria ACTUALIZADA");
					break;
				case 9:
					System.out.println("FINAL");
					break;
				default:
					System.out.println("OPCION Erronea");
					break;
				}
			} while (opcion != 9);
		} catch (IOException e) {
		

			e.printStackTrace();
		}
	}

}
