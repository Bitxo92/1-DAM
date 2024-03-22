package misClases.teoria;
@SuppressWarnings("all")
public class CCirculo {
	class Punto{
		private double x,y;
		Punto(double cx, double cy){
			x=cx;
			y=cy;
		}
		
	}
	private static  double seno[]= new double[360];
	private static  double coseno[]= new double[360];
	private static double pi=3.141592;
	private static int numCirculos;
	private Punto centro;
	private double radio;
	
	public static int getNumCirculos() {
		return numCirculos;
	}



	public static double[] getCoseno() {
		return coseno;
	}

	

	public static double[] getSeno() {
		return seno;
	}

	

	protected void msgEsNegativo() {
		System.out.println("El radio es negativo. Se convierte a positivo");
	}
	
	public CCirculo() {
		this(100.0,100.0,100.0);
	}
	
	public CCirculo(double cx, double cy, double r) {
		centro= new Punto(cx, cy);
		if(r<0) {
			msgEsNegativo();
			r=-r;
		}
		radio=r;
		numCirculos = getNumCirculos() + 1;
	}
	
	
	public double LongCircunferencia() {
		return 2*pi*radio;
	}
	
	public double areaCirculo() {
		return pi*radio*radio;
	}
	
	public static void cambiarPrecisionPiA(double nuevoValor) {
		if(nuevoValor<3.14 || nuevoValor >3.1416)
			return;
		pi=nuevoValor;
	}
	
	
	public static double damePi() {
		return pi;
	}
	
	
	static {
		for(int i=0;i<360;i++) {
			double s, c;
			s= Math.sin(Math.toRadians(i));
			c=Math.cos(Math.toRadians(i));
			
			getSeno()[i]=Math.rint(s*1000000/1000000);
			getCoseno()[i]=Math.rint(c*1000000/1000000);
		}
	}


	
	
	
	
	

}
