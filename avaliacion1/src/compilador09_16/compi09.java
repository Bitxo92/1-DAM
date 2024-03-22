package compilador09_16;

import java.util.Scanner;

public class compi09 {
	public static void main(String[] args) {
		int a, b;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("\nDame numero 1: ");
		a=teclado.nextInt();
		
		System.out.print("\nDame numero 2: ");
		b=teclado.nextInt();
		teclado.close();
		
		
		System.out.print("\nA suma e -------------->"+(a+b));
		System.out.print("\nA resta e ------------->"+(a-b) + " (numero1 - numero2)");
		System.out.print("\nA multiplicación é ---->"+ (a*b));	
		System.out.print("\nA division enteira e -->"+ (a/b) + " (numero1/numero2)");
		System.out.print("\nO modulo e ------------>"+ (a%b) + " (numero1%numero2)");
		System.out.print("\nA division real e ----->" + ((float)a/b) + " (numero1/numero2)");
		System.out.print("\nA media real e -------->");
		System.out.print((a+b)/2.0);

	}
}
