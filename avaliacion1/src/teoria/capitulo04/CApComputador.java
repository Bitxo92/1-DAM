package teoria.capitulo04;

import misClases.teoria.CComputador;

class CApComputador {
public static void main(String[] args) {
		
		CComputador computador = new CComputador();
		
		System.out.println("===================================================");
		computador.EncenderOrdenador();
		System.out.println("===================================================");
		computador.AsignarValores("Ast","Intel Pentium","TFT");
		//para acceder a un método estático usamos el nombre de clase (no el de objeto)
		CComputador.garantia();
		computador.Estado();
		System.out.println("===================================================");
		computador.ApagarOrdenador();
		System.out.println("===================================================");
		computador.Estado();
		System.out.println("===================================================");
		computador.EncenderOrdenador();
		System.out.println("===================================================");
		computador.AsignarValores("HP","AMD","CRT");
		computador.Estado();
		System.out.println("===================================================");
		computador.ApagarOrdenador();
		System.out.println("===================================================");
		computador.Estado();
		
		
		
		
		
		
	}

}
