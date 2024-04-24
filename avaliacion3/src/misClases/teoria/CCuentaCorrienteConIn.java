package misClases.teoria;

public class CCuentaCorrienteConIn extends CCuentaCorriente {

	public CCuentaCorrienteConIn() {

		System.out.println("-->Constructor CCuentaCorrienteConIn SIN parametros de null");

	}

	public CCuentaCorrienteConIn(String nom, String cue, double sal, double tipo, double imptrans, int transex) {
		super(nom, cue, sal, tipo, imptrans, transex);
	}

	public double intereses() {

		if (dia() != 1 || estado() < 3000)
			return 0.0;
		double interesesProducidos = 0.0;
		interesesProducidos = estado() * obtenerTipoDeInteres() / 1200.0;
		ingreso(interesesProducidos);
		decrementarTransacciones();
		return interesesProducidos;
	}

}
