package preparatorios.prepara01;

import java.util.ArrayList;
import java.util.Iterator;

public class CFruteria {

	private ArrayList<CFruta> fruteria = new ArrayList<>();

	public void llenar() {
		fruteria.removeAll(fruteria);
		fruteria.add(new CFruta("P100", "Naranja Valenciana", 20, 30.5f));
		fruteria.add(new CFruta("P101", "Naranja Florida Primium", 30, 90.5f));
		fruteria.add(new CFruta("P102", "Uva Racimo Galicia", 40, 40.5f));
		fruteria.add(new CFruta("P103", "Melocotón Brazil", 50, 100.5f));
		fruteria.add(new CFruta("P104", "Limon Lima Primium", 80, 120.5f));
	}

	public void vaciar() {
		fruteria.removeAll(fruteria);
	}

	private void mostrarDato(Iterator<CFruta> iterator) {
		CFruta fruta;
		while (iterator.hasNext()) {
			fruta = (CFruta)iterator.next();
//			mostrarDato(iterator);
			fruta.mostrar();
		}

	}

	public void mostrar() {
		Iterator<CFruta> iterator = fruteria.iterator();

		if (fruteria.isEmpty())
			System.out.println("fruteria VACIA");
		else {
			mostrarCabecera();
			mostrarDato(iterator);

		}
	}

	private CFruta dameFruta(String codigo) {
		Iterator<CFruta> iterator = fruteria.iterator();
		CFruta fruta;

		while (iterator.hasNext()) {
			fruta = (CFruta)iterator.next();
			if (fruta.getCodigo().equals(codigo))
				return fruta;
		}
		return null;
	}

	public void mostrarFruta(String codigo) {
		CFruta fruta;

		fruta = dameFruta(codigo);
		if (fruta == null)
			System.out.println("fruta no ENCONTRADA");
		else {
			mostrarCabecera();
			fruta.mostrar();
		}
	}

	public void eliminarFruta(String codigo) {
		CFruta fruta;

		fruta = dameFruta(codigo);
		if (fruta == null)
			System.out.println("fruta no ENCONTRADA");
		else {
			fruteria.remove(fruta);
			System.out.println("fruta ELIMINADA");

		}
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
