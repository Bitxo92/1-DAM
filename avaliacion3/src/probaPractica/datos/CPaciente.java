package probaPractica.datos;

public class CPaciente {

	private String codigo;
	private String nombre;
	private int habitacion;
	private float temperatura;

	public CPaciente(String codigo, String nombre, int habitacion, float temperatura) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.habitacion = habitacion;
		this.temperatura = temperatura;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public void mostrar() {
		System.out.println(codigo + "\t" + nombre + "\t\t" + habitacion + "\t\t" + temperatura);
	}

}
