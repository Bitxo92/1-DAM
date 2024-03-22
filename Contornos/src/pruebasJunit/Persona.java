package pruebasJunit;

@SuppressWarnings("all")

public class Persona {
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public boolean esMayordeEdad(int edad) {
		// return getEdad()>=18;
		return edad >= 18;
	}

	public static void main(String[] args) {
		Persona p1 = new Persona("Ana", 25);
		p1.setNombre("Juan");
		p1.setEdad(10);
		System.out.println("El nombre es: " + p1.getNombre() + "," + p1.getEdad());
		System.out.println("Es mayor de edad: " + p1.esMayordeEdad(p1.getEdad()));

	}

}
