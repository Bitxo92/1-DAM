package misClases.teoria;

public class CIntereses {
	private double capital;
	private double intereses;
	private float tipo;
	private int dias;

	public void recogeDatos() {
		System.out.print("Capital invertido: ");
		capital = Leer.datoDouble();
		System.out.print("A un tipo(%) anual del: ");
		tipo = Leer.datoFloat();
		System.out.print("Durante cuantos dias: ");
		dias = Leer.datoInt();
		realizaCalculos();
	}

	private void realizaCalculos() {
		intereses = capital * (double) tipo * (double) dias / 36000.0D;
		capital += intereses;
	}

	public void muestraInformacion() {
		System.out.println("\nIntereses producidos... " + intereses);
		System.out.println("Capital acumulado...... " + capital);
	}
}
