package examenTercera24.datos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import examenTercera24.utilidades.Leer;



public class CTallerLeliadoura {
	private RandomAccessFile raf;
	private int nregs;
	private int tamReg;
	private File fichero;

	public CTallerLeliadoura(File fichero) throws IOException {
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

	public void insertar(int i, CVehiculo coche) throws IOException {
		raf.seek(i * tamReg);
		raf.writeUTF(coche.getMatricula());
		raf.writeFloat(coche.getPrecio());
		raf.writeInt(coche.getAnio());
		raf.writeUTF(coche.getMarca());
		raf.writeUTF(coche.getModelo());
	}

	public void llenar() throws IOException {
		vaciar();
		insertar(0, new CVehiculo("6789 GHJ",12232.55f, 2002, "Citroën", "Aircross"));
		insertar(1, new CVehiculo("3456 DFG",30821.15f, 2020, "Hyundai", "Tucson"));
		insertar(2, new CVehiculo("1234 BCD",23825.25f, 1990, "Kia", "Picanto"));
		insertar(3, new CVehiculo("5678 FGH",28935.45f, 2018, "Seat", "Alhambra"));
		insertar(4, new CVehiculo("2468 HJK",80938.15f, 1999, "Ford", "Explorer"));
		insertar(5, new CVehiculo("2345 CDF",16312.95f, 2007, "Renault", "Arkana"));
		nregs = 6;
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

	private CVehiculo dameDatosCoche() {
		System.out.print("Dame matrícula: ");
		String matricula = Leer.datoString();
		System.out.print("Dame precio: ");
		float precio = Leer.datoFloat();
		System.out.print("Dame año: ");
		int anio = Leer.datoInt();
		System.out.print("Dame marca: ");
		String marca = Leer.datoString();
		System.out.print("Dame modelo: ");
		String modelo = Leer.datoString();

		return new CVehiculo(matricula,precio,anio,marca,modelo);
	}

	private CVehiculo dameCoche(int pos) throws IOException {
		String matricula;
		float precio;
		int anio;
		String marca;
		String modelo;

		if (pos >= 0 && pos < nregs) {
			raf.seek(pos * tamReg);
			matricula = raf.readUTF();
			precio = raf.readFloat();
			anio = raf.readInt();
			marca = raf.readUTF();
			modelo = raf.readUTF();
			return new CVehiculo(matricula,precio,anio,marca,modelo);
		} else
			return null;
	}

	private int damePosicion(String cod) throws IOException {
		int i;
		String matricula;

		i = 0;
		while (i < nregs) {
			raf.seek(i * tamReg);
			matricula = raf.readUTF();
			if (matricula.equals(cod))
				return i;
			else
				i++;
		}
		return -1;

	}

	public void mostrar() throws IOException {
		if (nregs == 0) {
			System.out.println("Taller Leliadoura sin vehículos");
			return;
		}
		CVehiculo coche;
		int pos;

		mostrarCabecera();
		for (pos = 0; pos < nregs; pos++) {

			coche = dameCoche(pos);
			coche.mostrar();

		}
	}

	private void mostrarCabecera() {
		System.out.println("MATRICULA" + "\tPRECIO  " + "\tAÑO " + "\tMARCA"+ "\t\tMODELO");
		System.out.println("=========" + "\t======  " + "\t===" + "\t=====" + "\t\t======" );
	}

	public void mostrarCoche(String cod) throws IOException {
		CVehiculo coche;
		int pos;

		pos = damePosicion(cod);
		coche = dameCoche(pos);
		if (coche == null)
			System.out.println("Vehículo no ENCONTRADO");
		else {
			mostrarCabecera();
			coche.mostrar();
		}
	}

	public void insertarCoche() throws IOException {
	
		CVehiculo coche;

		coche = dameDatosCoche();
		insertar(nregs, coche);
		nregs++;
	}


	public void modificarCoche(String cod) throws IOException {
		CVehiculo coche;
		int posicion;

		posicion = damePosicion(cod);
		coche = dameCoche(posicion);
		if (coche == null)
			System.out.println("Vehículo no ENCONTRADO");
		else {
			mostrarCabecera();
			coche.mostrar();

			coche = dameDatosCoche();
			insertar(posicion, coche);
			System.out.println("\nVehículo MODIFICADO");
		}
	}

	public void eliminarCoche(String cod) throws IOException {
		CVehiculo coche;
		int posicion;

		posicion = damePosicion(cod);
		coche = dameCoche(posicion);
		if (coche == null)
			System.out.println("Vehículo no ENCONTRADO");
		else {
			coche.setPrecio(-1.0f);
			insertar(posicion, coche);
			System.out.println("Vehículo ELIMINADO");
		}
	}

	public void actualizar() throws IOException {
		// Creamos un fichero temporal
		File temp = new File("ficheiro.tmp");
		CTallerLeliadoura ftemp = new CTallerLeliadoura(temp);
		CVehiculo coche;
		int i = 0; 

		for (int reg_i = 0; reg_i < nregs; reg_i++) {
			coche = this.dameCoche(reg_i);
			if (coche.getPrecio() != -1.0) {
				ftemp.insertar(i, coche);
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
		System.out.println("\n  M E N U - Examen Tercera");
		System.out.println("  ========================");
		System.out.println("1.- LLENAR Taller Leliadoura");
		System.out.println("2.- VACIAR Taller Leliadoura");
		System.out.println("3.- MOSTRAR Taller Leliadoura");
		System.out.println("4.- MOSTRAR Vehículo");
		System.out.println("5.- INSERTAR Vehículo");
		System.out.println("6.- MODIFICAR Vehículo");
		System.out.println("7.- ELIMINAR Vehículo");
		System.out.println("8.- ACTUALIZAR Taller Leliadoura");
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
