package compilador203_205;

import misClases.avaliacion2.CVector;
import java.util.Scanner;

public class compi204 {
	public static void main(String[] args) {
		CVector vector = new CVector();
		Scanner scanner = new Scanner(System.in);
		
		int opcion,valor;

		do {
			opcion = vector.recolleOpcion();

			switch (opcion) {
			case 1:
				vector.inicializaVector();
				break;
			case 2:
				vector.mostrarVector();
				break;
			case 3:
				System.out.println("Introduzca valor para array: ");
				valor = scanner.nextInt();
				vector.insertaVector(valor);
				break;
			case 4:
				System.out.println("Opcion NO Implementada");
				break;
			case 5:
				System.out.println("FINAL");
				break;
			default:
				System.out.println("OPCION Erronea");

			}

		} while (opcion != 5);
		scanner.close();

	}
}
