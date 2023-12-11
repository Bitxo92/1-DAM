package piza201_208;
import misClases.avaliacion2.CCadena;
import java.io.IOException;
public class piza206 {
	public static void main(String[] args)throws IOException {
		CCadena cadena = new CCadena();
		
		cadena.recolleCadena();
		cadena.amosaCadena();
		cadena.eliminaEnCadena('h');
		System.out.println("\n");
		cadena.amosaCadena();
		
		
	}
	
	

}
