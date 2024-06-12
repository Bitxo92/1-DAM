package preparatorios.prepara05;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import preparatorios.prepara03.CFruta;
import preparatorios.prepara03.Leer;

public class CFruteria {
	private RandomAccessFile raf;
	private int nregs;
	private int tamReg;
	private File fichero;

	public CFruteria(File fichero) throws IOException {
		this.fichero = fichero;
		if (fichero.exists() && !fichero.isFile())
			throw new IOException(fichero.getName() + " es un DIRECTORIO");
		raf = new RandomAccessFile(fichero, "rw");
		tamReg = 100;
		nregs = (int) Math.ceil((double) raf.length() / (double) tamReg);

	}

	public void cerrar() throws IOException {
		raf.close();
	}

	public void insertar(int i, CFruta fruta) throws IOException {
		raf.seek(i * tamReg);
		raf.writeUTF(fruta.getCodigo());
		raf.writeUTF(fruta.getNombre());
		raf.writeInt(fruta.getCantidad());
		raf.writeFloat(fruta.getPrecio());
	}

	public void llenar() throws IOException {
		vaciar();
		insertar(0, new CFruta("P100", "Naranja Valenciana", 20, 30.5f));
		insertar(1, new CFruta("P101", "Naranja Florida Primium", 30, 90.5f));
		insertar(2, new CFruta("P102", "Uva Racimo Galicia", 40, 40.5f));
		insertar(3, new CFruta("P103", "Melocotón Brazil", 50, 100.5f));
		insertar(4, new CFruta("P104", "Limon Lima Primium", 80, 120.5f));
		nregs = 5;
	}

	public void vaciar() throws IOException {
		raf.close();
		if (!fichero.delete())
			throw new IOException("No se borró el fichero: " + fichero.getName());
		else {
			raf = new RandomAccessFile(fichero, "rw");
			nregs = 0;
		}
	}

	private CFruta dameDatosFruta() {
		System.out.print("Codigo: ");
		String codigo = Leer.datoString();
		System.out.print("Nombre: ");
		String nombre = Leer.datoString();
		System.out.print("Cantidad: ");
		int cantidad = Leer.datoInt();
		System.out.print("precio: ");
		float precio = Leer.datoFloat();

		return new CFruta(codigo, nombre, cantidad, precio);
	}

	private CFruta dameFruta(int pos) throws IOException {
		String codigo;
		String nombre;
		int cantidad;
		float precio;

		if (pos >= 0 && pos < nregs) {
			raf.seek(pos * tamReg);
			codigo = raf.readUTF();
			nombre = raf.readUTF();
			cantidad = raf.readInt();
			precio = raf.readFloat();
			return new CFruta(codigo, nombre, cantidad, precio);
		} else
			return null;
	}

	private int damePosicion(String cod) throws IOException {
		int i;
		String codigo;

		i = 0;
		while (i < nregs) {
			raf.seek(i * tamReg);
			codigo = raf.readUTF();
			if (codigo.equals(cod))
				return i;
			else
				i++;
		}
		return -1;

	}

	public void mostrar() throws IOException {
		if (nregs == 0) {
			System.out.println("Fruteria VACIA");
			return;
		}
		CFruta fruta;
		int pos;

		mostrarCabecera();
		for (pos = 0; pos < nregs; pos++) {

			fruta = dameFruta(pos);
			fruta.mostrar();

		}
	}

	private void mostrarCabecera() {
		System.out.println("CODIGO" + "\tNOMBRE  " + "\t\t\tCANTIDAD  " + "\tPRECIO");
		System.out.println("======" + "\t======  " + "\t\t\t========" + "\t======");
	}

	public void mostrarFruta(String cod) throws IOException {
		CFruta fruta;
		int pos;

		pos = damePosicion(cod);
		fruta = dameFruta(pos);
		if (fruta == null)
			System.out.println("fruta no ENCONTRADA");
		else {
			mostrarCabecera();
			fruta.mostrar();
		}
	}

	public void insertarFruta() throws IOException {
		/*
		 * if (nregs == 0) { System.out.println("Fruteria VACIA"); return; }
		 */
		CFruta fruta;

		fruta = dameDatosFruta();
		insertar(nregs, fruta);
		nregs++;
	}

	public void insertarFruta(CFruta fruta) throws IOException {
		/*
		 * if (nregs == 0) { System.out.println("Fruteria VACIA"); return; }
		 */

		insertar(nregs, fruta);
		nregs++;
	}

	public void modificarFruta(String cod) throws IOException {
		CFruta fruta;
		int posicion;

		posicion = damePosicion(cod);
		fruta = dameFruta(posicion);
		if (fruta == null)
			System.out.println("fruta no ENCONTRADA");
		else {
			mostrarCabecera();
			fruta.mostrar();

			fruta = dameDatosFruta();
			insertar(posicion, fruta);
			System.out.println("fruta MODIFICADA");
		}
	}

	public void eliminarFruta(String cod) throws IOException {
		CFruta fruta;
		int posicion;

		posicion = damePosicion(cod);
		fruta = dameFruta(posicion);
		if (fruta == null)
			System.out.println("fruta no ENCONTRADA");
		else {
			fruta.setPrecio(0f);
			insertar(posicion, fruta);
			System.out.println("fruta ELIMINADA");
		}
	}

	public void actualizar() throws IOException {
		// Creamos un fichero temporal
		File temp = new File("ficheiro.tmp");
		CFruteria ftemp = new CFruteria(temp);
		CFruta fruta;
		int i = 0; 

		for (int reg_i = 0; reg_i < nregs; reg_i++) {
			fruta = this.dameFruta(reg_i);
			if (fruta.getPrecio() != 0) {
				ftemp.insertar(i, fruta);
				i++;
			}
		}

		this.cerrar(); // Cerrar el archivo principal antes de manipularlo

		// Eliminar el archivo principal
		if (!fichero.delete())
			throw new IOException("No se pudo eliminar el fichero: " + fichero.getName());
		ftemp.cerrar();
		// Renombrar el archivo temporal al nombre del archivo principal
		if (!temp.renameTo(fichero))
			throw new IOException(
					"No se pudo renombrar el fichero temporal: " + temp.getName() + " a " + fichero.getName());
		try {
			this.raf = new RandomAccessFile(fichero, "rw");
			nregs = i;
		} catch (IOException e) {
			throw new IOException("No se pudo abrir el fichero principal: " + fichero.getName());
		}
	}

	private void menu() {
		System.out.println("\n  M E N U - 5");
		System.out.println("  ===========");
		System.out.println("1.- LLENAR fruteria");
		System.out.println("2.- VACIAR fruteria");
		System.out.println("3.- MOSTRAR fruteria");
		System.out.println("4.- MOSTRAR fruta");
		System.out.println("5.- INSERTAR fruta");
		System.out.println("6.- MODIFICAR fruta");
		System.out.println("7.- ELIMINAR fruta");
		System.out.println("8.- ACTUALIZAR fruteria");
		System.out.println("9.- FINAL");
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
