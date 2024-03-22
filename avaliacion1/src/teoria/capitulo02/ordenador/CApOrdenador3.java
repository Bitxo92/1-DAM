package teoria.capitulo02.ordenador;

public class CApOrdenador3 {
	
	public static void main(String[] args) {

		COrdenador3 MiOrdenador = new COrdenador3();
		MiOrdenador.Marca = "Ast";
		MiOrdenador.Procesador = "Intel Pentium";
		MiOrdenador.Pantalla = "TFT";
		System.out.println("===================================================");
		MiOrdenador.EncenderOrdenador();
		System.out.println("===================================================");
		MiOrdenador.Estado();
		System.out.println("===================================================");
		MiOrdenador.ApagarOrdenador();
		System.out.println("===================================================");
		MiOrdenador.Estado();

	}

}
