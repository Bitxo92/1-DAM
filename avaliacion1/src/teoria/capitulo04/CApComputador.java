package teoria.capitulo04;

import misClases.teoria.CComputador;

class CApComputador {
public static void main(String[] args) {
		
		CComputador computador1 = new CComputador();
		CComputador computador2 = new CComputador();
		
		System.out.println("===================================================");
		computador1.EncenderOrdenador();
		System.out.println("===================================================");
		computador1.AsignarValores("Ast","Intel Pentium","TFT");
		//para acceder a un método estático usamos el nombre de clase (no el de objeto)
		CComputador.garantia();
		computador1.Estado();
		System.out.println("===================================================");
		computador1.ApagarOrdenador();
		System.out.println("===================================================");
		computador1.Estado();
		System.out.println("===================================================");
		computador2.EncenderOrdenador();
		System.out.println("===================================================");
		computador2.AsignarValores("HP","AMD","CRT");
		computador2.Estado();
		System.out.println("===================================================");
		computador2.ApagarOrdenador();
		System.out.println("===================================================");
		computador2.Estado();
		
		
		
		
		
		
	}

}
