package herencia;

import misClases.avaliacion3.ClaseA;
import misClases.avaliacion3.ClaseB;
import misClases.avaliacion3.ClaseC;
import misClases.avaliacion3.ClaseD;

public class herencia05 {
public static void main(String[] args) {
	ClaseA ref = new ClaseB();
	
	System.out.println("Metodo X de la ClaseB");
	System.out.println(ref.metodo_x());
	System.out.println("Metodo X de la ClaseC");
	System.out.println((ref=new ClaseC()).metodo_x());
	System.out.println("Metodo X de la ClaseD");
	System.out.println((ref=new ClaseD()).metodo_x());
}
}
