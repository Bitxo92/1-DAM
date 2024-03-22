package teoria.capitulo02.ordenador;
import misClases.teoria.COrdenador;
public class CApOrdenador {
	public static void main(String[] args) {
		
		COrdenador MiOrdenador = new COrdenador();
		
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
		System.out.println("TRAS LLAMAR AL METODO MODIFICA");
		System.out.println("******************************");
		System.out.println("\n");
		System.out.println("===================================================");
        MiOrdenador.Modificar();
	}

}
