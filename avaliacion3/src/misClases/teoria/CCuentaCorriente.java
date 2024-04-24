package misClases.teoria;

import java.util.GregorianCalendar;

public class CCuentaCorriente extends CCuenta {

	private int transacciones;
	private double importePorTrans;
	private int transExentas;

	public CCuentaCorriente() {

		System.out.println("-->Constructor CCuentaCorriente SIN parametros de null");

	}

	public CCuentaCorriente(String nom, String cue, double sal, double tipo, double imptrans, int transex) {
		super(nom, cue, sal, tipo);
		transacciones = 0;
		asignarImportePorTrans(imptrans);
		asignarTransExentas(transex);

	}

	public void decrementarTransacciones() {
		transacciones--;
	}

	public void asignarImportePorTrans(double imptrans) {
		if (imptrans < 0) {
			System.out.println("Error: cantidad negativa");
			return;
		}
		importePorTrans = imptrans;
	}

	public double obtenerImportePorTrans() {
		return importePorTrans;
	}

	public void asignarTransExentas(int transex) {
		if (transex < 0) {
			System.out.println("Error: cantidad negativa");
			return;
		}
		transExentas = transex;
	}

	public int obtenerTransExentas() {
		return transExentas;
	}

	public void ingreso(double cantidad) {
		super.ingreso(cantidad);
		transacciones++;
	}

	public void reintegro(double cantidad) {
		super.reintegro(cantidad);
		transacciones++;
	}

	public void comisiones() {

		if (dia() == 1) {
			int n = transacciones - transExentas;
			if (n > 0)
				reintegro(n * importePorTrans);
			transacciones = 0;
		}
	}

	public double intereses() {

		if (dia() != 1)
			return 0.0;
		double interesesProducidos = 0.0;
		if (estado() <= 3000)
			interesesProducidos = estado() * 0.5 / 1200.0;
		else {
			interesesProducidos = 3000 * 0.5 / 1200.0 + (estado() - 3000) * obtenerTipoDeInteres() / 1200.0;

		}
		ingreso(interesesProducidos);
		decrementarTransacciones();
		return interesesProducidos;
	}

	@Override
	public int dia() {
		GregorianCalendar fechaActual = new GregorianCalendar();
		return fechaActual.get(DIA_DEL_MES);
	}

	@Override
	public int mes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int ano() {
		// TODO Auto-generated method stub
		return 0;
	}

}
