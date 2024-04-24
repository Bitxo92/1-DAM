package compilador313_315;

import java.io.File;

import misClases.avaliacion3.Fichero;

public class compi315 {

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
				File Origen = file.asignaFicheroLectura();
				File Destino = file.asignaFicheroEscritura();
				file.copia(Origen, Destino);

				break;
			case 3:
				file.amosaFinal();
				
				break;
			case 4:
				file.amosaInicio();
				break;
			case 5:
				file.amosaLineaMaior(file.retornaFichero());
				break;
			case 6:
				file.amosaLineaMaiorMenor(file.retornaFichero());
				break;
			case 7:
				file.amosaPalabras(file.retornaFichero());
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

