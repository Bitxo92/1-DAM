package misClases.teoria;

import java.util.GregorianCalendar;

public class CCuentaAhorro extends CCuenta {
	private double cuotaMantenimiento;

	public CCuentaAhorro() {
		System.out.println("-->Constructor CCuentaAhorro SIN parametros de null");

	}

	public CCuentaAhorro(String nom, String cue, double sal, double tipo, double mant) {
		super(nom, cue, sal, tipo);// constructor CCuenta
		asignarCuotaManten(mant);
		System.out.println("-->Constructor CCuentaAhorro CON parametros de " + obtenerNombre());
	}

	public void asignarCuotaManten(double cantidad) {
		if (cantidad < 0) {
			System.out.println("Error: cantidad negativa");
			return;
		}
		cuotaMantenimiento = cantidad;
	}

	public double obtenerCuotaManten() {
		return cuotaMantenimiento;
	}

	public void comisiones() {
		if (dia() == 1)
			reintegro(cuotaMantenimiento);
	}

	public double intereses() {

		if (dia() != 1)
			return 0.0;
		double interesesProducidos = 0.0;
		interesesProducidos = estado() * obtenerTipoDeInteres() / 1200.0;
		ingreso(interesesProducidos);

		return interesesProducidos;
	}

	@Override
	protected void finalize() throws Throwable {
		try {
			System.out.println("--> Destructor CCuentaAhorro de " + obtenerNombre());
		} finally {
			super.finalize();
		}
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
