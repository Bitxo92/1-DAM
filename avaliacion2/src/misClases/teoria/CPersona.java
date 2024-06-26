package misClases.teoria;

public class CPersona {
	
	private String nombre;
	private String direccion;
	private long telefono;
	

	
	public CPersona() {
		
	}
	
	public CPersona(String nom, String dir, long tel) {
		nombre=nom;
		direccion=dir;
		telefono=tel;
	}
	
	public void asignarNombre(String nom) {
		nombre=nom;
	}
	
	public String obtenerNombre() {
		return nombre;
	}

	public String obtenerDireccion() {
		return direccion;
	}

	public void asignarDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long obtenerTelefono() {
		return telefono;
	}

	public void asignarTelefono(long telefono) {
		this.telefono = telefono;
	}
	public void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
    }
}
