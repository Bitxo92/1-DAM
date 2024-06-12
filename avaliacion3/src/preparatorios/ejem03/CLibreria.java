package preparatorios.ejem03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CLibreria {
	private ArrayList<CLibro> libreria;
	private DataOutputStream flujoSalida;
	private DataInputStream flujoEntrada;
	private File fichero;

	public CLibreria(File fich) {
		libreria = new ArrayList<CLibro>();
		fichero = fich;
	}

	public void llenar() {
		libreria.removeAll(libreria);
		libreria.add(new CLibro(100, "La Celestina", 35.95F));
		libreria.add(new CLibro(200, "El Quijote", 45.75F));
		libreria.add(new CLibro(300, "La Biblia", 38.25F));
		libreria.add(new CLibro(400, "El Barroco", 29.85F));
		libreria.add(new CLibro(500, "La Colmena", 26.15F));
	}

	public void vaciar() {
		libreria.removeAll(libreria);
	}

	public void salvar() {
	    // se debe implementar
	}

	public void restaurar() {
	    // se debe implementar
	}

	private CLibro dameLibro(int cod) {
		Iterator<CLibro> iterator = libreria.iterator();
		CLibro libro;

		while (iterator.hasNext()) {
			libro = iterator.next();
			if (libro.getCodigo() == cod)
				return libro;
		}
		return null;
	}

	public void eliminarLibro(int codigo) {
		CLibro libro;

		libro = dameLibro(codigo);
		if (libro == null)
			System.out.println("libro no ENCONTRADO");
		else {
			libreria.remove(libro);
			System.out.println("libro ELIMINADO");

		}
	}

	public void insertarLibro() {
	    // se debe implementar
	}

	public void modificarLibro(int codigo) {
	    // se debe implementar
	}

	public void mostrarLibro(int cod) {
		CLibro libro;

		libro = dameLibro(cod);
		if (libro == null)
			System.out.println("libro no ENCONTRADO");
		else {
			mostrarCabecera();
			libro.mostrar();
		}
	}

	public void mostrar() {
		Iterator<CLibro> iterator = libreria.iterator();

		if (libreria.isEmpty())
			System.out.println("libreria VACIA");
		else {
			mostrarCabecera();
			while (iterator.hasNext())
				iterator.next().mostrar();
		}
	}

	private void mostrarCabecera() {
		System.out.println("CODIGO" + "\tTITULO  " + "\tPRECIO");
		System.out.println("======" + "\t======  " + "\t======");
	}

	private void menu() {
		System.out.println("\n  M E N U - 3");
		System.out.println("  ===========");
		System.out.println("1.- LLENAR libreria");
		System.out.println("2.- VACIAR libreria");
		System.out.println("3.- MOSTRAR libreria");
		System.out.println("4.- MOSTRAR libro");
		System.out.println("5.- INSERTAR libro");
		System.out.println("6.- MODIFICAR libro");
		System.out.println("7.- ELIMINAR libro");
		System.out.println("8.- SALVAR en fichero");
		System.out.println("9.- RESTAURAR de fichero");
		System.out.println("10.- FINAL");
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
