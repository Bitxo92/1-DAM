package compilador308_309;

import java.io.File;

import misClases.avaliacion3.Fichero;

public class compi309 {
public static void main(String[] args) {
	Fichero fichero;
	fichero= new Fichero();
	File Origen=fichero.asignaFicheroLectura();
	File Destino=fichero.asignaFicheroEscritura();
	fichero.copia(Origen,Destino);
	
}


}
