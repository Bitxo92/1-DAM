package misClases.teoria;

public class CCuenta {

	private double tipoDeInteres;
	private double saldo;

	public void EstablecerTipoDeInteres(double ti) {
		if (ti < 0) {
			System.out.println("El tipo de interés no puede ser negativo");
			return;
		}
		tipoDeInteres = ti;
	}

	public void IngresarDinero(double ingreso) {
		saldo += ingreso;
	}

	public void RetirarDinero(double cantidad) {

		if (saldo - cantidad < 0) {
			System.out.println("No tiene saldo suficiente");
			return;
		}

		// Hay saldo suficiente.Retirar la cantidad.
		saldo -= cantidad;
	}

	public double SaldoActual() {
		return saldo;
	}

	public void AbonarIntereses() {
		saldo += saldo * tipoDeInteres / 100;

	}

}
