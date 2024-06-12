package preparatorios.ejem04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CLibreria {
	private CLibro[] libreria;
	private int total;
	private ObjectOutputStream flujoSalida;
	private ObjectInputStream flujoEntrada;
	private File fichero;

	public CLibreria(File fich) {
		libreria = new CLibro[10];
		total = 0;
		fichero = fich;
	}

	public void llenar() {
		libreria[0] = new CLibro(100, "La Celestina", 35.95F);
		libreria[1] = new CLibro(200, "El Quijote", 45.75F);
		libreria[2] = new CLibro(300, "La Biblia", 38.25F);
		libreria[3] = new CLibro(400, "El Barroco", 29.85F);
		libreria[4] = new CLibro(500, "La Colmena", 26.15F);
		total = 5;
	}

	public void vaciar() {
		total = 0;
	}

	public void salvar() {
	    // se debe implementar
	}

	public void restaurar() {
	    // se debe implementar
	}

	private CLibro dameLibro(int cod) {
		int i;

		i = 0;
		while (i < total)
			if (libreria[i].getCodigo() == cod)
				return libreria[i];
			else
				i++;
		return null;

	}

	private int dameIndice(int cod) {
		int i;

		i = 0;
		while (i < total)
			if (libreria[i].getCodigo() == cod)
				return i;
			else
				i++;
		return -1;

	}

	private void elimina(int i) {
	    // se debe implementar
	}

	public void eliminarLibro(int codigo) {
	    // se debe implementar
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
		int i;

		if (total == 0)
			System.out.println("libreria VACIA");
		else {
			mostrarCabecera();
			i = 0;
			while (i < total) {
				libreria[i].mostrar();
				i++;
			}
		}
	}

	private void mostrarCabecera() {
		System.out.println("CODIGO" + "\tTITULO  " + "\tPRECIO");
		System.out.println("======" + "\t======  " + "\t======");
	}

	private void menu() {
		System.out.println("\n  M E N U - 4");
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
