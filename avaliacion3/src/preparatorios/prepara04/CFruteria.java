package preparatorios.prepara04;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CFruteria {
	private CFruta[] fruteria;
	int total;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	private File fichero;

	public CFruteria(File fichero) {
		fruteria = new CFruta[10];
		total = 0;
		this.fichero = fichero;
	}

	public void llenar() {
		fruteria[0] = new CFruta("P100", "Naranja Valenciana", 20, 30.5f);
		fruteria[1] = new CFruta("P101", "Naranja Florida Primium", 30, 90.5f);
		fruteria[2] = new CFruta("P102", "Uva Racimo Galicia", 40, 40.5f);
		fruteria[3] = new CFruta("P103", "Melocotón Brazil", 50, 100.5f);
		fruteria[4] = new CFruta("P104", "Limon Lima Primium", 80, 120.5f);
		total = 5;
	}

	public void vaciar() {
		total = 0;
	}

	public void mostrar() {
		this.mostrarCabecera();
		for (int i = 0; i < total; i++) {
			fruteria[i].mostrar();
		}

	}

	public int dameIndice(String codigo) {
		for (int i = 0; i < total; i++) {
			if (fruteria[i].getCodigo().equals(codigo))
				return i;
		}
		return -1;
	}

	private CFruta nuevaFruta() {
		System.out.print("Codigo: ");
		String codigo = Leer.datoString();

		System.out.print("Nombre: ");
		String nombre = Leer.datoString();

		System.out.print("Cantidad: ");
		int cantidad = Leer.datoInt();

		System.out.print("Precio: ");
		float precio = Leer.datoFloat();

		return new CFruta(codigo, nombre, cantidad, precio);
	}

	public void insertarFruta() {
		fruteria[total] = this.nuevaFruta();
		total++;
		System.out.println("Fruta Insertada");
	}

	public void mostrarFruta(String codigo) {
		int indice = dameIndice(codigo);
		if (indice == -1) {
			System.out.println("Fruta No Encontrada");
		} else {
			this.mostrarCabecera();
			fruteria[indice].mostrar();
		}
	}

	private void modifica(int i) {
		this.mostrarCabecera();
		fruteria[i].mostrar();

		System.out.print("Nuevo Codigo: ");
		fruteria[i].setCodigo(Leer.datoString());

		System.out.print("Nuevo Nombre: ");
		fruteria[i].setNombre(Leer.datoString());

		System.out.print("Nueva Cantidad: ");
		fruteria[i].setCantidad(Leer.datoInt());

		System.out.print("Nuevo Precio: ");
		fruteria[i].setPrecio(Leer.datoFloat());

	}

	public void modficarFruta(String id) {
		int indice = this.dameIndice(id);

		if (indice == -1) {
			System.out.println("Fruta No Encontrado");
		}

		else {
			this.modifica(indice);
			System.out.println("Fruta " + id + " Modificada");
		}
	}

	public void eliminarFruta(String codigo) {
		int indice = dameIndice(codigo);
		while (indice < total - 1) {
			fruteria[indice] = fruteria[indice + 1];
			indice++;
		}
		total--;
		System.out.println("Fruta Eliminada");
	}

	public void salvar() {

		try {

			oos = new ObjectOutputStream(new FileOutputStream(fichero));

			for (int i = 0; i < total; i++) {
				oos.writeObject(fruteria[i]);
				oos.write('\n');

			}

		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			if (ois != null)
				try {
					ois.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
		}

	}

	public void restaurar() {
		total = 0;

		if (fichero.exists()) {
			try {
				ois = new ObjectInputStream(new FileInputStream(fichero));
				while (true) {
					try {
						fruteria[total] = (CFruta) ois.readObject();
						ois.skip(1);

						total++;
					} catch (EOFException eof) {
						break; // final de fichero
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Fichero NO ENCONTRADO");
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
		System.out.println("5.- INSERTAR fruta");
		System.out.println("6.- MODIFICAR fruta");
		System.out.println("7.- ELIMINAR fruta");
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
