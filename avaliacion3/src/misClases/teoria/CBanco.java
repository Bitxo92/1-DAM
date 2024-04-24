package misClases.teoria;

import misClases.utilidades.Leer;

public class CBanco {

	private CCuenta[] clientes;
	private int nElementos;

	public CBanco() {
		nElementos = 0;
		clientes = new CCuenta[nElementos];
	}

	private void unElementoMas(CCuenta[] clientesActuales) {
		nElementos = clientesActuales.length;
		clientes = new CCuenta[nElementos + 1];
		for (int i = 0; i < nElementos; i++)
			clientes[i] = clientesActuales[i];
		nElementos++;
	}

	private void unElementosMenos(CCuenta[] clientesActuales) {
		if (clientesActuales.length == 0)
			return;
		int k = 0;
		nElementos = clientesActuales.length;
		clientes = new CCuenta[nElementos - 1];
		for (int i = 0; i < nElementos; i++)
			if (clientesActuales[i] != null)
				clientes[k++] = clientesActuales[i];
		nElementos--;

	}

	public void insertarCliente(int i, CCuenta objeto) {
		if (i >= 0 && i < nElementos)
			clientes[i] = objeto;
		else
			System.out.println("Indice fuera de limites");
	}

	public CCuenta clienteEn(int i) {
		if (i >= 0 && i < nElementos)
			return clientes[i];
		else {
			System.out.println("Indice fuera de limites");
			return null;
		}
	}

	public int longitud() {
		return nElementos;
	}

	public void añadir(CCuenta obj) {
		unElementoMas(clientes);
		insertarCliente(nElementos - 1, obj);
	}

	public boolean eliminar(String cuenta) {
		for (int i = 0; i < nElementos; i++)
			if (cuenta.compareTo(clientes[i].obtenerCuenta()) == 0) {
				clientes[i] = null;
				unElementosMenos(clientes);
				return true;
			}
		return false;
	}

	public int buscar(String str, int pos) {
		String nom, cuen;
		if (str == null)
			return -1;
		if (pos < 0)
			pos = 0;
		for (int i = pos; i < nElementos; i++) {
			nom = clientes[i].obtenerNombre();
			if (nom == null)
				continue;
			if (nom.indexOf(str) > -1)
				return i;
			cuen = clientes[i].obtenerCuenta();
			if (cuen == null)
				continue;
			if (cuen.indexOf(str) > -1)
				return i;
		}
		return -1;

	}

	private void menu() {
		System.out.println("1. Saldo");
		System.out.println("2. Buscar Siguiente");
		System.out.println("3. Ingreso");
		System.out.println("4. Reintegro");
		System.out.println("5. Anhadir");
		System.out.println("6. Eliminar");
		System.out.println("7. Mantenimiento");
		System.out.println("8. Mostrar");
		System.out.println("9. Salir");
	}

	public int dameOpcion() {
		menu();
		System.out.println();
		System.out.println("Introduzca una opcion: ");
		return Leer.datoInt();
	}

}
