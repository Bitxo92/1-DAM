package preparatorios.prepara03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class CFruteria {

	private ArrayList<CFruta> fruteria;
	private DataOutputStream dos;
	private DataInputStream dis;
	private File fichero;

	public CFruteria(File fichero) {
		fruteria = new ArrayList<CFruta>();
		this.fichero = fichero;
	}

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
			fruta = (CFruta) iterator.next();
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

	private CFruta nuevaFruta() {
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

	public void insertarFruta() {
		fruteria.add(nuevaFruta());

	}

	private CFruta dameFrutaModificada(CFruta fruta) {
		this.mostrarCabecera();
		fruta.mostrar();

		System.out.print("Nuevo Codigo: ");
		fruta.setCodigo(Leer.datoString());

		System.out.print("Nuevo Nombre: ");
		fruta.setNombre(Leer.datoString());

		System.out.print("Nueva Cantidad: ");
		fruta.setCantidad(Leer.datoInt());

		System.out.print("Nuevo Precio: ");
		fruta.setPrecio(Leer.datoFloat());

		return fruta;
	}

	public void restaurar() {
		fruteria.removeAll(fruteria);
		if (fichero.exists()) {
			try {
				dis = new DataInputStream(new FileInputStream(fichero));
				while (dis.available() > 0) {
					String codigo = dis.readUTF();
					String nombre = dis.readUTF();
					int cantidad = dis.readInt();
					float precio = dis.readFloat();
					dis.skip(1);

					CFruta fruta = new CFruta(codigo, nombre, cantidad, precio);
					fruteria.add(fruta);
				}
			}

			catch (IOException e) {

				e.printStackTrace();
			} finally {
				if (dis != null) {
					try {
						dis.close();
					} catch (IOException e) {

						e.printStackTrace();
					}
				}
			}
		} else {
			System.out.println("Fichero No Existe");
		}

	}

	public void salvar() {
		Iterator<CFruta> iterator = fruteria.iterator();

		dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream(fichero));
			dos.flush();

			while (iterator.hasNext()) {

				CFruta fruta = iterator.next();

				dos.writeUTF(fruta.getCodigo());
				dos.writeUTF(fruta.getNombre());
				dos.writeInt(fruta.getCantidad());
				dos.writeFloat(fruta.getPrecio());
				dos.write('\n');

			}

//			for (CFruta fruta : fruteria) {
//
//				dos.writeUTF(fruta.getCodigo());
//				dos.writeUTF(fruta.getNombre());
//				dos.writeInt(fruta.getCantidad());
//				dos.writeFloat(fruta.getPrecio());
//				dos.write('\n');
//			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

		} finally {
			if (dos != null)
				try {
					dos.close();
				} catch (IOException e) {

					e.printStackTrace();
				}
		}

	}

	public void modificarFruta(String id) {
		CFruta fruta = this.dameFruta(id);

		if (fruta == null) {
			System.out.println("Proceso No Encontrado");
		} else {
			int indice = fruteria.indexOf(fruta);
			fruta = this.dameFrutaModificada(fruta);
			fruteria.set(indice, fruta);

		}

	}

	private CFruta dameFruta(String codigo) {
		Iterator<CFruta> iterator = fruteria.iterator();
		CFruta fruta;

		while (iterator.hasNext()) {
			fruta = (CFruta) iterator.next();
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
