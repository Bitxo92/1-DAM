package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseD;

public class herencia08 {
	public static void main(String[] args) {
		ClaseA ref = new ClaseD();

		System.out.println("Método Y de la ClaseA ");
		System.out.println(ref.metodo_y());
		System.out.println("Método X de la ClaseD");
		System.out.println(ref.metodo_x());
		
		 System.out.println("Método Z de la ClaseD");
	
	}
}
