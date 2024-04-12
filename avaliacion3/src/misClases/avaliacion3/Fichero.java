package misClases.avaliacion3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import misClases.utilidades.Leer;

public class Fichero {

	private File archivo;
	private String nombre;
	private String mensaje = "Error: ";

	public Fichero() {

	}

	public void asignaFichero() {

		do {
			System.out.print("Nombre del fichero: ");
			nombre = Leer.datoString();
			archivo = new File(nombre);
		} while (!archivo.exists());

	}

	public void amosa() {
		FileReader fe = null;
		int caracter;
		try {
			fe = new FileReader(archivo);
			while ((caracter = fe.read()) != -1) {
				System.out.print((char) caracter);
			}
		} catch (IOException e) {
			System.out.println(mensaje + e.toString());
		} finally {
			try {
				if (fe != null) {
					fe.close();
				}
			} catch (IOException e) {
				System.out.println(mensaje + e.toString());
			}
		}
	}

	public File asignaFicheroLectura() {
		File archivoOrigen;
		String nombreFichero = null;
		do {
			System.out.print("Nombre del fichero origen: ");
			nombreFichero = Leer.datoString();
			archivoOrigen = new File(nombreFichero);
		} while (!archivoOrigen.exists());
		return archivoOrigen;
	}

	public File asignaFicheroEscritura() {
		File archivoDestino;
		String nombreFichero = null;
		System.out.print("Nombre del fichero destino: ");
		nombreFichero = Leer.datoString();
		archivoDestino = new File(nombreFichero);
		return archivoDestino;
	}

	public void copia(File Origen, File Destino) {
		FileReader fe = null;
		FileWriter fs = null;
		int caracter;
		try {
			fe = new FileReader(Origen);

			fs = new FileWriter(Destino);
			while ((caracter = fe.read()) != -1)
				fs.write(caracter);
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
		} finally {
			try {
				if (fe != null)
					fe.close();
				if (fs != null)
					fs.close();
			} catch (IOException e) {
				System.out.println("Error: " + e.toString());
			}
		}
	}

	private void mostrarMenu() {
		System.out.println("M E N U");
		System.out.println("=======");
		System.out.println("1.- AMOSA ficheiro");
		System.out.println("2.- COPIA ficheiro");
		System.out.println("3.- AMOSA ficheiro (lonxitude - FINAL)");
		System.out.println("4.- AMOSA ficheiro (lonxitude - INICIO)");
		System.out.println("5.- AMOSA ficheiro (a sua linea MAIOR)");
		System.out.println("6.- AMOSA ficheiro (a sua linea MAIOR e a MENOR)");
		System.out.println("7.- AMOSA ficheiro (por palabras)");
		System.out.println("8.- FINAL");
	}

	public int obtenerOpcionPulsada() {
		mostrarMenu();
		System.out.print("Seleccione una opción: ");
		return Leer.datoInt();
	}

	public void amosaFinal() {
		asignaFichero();
		BufferedReader lector = null;
		try {
			lector = new BufferedReader(new FileReader(archivo));
			String linea;
			while ((linea = lector.readLine()) != null) {
				System.out.println(linea + " ---> " + linea.length());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (lector != null) {
					lector.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void amosaInicio() {
		asignaFichero();
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea.length() + " ---> " + linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (lector != null) {
                    lector.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}