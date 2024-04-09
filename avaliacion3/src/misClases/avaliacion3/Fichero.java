package misClases.avaliacion3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


import misClases.utilidades.Leer;

public class Fichero {
	
	private File archivo;
	private String nombre;
	private String mensaje= "Error: ";
	
	public Fichero() {
		
	}
	
	 public void asignaFichero() {
	        
	        do {
	            System.out.print("Nombre del fichero: ");
	            nombre = Leer.datoString();
	            archivo = new File(nombre);
	        } while (!archivo.exists());
	     
	    }
	 
	 
	 public  void amosa() {
	        FileReader fe = null;
	        int caracter;
	        try {
	            fe = new FileReader(archivo);
	            while ((caracter = fe.read()) != -1) {
	                System.out.print((char) caracter);
	            }
	        } catch (IOException e) {
	            System.out.println(mensaje+ e.toString());
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

	 public  void copia(File Origen, File Destino) {
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
}
