package teoria.capitulo11;

import misClases.teoria.CCuentaAhorro;
import misClases.teoria.CCuentaCorriente;
import misClases.teoria.CCuentaCorrienteConIn;
import misClases.teoria.EsSaldoInsuficiente;
import misClases.teoria.IFecha;

public class CApError {
	public static void main(String[] args) {

		IFecha fecha[] = { new CCuentaAhorro(), new CCuentaCorriente(), new CCuentaCorrienteConIn() };

		for (int i = 0; i < fecha.length; i++) {

			if (fecha[i] instanceof CCuentaAhorro) {
				try {
					((CCuentaAhorro)fecha[i]).asignarNombre("Cliente" + (i + 1));
					((CCuentaAhorro) fecha[i]).reintegro(1000);
				} catch (EsSaldoInsuficiente e) {
					// TODO Auto-generated catch block
					e.mensaje((CCuentaAhorro) fecha[i]);
				}
				
			} else if (fecha[i] instanceof CCuentaCorriente) {
				try {
					((CCuentaCorriente)fecha[i]).asignarNombre("Cliente" + (i + 1));
					((CCuentaCorriente) fecha[i]).reintegro(2000);
				} catch (EsSaldoInsuficiente e) {
					// TODO Auto-generated catch block
					e.mensaje((CCuentaCorriente) fecha[i]);
				}
			

			} else {
				try {
					((CCuentaCorrienteConIn)fecha[i]).asignarNombre("Cliente" + (i + 1));
					((CCuentaCorrienteConIn) fecha[i]).reintegro(1000);
				} catch (EsSaldoInsuficiente e) {
					// TODO Auto-generated catch block
					e.mensaje((CCuentaCorrienteConIn) fecha[i]);
				}
				

			}
		}

	}
}
