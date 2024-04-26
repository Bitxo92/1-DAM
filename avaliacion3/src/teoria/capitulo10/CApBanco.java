package teoria.capitulo10;

import java.io.PrintStream;

import misClases.teoria.CBanco;
import misClases.teoria.CCuenta;
import misClases.teoria.CCuentaAhorro;
import misClases.teoria.CCuentaCorriente;
import misClases.teoria.CCuentaCorrienteConIn;
import misClases.teoria.EsSaldoInsuficiente;
import misClases.utilidades.Leer;

public class CApBanco {

	public static CCuenta leerDatos(int op) {

		CCuenta obj = null;
		String nombre, cuenta;
		double saldo, tipoi, mant;
		System.out.print("Nombre..................: ");
		nombre = Leer.dato();
		System.out.print("Cuenta..................: ");
		cuenta = Leer.dato();
		System.out.print("Saldo...................: ");
		saldo = Leer.datoDouble();
		System.out.print("Tipo de interés.........: ");
		tipoi = Leer.datoDouble();
		if (op == 1) {
			System.out.print("Mantenimiento...............: ");
			mant = Leer.datoDouble();
			obj = new CCuentaAhorro(nombre, cuenta, saldo, tipoi, mant);
		} else {
			int transex;
			double imptrans;
			System.out.print("Importe por transacción: ");
			imptrans = Leer.datoDouble();
			System.out.print("Transacciones exentas..: ");
			transex = Leer.datoInt();
			if (op == 2)
				obj = new CCuentaCorriente(nombre, cuenta, saldo, tipoi, imptrans, transex);
			else
				obj = new CCuentaCorrienteConIn(nombre, cuenta, saldo, tipoi, imptrans, transex);
		}
		return obj;

	}

	public static void main(String[] args) {
		int opcion = 0, pos = -1;
		String cadenabuscar = null;
		String nombre, cuenta;
		double cantidad;
		boolean eliminado = false;
		PrintStream flujoS = System.out;
		CBanco banco = new CBanco();

		do {
			opcion = banco.dameOpcion();
			switch (opcion) {
			case 1: // saldo
				flujoS.print("Nombre o cuenta, total o parcial");
				cadenabuscar = Leer.dato();
				pos = banco.buscar(cadenabuscar, 0);
				if (pos == -1)
					if (banco.longitud() != 0)
						flujoS.println("búsqueda fallida");
					else
						flujoS.println("no hay clientes");
				else {
					flujoS.println(banco.clienteEn(pos).obtenerNombre());
					flujoS.println(banco.clienteEn(pos).obtenerCuenta());
					flujoS.println(banco.clienteEn(pos).estado());
				}
				break;

			case 2: // buscar siguiente
				pos = banco.buscar(cadenabuscar, pos + 1);
				if (pos == -1)
					if (banco.longitud() != 0)
						flujoS.println("busqueda fallida");
					else
						flujoS.println("no hay clientes");
				else {
					flujoS.println(banco.clienteEn(pos).obtenerNombre());
					flujoS.println(banco.clienteEn(pos).obtenerCuenta());
					flujoS.println(banco.clienteEn(pos).estado());

				}
				break;

			case 3: // ingreso
				flujoS.print("Cuenta: ");
				cuenta = Leer.dato();
				pos = banco.buscar(cuenta, 0);
				if (pos == -1) {
					if (banco.longitud() != 0) {
						flujoS.println("Búsqueda fallida");
					} else {
						flujoS.println("No hay clientes");
					}
				} else {
					flujoS.print("Cantidad: ");
					cantidad = Leer.datoDouble();
					banco.clienteEn(pos).ingreso(cantidad);
					flujoS.println("Ingreso realizado correctamente.");
				}
				break;

			case 4:// reintegro
				flujoS.print("Cuenta: ");
				cuenta = Leer.dato();
				pos = banco.buscar(cuenta, 0);
				if (pos == -1)
					if (banco.longitud() != 0)
						flujoS.println("busqueda fallida");
					else
						flujoS.println("no hay clientes");
				else {
					flujoS.print("Cantidad: ");
					cantidad = Leer.datoDouble();
					if (opcion == 3)
						banco.clienteEn(pos).ingreso(cantidad);
					else
						try {
							banco.clienteEn(pos).reintegro(cantidad);
						} catch (EsSaldoInsuficiente e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

				}
				break;

			case 5:// añadir
				flujoS.print("Tipo de cuenta: 1-(CA), 2-(CC), 3-CCI");
				do
					opcion = Leer.datoInt();
				while (opcion < 1 || opcion > 3);
				banco.añadir(leerDatos(opcion));
				
				break;

			case 6: // eliminar
				flujoS.println("Cuenta: ");
				cuenta = Leer.dato();
				eliminado = banco.eliminar(cuenta);
				if (eliminado)
					flujoS.println("registro eliminado");
				else if (banco.longitud() != 0)
					flujoS.println("no hay clientes");
				break;

			case 7:// mantenimiento
				for (pos = 0; pos < banco.longitud(); pos++) {
					try {
						banco.clienteEn(pos).comisiones();
					} catch (EsSaldoInsuficiente e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					banco.clienteEn(pos).intereses();
				}
				break;

			case 8: // mostrar

				for (int i = 0; i < banco.longitud(); i++) {
					flujoS.println("Nombre: " + banco.clienteEn(i).obtenerNombre());
					flujoS.println("Cuenta: " + banco.clienteEn(i).obtenerCuenta());
					flujoS.println("Estado: " + banco.clienteEn(i).estado());
					flujoS.println();
				}
				break;

			case 9:// salir
				banco = null;

			default:
				System.out.println("Opcion Erronea");

			}

		} while (opcion != 9);
	}

}
