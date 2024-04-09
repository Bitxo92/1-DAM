package herencia;

import misClases.avaliacion3.ClaseC;

public class herencia02 {
	public static void main(String[] args) {
		ClaseC clase;
		clase= new ClaseC();
		

		System.out.println("Metodo Y de la ClaseA");
		System.out.println(clase.metodo_y());
		System.out.println("Metodo X de la ClaseC");
		System.out.println(clase.metodo_x());
		
	}
	


}
