package examenTercera24;

import java.io.File;
import java.io.IOException;
import examenTercera24.datos.CTallerLeliadoura;
import examenTercera24.utilidades.Leer;



public class tercera24 {
	public static void main(String[] args) {
		CTallerLeliadoura taller;
		File fichero;
		int opcion;
		String codigo;

		fichero = new File("examenTercera24.dat");
		try {
			taller = new CTallerLeliadoura(fichero);
			do {
				opcion = taller.dameOpcion();
				switch (opcion) {
				case 1:
					taller.llenar();
					System.out.println("Taller Leliadoura con vehículos");
					break;
				case 2:
					taller.vaciar();
					System.out.println("Taller Leliadoura sin vehículos");
					break;
				case 3:
					taller.mostrar();
					break;
				case 4:
					System.out.print("Dame matrícula de vehículo: ");
					codigo = Leer.datoString();
					taller.mostrarCoche(codigo);
					break;
				case 5:
					taller.insertarCoche();
					break;
				case 6:
					System.out.print("Dame matrícula de vehículo: ");
					codigo = Leer.datoString();
					taller.modificarCoche(codigo);
					break;
				case 7:
					System.out.print("Dame matrícula de vehículo: ");
					codigo = Leer.datoString();
					taller.eliminarCoche(codigo);
					break;
				case 8:
					taller.actualizar();
					System.out.println("Taller Leliadoura ACTUALIZADO");
					break;
				case 9:
					System.out.println("FINAL");
					break;
				default:
					System.out.println("OPCION Errónea");
					break;
				}
			} while (opcion != 9);
		} catch (IOException e) {
		

			e.printStackTrace();
		}
	}
	
		

	}


