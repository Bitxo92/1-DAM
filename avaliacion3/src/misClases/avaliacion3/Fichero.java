package misClases.avaliacion3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import misClases.utilidades.Leer;

public class Fichero {
	
	private File archivo;
	private String nombre;
	private String mensaje;
	
	public Fichero() {
		
	}
	
	 public void asignaFichero() {
	        String nombreFichero;
	        do {
	            System.out.print("Nombre del fichero: ");
	            nombreFichero = Leer.datoString();
	            archivo = new File(nombreFichero);
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
	            System.out.println("Error: " + e.toString());
	        } finally {
	            try {
	                if (fe != null) {
	                    fe.close();
	                }
	            } catch (IOException e) {
	                System.out.println("Error: " + e.toString());
	            }
	        }
	    }

}
