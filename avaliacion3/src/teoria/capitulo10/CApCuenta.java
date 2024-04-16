package teoria.capitulo10;

import misClases.teoria.CCuentaAhorro;

public class CApCuenta  {
	public static void main(String[] args) {
		try {
		
		CCuentaAhorro cliente01;
		cliente01= new CCuentaAhorro();
		
		
		cliente01.asignarNombre("Amancio Couso Arias");
		cliente01.asignarCuenta("123456789");
		cliente01.ingreso(965000.0);
		cliente01.asignarTipoDeInteres(2.5);
		cliente01.asignarCuotaManten(300);

		
		
		System.out.println(cliente01.obtenerNombre());
		System.out.println(cliente01.obtenerCuenta());
		System.out.println(cliente01.estado());
		System.out.println(cliente01.obtenerTipoDeInteres());
		System.out.println(cliente01.obtenerCuotaManten());
		
		
		
		CCuentaAhorro cliente02;
		cliente02=new CCuentaAhorro("Benancio Compostela Rivera","987654321",1130000.0, 4.5, 400);
		

		System.out.println(cliente02.obtenerNombre());
		System.out.println(cliente02.obtenerCuenta());
		System.out.println(cliente02.estado());
		System.out.println(cliente02.obtenerTipoDeInteres());
		System.out.println(cliente02.obtenerCuotaManten());
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.gc();
		}
		
		
	}
	
}
