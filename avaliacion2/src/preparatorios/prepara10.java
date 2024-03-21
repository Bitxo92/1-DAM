package preparatorios;
import java.io.IOException;
import misClases.avaliacion2.CCadena;

public class prepara10 {
	public static void main(String[] args) throws IOException {
		
	CCadena cadena = new CCadena();
	cadena.recogerCadena();
	cadena.amosaCadena();
	System.out.println();
	cadena.duplicaCaracteres3Numeros2();
	System.out.println("cadena modificada(repite caracteres 3 y numeros 2):");
	cadena.amosaCadena();
	}

}
