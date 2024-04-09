package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseB;
import misClases.avaliacion3.ClaseC;
import misClases.avaliacion3.ClaseD;

public class herencia04 {
	public static void main(String[] args) {

		ClaseA ref1, ref2, ref3;

		ref1 = new ClaseB();
		ref2 = new ClaseC();
		ref3 = new ClaseD();

		System.out.println("Metodo X de la ClaseB");
		System.out.println(ref1.metodo_x());
		System.out.println("Metodo X de la ClaseC");
		System.out.println(ref2.metodo_x());
		System.out.println("Metodo X de la ClaseD");
		System.out.println(ref3.metodo_x());

	}

}
