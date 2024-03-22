package misClases.teoria;

public class CComputador {
	private String Marca;
	private String Procesador;
	private String Pantalla;
	private boolean OrdenadorEncendido;
	private static byte Garantia;
	
	public static void garantia() {
		Garantia=3;
	}

	public void EncenderOrdenador() {
		if (OrdenadorEncendido == true) {
			System.out.println("El Computador ya está encendido.");
		} else {
			OrdenadorEncendido = true;
			System.out.println("El Computador se ha encendido.");
		}

	}

	public void Estado() {
		System.out.println("\nEstado del Computador " + "\n- Marca: " + Marca + "\n- Procesador: " + Procesador
				+ "\n- Pantalla: " + Pantalla + "\n- Garantia: " + Garantia);
		if (OrdenadorEncendido == true) {
			System.out.println("* El Computador esta encendido.");
		} else {
			System.out.println("* El Computador esta apagado.");
		}
	}

	public void ApagarOrdenador() {
		if (OrdenadorEncendido == true) {
			OrdenadorEncendido=false;
			System.out.println("El Computador se ha apagado.");
		} else {
			OrdenadorEncendido = false;
			System.out.println("El Computador ya esta apagado.");
		}

	}
	public void AsignarValores(String Marca, String Procesador, String Pantalla) {
		this.Marca=Marca;
		this.Procesador=Procesador;
		this.Pantalla=Pantalla;
	}

	
}
