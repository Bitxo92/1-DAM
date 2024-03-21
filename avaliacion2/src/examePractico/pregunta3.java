package examePractico;

import java.io.IOException;

import examePractico.avaliacion2.CRecursivo;

public class pregunta3 {
	public static void main(String[] args) throws IOException {
		CRecursivo recursivo = new CRecursivo();

		// recogemos cadena
		recursivo.recogerCadena();
		// llamamos el metodo que nos mostrar la cadena al reves
		// duplicando solo los digitos 4,6 y 7 de forma selectiva
		recursivo.amosa467DuplicadosReves(0);

	}

}
