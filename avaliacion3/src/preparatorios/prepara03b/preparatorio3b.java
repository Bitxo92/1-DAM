package preparatorios.prepara03b;

import java.io.File;

public class preparatorio3b {

	public static void main(String[] args) {
		CFruteria fruteria;
		File fichero;
		int numero;
		String codigo;

		fichero = new File("prepara03b.dat");
		fruteria = new CFruteria(fichero);
		do {
			numero = fruteria.dameOpcion();
			switch (numero) {
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
				System.out.print("Dame codigo de la fruta: ");
				codigo = Leer.datoString();
				fruteria.mostrarFruta(codigo);
				break;
			case 5:
				System.out.print("Insertar Fruta");
				fruteria.insertarFruta();
				break;
			case 6:
				System.out.print("Dame codigo de la Fruta: ");
				codigo = Leer.datoString();
				fruteria.modficarFruta(codigo);
				break;
			case 7:
				System.out.print("Dame codigo de la Fruta: ");
				codigo = Leer.datoString();
				fruteria.eliminarFruta(codigo);
				break;
			case 8:
				System.out.print("Arraylist guardada en fichero");
				fruteria.salvar();
				break;
			case 9:
				System.out.print("Arraylist Restaurada");
				fruteria.restaurar();
				break;
			case 10:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");
				break;
			}
		} while (numero != 10);
	}
}
