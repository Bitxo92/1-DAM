package preparatorios08_16;

public class prepara09 {
	

	 static double amosaResult(int a, int b) {
		double result=0;
		for (double i = 70000; i <= 100000; i++) {
			if ((byte) i == a && (short) i == b) 
				result = i;
		}
		return result;	
	}
	 
	 
	public static void main(String[] args) {
		byte a, c, e;
		short b, d, f;
		double x, y, z;
		x = amosaResult(86,13142);
		a = (byte) x;
		b = (short) x;
		
		y = amosaResult(-76,22452);
		c = (byte) y;
		d = (short) y;
		
		z = amosaResult(85,-32171);
		e = (byte) z;
		f = (short) z;
		//resultados de x,y,z
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		System.out.println("z = "+z);
		//salidas byte y short para x,y,z
		System.out.print("\n a: " + a + " b: " + b);
		System.out.print("\n c: " + c + " d: " + d);
		System.out.println("\n e: " + e + " f: " + f);
		
	
	}
}