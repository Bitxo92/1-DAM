package probaPractica;

import probaPractica.datos.CHospital;
import probaPractica.utilidades.Leer;

public class proba {
	public static void main(String[] args) {
		CHospital hospital = new CHospital();

		int opcion;
		do {
			opcion = hospital.dameOpcion();
			String identificador;
			
			switch (opcion) {
			case 1://LLenar Hospital
				hospital.llenar();
				System.out.println("Hospital con pacientes");
				break;
			case 2://Vaciar Hospital
				hospital.vaciar();
				System.out.println("Hospital sin pacientes");
				break;
			case 3://Mostrar Hospital
				hospital.mostrar();
				break;
			case 4://Mostrar Paciente
				System.out.print("Dame código de paciente: ");
				identificador= Leer.datoString();
				hospital.mostrarPaciente(identificador);
				break;
			
			case 5:
				System.out.println("FINAL");
				break;
			
			default:
				System.out.println("OPCION Erronea");
			}
		} while (opcion != 5);

	}

}
