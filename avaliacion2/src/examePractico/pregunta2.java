package examePractico;

import java.io.IOException;

import examePractico.avaliacion2.CCadena;

public class pregunta2 {
	public static void main(String[] args) throws IOException {
		CCadena cadena = new CCadena();
		// recogemos cadena
		cadena.recogerCadena();
		// llamamos al metodo para modificar dicha cadena
		cadena.eliminaVocalesEnCadena();
		//amosa la cadena modificada
		cadena.amosaCadena();

	}

}
