package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseB;
import misClases.avaliacion3.ClaseC;
import misClases.avaliacion3.ClaseD;

public class herencia06 {
	public static void main(String[] args) {
		ClaseA[] array = { new ClaseB(), new ClaseC(), new ClaseD() };
		
		for (int i=2;i>=0;i--) {
			ClaseA ref = array[i];
			System.out.println("Método X de la " + ref.getClass().getSimpleName());
			System.out.println(ref.metodo_x());
			
		}

	}
}
