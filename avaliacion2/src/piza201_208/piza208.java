package piza201_208;
import java.io.IOException;

import misClases.avaliacion2.CCadena;
public class piza208 {
	public static void main(String[] args) throws IOException {
		
		CCadena cadena = new CCadena();
		
		cadena.recolleCadena();
		cadena.amosaCadena();
		System.out.println("\n");
		cadena.eliminaPares2();
		cadena.amosaCadena();
		//cadena.eliminaPares();
		//cadena.amosaCadena();
	}

}
