package compilador09_16;

import java.util.Scanner;

public class compi13 {
	public static void main(String[] args) {
		int nota1, nota2, nota3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese primera nota: ");
		nota1 = teclado.nextInt();
		
		System.out.println("Ingrese segunda nota: ");
		nota2 = teclado.nextInt();
		
		System.out.println("Ingrese segunda nota: ");
		nota3 = teclado.nextInt();
		teclado.close();
		
		double media =(nota1+nota2+nota3)/3.0;
		
		System.out.println("Su media--->" + media);
		
		if(media>=7) {
			System.out.println("PROMOCIONADO");
		}
		else {
		
		}

	}

}
