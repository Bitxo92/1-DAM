package compilador09_16;

import java.util.Scanner;

public class compi16 {
	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un valor: ");
		valor = teclado.nextInt();
		teclado.close();
		
		if(valor>0) {
			System.out.println("POSITIVO");
		}
		else if(valor==0) {
			System.out.println("NULO");
		}
		else {
			System.out.println("NEGATIVO");
		}
	}

}
