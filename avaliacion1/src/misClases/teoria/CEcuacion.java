package misClases.teoria;

public class CEcuacion {
	// Atributos de clase
	private double c1;
	private double c2;
	private double c3;
	private double c4;

	public void Ecuacion(double a, double b, double c, double d) {
		c1 = a;
		c2 = b;
		c3 = c;
		c4 = d;
	}

	
	public double ValorPara(double x) {
		return c1 *x*x*x + c2 * x*x + c3 * x + c4;
		
	}

}
