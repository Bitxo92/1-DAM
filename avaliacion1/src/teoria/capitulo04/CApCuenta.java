package teoria.capitulo04;
import misClases.teoria.CCuenta;
class CApCuenta {
	public static void main(String[] args) {
		
		CCuenta Cuenta01 = new CCuenta();
		
		//abrir cuenta con 1.000.00 a un 2%
		Cuenta01.IngresarDinero(1000000);
		Cuenta01.EstablecerTipoDeInteres(2);
		
		//operaciones
		System.out.println(Cuenta01.SaldoActual());
		Cuenta01.IngresarDinero(500000);
		Cuenta01.RetirarDinero(200000);
		System.out.println(Cuenta01.SaldoActual());
		Cuenta01.AbonarIntereses();
		System.out.println(Cuenta01.SaldoActual());
		
	}

}
