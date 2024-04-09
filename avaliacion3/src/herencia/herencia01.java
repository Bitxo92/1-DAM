package herencia;

import misClases.avaliacion3.ClaseB;

public class herencia01 {
	public static void main(String[] args) {
		ClaseB objClaseB = new ClaseB();
		
		
		System.out.println("Metodo Y de la ClaseA");
		System.out.println(objClaseB.metodo_y());
		System.out.println("Metodo X de la ClaseB");
		System.out.println(objClaseB.metodo_x());
		
	}

}
