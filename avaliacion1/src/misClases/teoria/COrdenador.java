package misClases.teoria;

public class COrdenador {
	public String Marca;
	public String Procesador;
	public String Pantalla;
	public boolean OrdenadorEncendido;
	public boolean Presentacion;
	
	public void EncenderOrdenador() {
		if(OrdenadorEncendido==true) {
			System.out.println("El ordenador ya está encendido.");
		}
		else {
			OrdenadorEncendido=true;
			System.out.println("El ordenador se ha encendido.");
		}
			
	}
	
	public void Estado() {
		System.out.println("\nEstado del ordenador1:"+"\n- Marca: "
	            + Marca + "\n- Procesador: "+Procesador+"\n- Pantalla: "
				+Pantalla);
		if(OrdenadorEncendido==true) {
			System.out.println("El ordenador está encendido.");
		}
		else {
			System.out.println("El ordenador está apagado.");
		}
	}
	public void ApagarOrdenador() {
		if(OrdenadorEncendido==true) {
			OrdenadorEncendido=false;
			System.out.println("El ordenador se ha apagado.");
		}
	}
	public void Modificar() {
		Marca ="Dell";
		Procesador= "AMD";
		Pantalla ="CRT";
		
		System.out.println("\nEstado del ordenador1:"+"\n- Marca: "
	            + Marca + "\n- Procesador: "+Procesador+"\n- Pantalla: "
				+Pantalla);
		if(OrdenadorEncendido==true) {
			System.out.println("El ordenador está encendido.");
		}
		else {
			System.out.println("El ordenador está apagado.");
		}
		
				
	}

}
