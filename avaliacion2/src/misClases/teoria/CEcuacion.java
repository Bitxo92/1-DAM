package misClases.teoria;

public class CEcuacion {
	private double a;
	private double b;
	private double c;
	private double d;

	public void recogeDatos() {
		System.out.print("Coeficiente a: ");
		a = Leer.datoDouble();
		System.out.print("Coeficiente b: ");
		b = Leer.datoDouble();
		System.out.print("Coeficiente c: ");
		this.c = Leer.datoDouble();
	}

	public boolean raicesComplejas() {
		boolean complejas = false;
		d = this.b * b - 4.0D * a * c;
		if (d < 0.0D) {
			complejas = true;
		}

		return complejas;
	}

	public void muestraResultado() {
		System.out.println("Las raices reales son:");
		this.d = Math.sqrt(d);
		double x1 = (-b + d) / (2.0D * a);
		double x2 = (-b - d) / (2.0D * a);
		System.out.println("x1 = " + x1 + ", x2 = " + x2);
	}
}
