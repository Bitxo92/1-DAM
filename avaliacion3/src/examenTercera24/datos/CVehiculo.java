package examenTercera24.datos;

public class CVehiculo {
	private String matricula;
	private float precio;
	private int anio;
	private String marca;
	private String modelo;

	public CVehiculo(String matricula, float precio, int anio, String marca,String modelo) {
		this.matricula = matricula;
		this.precio = precio;
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	

	public void mostrar() {
		System.out.println(matricula + "\t" + precio + "\t" + anio + "\t" + marca + "\t\t" + modelo);
	}

}
