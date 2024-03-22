package misClases.teoria;

public class CExpresion {

	// Atributos
	private double a;
	private double b;
	private double c;

	// Método para asignar los valores de los coeficientes
	public void AsignarDatos(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Método para evaluar la expresión y mostrar el resultado
	public void VisualizarResultado() {
		double result = (b * b - 4 * a * c) / (2 * a);
		System.out.println(result);
	}

}
