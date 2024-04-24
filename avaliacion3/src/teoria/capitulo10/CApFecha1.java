package teoria.capitulo10;

import misClases.teoria.CCuentaAhorro;
import misClases.teoria.CCuentaCorriente;
import misClases.teoria.CCuentaCorrienteConIn;
import misClases.teoria.IFecha;

public class CApFecha1 {
	public static void main(String[] args) {

		IFecha fecha[] = { new CCuentaAhorro(), new CCuentaCorriente(), new CCuentaCorrienteConIn() };

		for (int i = 0; i < fecha.length; i++) {

			if (fecha[i] instanceof CCuentaAhorro) {
				((CCuentaAhorro) fecha[i]).asignarNombre("Cliente" + (i + 1));
				System.out.println(((CCuentaAhorro) fecha[i]).obtenerNombre());
				System.out.println(((CCuentaAhorro) fecha[i]).estado());

			} else if (fecha[i] instanceof CCuentaCorriente) {
				((CCuentaCorriente) fecha[i]).asignarNombre("Cliente" + (i + 1));
				System.out.println(((CCuentaCorriente) fecha[i]).obtenerNombre());
				System.out.println(((CCuentaCorriente) fecha[i]).estado());

			} else {
				((CCuentaCorrienteConIn) fecha[i]).asignarNombre("Cliente" + (i + 1));
				System.out.println(((CCuentaCorrienteConIn) fecha[i]).obtenerNombre());
				System.out.println(((CCuentaCorrienteConIn) fecha[i]).estado());

			}
		}

	}
}
