package preparatorios.ejem04;

import java.io.File;

public class ejemplo4 {

	public static void main(String[] args) {
		CLibreria libreria;
		File fichero;
		int numero;
		int codigo;
		
		fichero=new File("ejem04.dat");
		libreria = new CLibreria(fichero);
		do {
			numero = libreria.dameOpcion();
			switch (numero) {
			case 1:
				libreria.llenar();
				System.out.println("Libreria LLENA");
				break;
			case 2:
				libreria.vaciar();
				System.out.println("Libreria VACIA");
				break;
			case 3:
				libreria.mostrar();
				break;
			case 4:
				System.out.print("Dame código de libro: ");
				codigo = Leer.datoInt();
				libreria.mostrarLibro(codigo);
				break;
			case 5:
				System.out.print("OPCION pendiente de implementar");
				break;
			case 6:
				System.out.print("OPCION pendiente de implementar");
				break;
			case 7:
				System.out.print("OPCION pendiente de implementar");
				break;
			case 8:
				System.out.print("OPCION pendiente de implementar");
				break;
			case 9:
				System.out.print("OPCION pendiente de implementar");
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
