package compilador310_312;

import java.io.File;

import misClases.avaliacion3.Fichero;

public class compi310 {
	public static void main(String[] args) {
		int opcion;
		Fichero file;
		file = new Fichero();
		
		do {
			
			opcion = file.obtenerOpcionPulsada();

			switch (opcion) {
			case 1:
				file.asignaFichero();
				file.amosa();

				break;
			case 2:
				File Origen=file.asignaFicheroLectura();
				File Destino=file.asignaFicheroEscritura();
				file.copia(Origen,Destino);

				break;
			case 3:
				System.out.println("Opcion NO Implementada");
				break;
			case 4:
				System.out.println("Opcion NO Implementada");
				break;
			case 5:
				System.out.println("Opcion NO Implementada");
				break;
			case 6:
				System.out.println("Opcion NO Implementada");
				break;
			case 7:
				System.out.println("Opcion NO Implementada");
				break;
			case 8:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");
			}
		} while (opcion != 8);

	}

}