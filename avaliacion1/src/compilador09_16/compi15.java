package compilador09_16;

import java.util.Scanner;

public class compi15 {
	public static void main(String[] args) {
		
		int valor1,valor2,valor3;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame primer valor: ");
		valor1 = teclado.nextInt();
		
		System.out.println("Dame segundo valor: ");
		valor2 = teclado.nextInt();
		
		System.out.println("Dame tercer valor: ");
		valor3 = teclado.nextInt();
		teclado.close();
		
		if(valor1>valor2 && valor1>valor3) {
			System.out.println("EL MAYOR--->" + valor1);
			
		}
		else if(valor2>valor1 && valor2>valor3) {
			System.out.println("EL MAYOR--->" + valor2);
			
		}
		else {
			System.out.println("EL MAYOR--->" + valor3);
		}
		
		
	}

}
