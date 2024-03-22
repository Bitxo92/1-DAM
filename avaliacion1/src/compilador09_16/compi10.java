package compilador09_16;

import java.util.Scanner;

public class compi10 {
	public static void main(String[] args) {
		
		float compra;
		double venta, iva;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nDame o precio de compra do produto: ");
		compra = teclado.nextFloat();
		
		teclado.close();
		
		System.out.print("\nPrecio de venta ------>");
		System.out.println(0.35 * compra + compra);
		
		venta = 0.35 * compra + compra;
		iva = 0.18 * venta;
		
		System.out.print("PVP ------------------>");
		System.out.println(venta + iva);
	}

}
