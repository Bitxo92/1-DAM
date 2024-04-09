package herencia;

import misClases.avaliacion3.ClaseD;

public class herencia03 {
	public static void main(String[] args) {
		ClaseD clase;
		
		clase = new ClaseD();
		
		System.out.println("Metodo Y de la ClaseA");
		System.out.println(clase.metodo_y());
		System.out.println("Metodo X de la ClaseD");
		System.out.println(clase.metodo_x());
		System.out.println("Metodo X(int) de la ClaseD");
		System.out.println(clase.metodo_x(-10));

	}
}
