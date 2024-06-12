package preparatorios.prepara03b;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;




public class CFruteria {

	private CFruta[] fruteria;
	private DataOutputStream dos;
	private DataInputStream dis;
	private File fichero;
	int total;

	public CFruteria(File fichero) {
		fruteria = new CFruta[10];
		this.fichero = fichero;
		total=0;
	}

	public void llenar() {
		vaciar();
		fruteria[0]=new CFruta("P100", "Naranja Valenciana", 20, 30.5f);
		fruteria[1]=new CFruta("P101", "Naranja Florida Primium", 30, 90.5f);
		fruteria[2]=new CFruta("P102", "Uva Racimo Galicia", 40, 40.5f);
		fruteria[3]=new CFruta("P103", "Melocotón Brazil", 50, 100.5f);
		fruteria[4]=new CFruta("P104", "Limon Lima Primium", 80, 120.5f);
		total=5;
	}

	public void vaciar() {
		total=0;
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

	

	public void restaurar() {
		total=0;
		if (fichero.exists()) {
			try {
				dis = new DataInputStream(new FileInputStream(fichero));
				while (dis.available() > 0) {
					String codigo = dis.readUTF();
					String nombre = dis.readUTF();
					int cantidad = dis.readInt();
					float precio = dis.readFloat();
					dis.skip(1);

					fruteria[total] = new CFruta(codigo, nombre, cantidad, precio);
					total++;
					
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
		

		try {
			dos = new DataOutputStream(new FileOutputStream(fichero));
			dos.flush();

			for(int i =0;i<total;i++) {

				dos.writeUTF(fruteria[i].getCodigo());
				dos.writeUTF(fruteria[i].getNombre());
				dos.writeInt(fruteria[i].getCantidad());
				dos.writeFloat(fruteria[i].getPrecio());
				dos.write('\n');

			}


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


	

	public void mostrarFruta(String codigo) {
		int indice = dameIndice(codigo);
		if (indice == -1) {
			System.out.println("Fruta No Encontrada");
		} else {
			this.mostrarCabecera();
			fruteria[indice].mostrar();
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
