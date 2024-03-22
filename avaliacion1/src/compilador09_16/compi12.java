package compilador09_16;

import java.util.Scanner;

public class compi12 {
	public static void main(String[] args) {
		
		int a,b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese primer valor: ");
		a = teclado.nextInt();
		
		System.out.println("Ingrese segundo valor: ");
		b = teclado.nextInt();
		teclado.close();
		
		if(a>b) {
			int suma = a+b;
			int resta = a-b;
			System.out.print("La suma--------------->");
			System.out.println(suma);
			
			System.out.print("La diferencia--------->");
			System.out.println(resta);
		}
		else {
			int mult = a*b;
			int div = b/a;
			
			System.out.print("El producto----------->");
			System.out.println(mult);
			System.out.print("La division----------->");
			System.out.println(div);
		}
	}

}
