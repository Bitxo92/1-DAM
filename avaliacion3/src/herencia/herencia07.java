package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseB;
import misClases.avaliacion3.ClaseC;
import misClases.avaliacion3.ClaseD;

public class herencia07 {
	public static void main(String[] args) {
		ClaseA ref1 = new ClaseB();
		ClaseA ref2 = new ClaseC();
		ClaseA ref3 = new ClaseD();

		ClaseA[] ref = { ref1, ref2, ref3 };

		for (int i = 2; i >= 0; i--) {
//			
			System.out.println("Método X de la " + ref[i].getClass().getSimpleName());
			System.out.println(ref[i].metodo_x());

		}
	}

}
