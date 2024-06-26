package teoria.capitulo09;

import misClases.teoria.CCirculo;
@SuppressWarnings("all")
public class CApCirculo {
	public static void main(String[] args) {
		
		System.out.println(CCirculo.getSeno()[90]);
		System.out.println(CCirculo.getCoseno()[90]);
		System.out.println(CCirculo.getCoseno()[180]);
		System.out.println();

		CCirculo obj1 = new CCirculo();
		System.out.println(obj1.LongCircunferencia());
		System.out.println(obj1.areaCirculo());
		
		CCirculo obj2 = new CCirculo(100,100,10);
		System.out.println(obj2.LongCircunferencia());
		System.out.println(obj2.areaCirculo());
		System.out.println();
		
		System.out.println("Valor de Pi: "+obj1.damePi());
		CCirculo.cambiarPrecisionPiA(3.1411);
		System.out.println("Valor de Pi :"+ CCirculo.damePi());
		System.out.println();
		
		
		System.out.println(CCirculo.getNumCirculos());
		System.out.println(obj1.LongCircunferencia());
		System.out.println(obj1.areaCirculo());
		System.out.println(obj2.LongCircunferencia());
		System.out.println(obj2.areaCirculo());
		

	}

}
