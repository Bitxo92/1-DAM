package navidad;

import java.io.IOException;

public class ArbolNavidad {

	public static void main(String[] args) throws IOException {
		arbol arbol = new arbol();

		arbol.dibujarArbol();
		arbol.mostrarMensaje();
		System.out.println();
		arbol.mostrarMensajeDam();

	}
}
