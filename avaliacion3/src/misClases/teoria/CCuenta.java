package misClases.teoria;

public abstract class CCuenta implements IFecha {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoDeInteres;

	public CCuenta() {
		System.out.println("-->Constructor CCuenta SIN parametros de null");

	}

	public CCuenta(String nom, String cue, double sal, double tipo) {
		
		asignarNombre(nom);
		asignarCuenta(cue);
		ingreso(sal);
		asignarTipoDeInteres(tipo);
		System.out.println("-->Constructor CCuenta CON parametros de "+ obtenerNombre());
	}

	public void asignarNombre(String nom) {
		if (nom.length() == 0) {
			System.out.println("Error: cadena vacia");
			return;
		}
		nombre = nom;
	}

	public String obtenerNombre() {
		return nombre;
	}

	public void asignarCuenta(String cue) {
		if (cue.length() == 0) {
			System.out.println("Error: cuenta no valida");
			return;
		}
		cuenta = cue;
	}

	public String obtenerCuenta() {
		return cuenta;
	}

	public double estado() {
		return saldo;
	}

	public abstract void comisiones() throws EsSaldoInsuficiente;

	public abstract double intereses();

	public void ingreso(double cantidad) {
		if (cantidad < 0) {
			
			System.out.println("Error:cantidad negativa");
			return;
		}
		saldo += cantidad;
	}

	public void reintegro(double cantidad)throws EsSaldoInsuficiente {
		if(saldo-cantidad<0) {
			throw new EsSaldoInsuficiente(this,cantidad);
		}
		saldo-=cantidad;

	}
	
	public double obtenerTipoDeInteres() {
		return tipoDeInteres;
	}
	
	public void asignarTipoDeInteres(double tipo) {
		if(tipo<0) {
			System.out.println("Error: tipo no valido");
			return;
		}
		tipoDeInteres=tipo;
	}
	
	protected void finalize()throws Throwable{
		
		System.out.println("-->Destructor CCuenta de "+ obtenerNombre());
		
	}

}
