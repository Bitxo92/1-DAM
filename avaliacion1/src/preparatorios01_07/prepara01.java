package preparatorios01_07;

class prepara01 {
	public static void main(String args[]) {
		byte a, c, e;
		short b, d, f;
		double x, y, z;
		x = 72345;
		a = (byte) x;
		b = (short) x;
		System.out.print("\n a: " + a + " b: " + b);
		y = 87643;
		c = (byte) y;
		d = (short) y;
		System.out.print("\n c: " + c + " d: " + d);
		z = 92654;
		e = (byte) z;
		f = (short) z;
		System.out.println("\n e: " + e + " f: " + f);
		
		
		
		System.out.println("**************************************************");
		System.out.println("X, Y, Z NECESITA  TENER LOS VALORES:");
		System.out.println("**************************************************");
		
		
		int[] resultados = calcularValores(-103, 6809, 91, 22107, -18, 27118);
		
		System.out.println("x = " + resultados[0]);
        System.out.println("y = " + resultados[1]);
        System.out.println("z = " + resultados[2]);
        
        
        System.out.println("COMPROBAMOS SI ES VERDAD:");
        x = resultados[0];
		a = (byte) x;
		b = (short) x;
		System.out.print("\n a: " + a + " b: " + b);
		y = resultados[1];
		c = (byte) y;
		d = (short) y;
		System.out.print("\n c: " + c + " d: " + d);
		z = resultados[2];
		e = (byte) z;
		f = (short) z;
		System.out.println("\n e: " + e + " f: " + f);
	}
	
	
	public static int[] calcularValores(int a,int b,int c,int d,int e,int f) {
		
		int[] valores = new int[3]; //Para almacenar x, y, z
		
		 // Rangos definidos
		
		int xMin = 70000, xMax = 79000;
		int yMin = 80000, yMax = 89000;
        int zMin = 90000, zMax = 95000;
        
     // Buscar x
        for (int i = xMin; i <= xMax; i++) {
            if ((byte)i == a && (short)i == b) {
                valores[0] = i;
                break;
            }
        }

        // Buscar y
        for (int i = yMin; i <= yMax; i++) {
            if ((byte)i == c && (short)i == d) {
                valores[1] = i;
                break;
            }
        }

        // Buscar z
        for (int i = zMin; i <= zMax; i++) {
            if ((byte)i == e && (short)i == f) {
                valores[2] = i;
                break;
            }
        }

        return valores;		
		
		
	}


}