package misClases.teoria;

import java.util.Scanner;

public class CPrueba {

	// Atributo privado grados de la clase CGrados
	
	//private CGrados grados;
	
	private CGrados grados = new CGrados();
	
	

	// Método público para recoger los grados por teclado
	public void RecogeGrados() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dame Grados Centigrados:");
		float centigrados = scanner.nextFloat();

		grados.CentigradosAsignar(centigrados);
		
		scanner.close();


	}

	// Método público para mostrar los grados centígrados y Fahrenheit
	
	public void AmosaGrados() {

		// Mostrar grados centígrados y Fahrenheit
		System.out.print(grados.CentigradosObtener() + " C ");
		System.out.print(grados.FahrenheitObtener() + " F");

	}
}
