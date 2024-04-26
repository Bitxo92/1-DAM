package misClases.teoria;

public class EsSaldoInsuficiente extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CCuenta cuenta;
	private double cantidadSolicitada;

	// Constructor
	public EsSaldoInsuficiente(CCuenta cuenta, double cantidadSolicitada) {
		this.cuenta = cuenta;
		this.cantidadSolicitada = cantidadSolicitada;
	}

	// Método mensaje()
	public void mensaje(CCuenta cuenta) {
		System.out.println("Error: saldo insuficiente en la cuenta " + cuenta.obtenerNombre() + " para retirar " + cantidadSolicitada
				+ " y el saldo disponible es" + cuenta.estado());
	}
}
