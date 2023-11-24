package compilador09_16;

import java.util.Scanner;

public class compi14 {
	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un entero entre 1 y 99: ");
		num = teclado.nextInt();
		teclado.close();
		
		if(num>=10) {
			System.out.println("Tiene Dos digitos");
		}
		else{
			System.out.println("Tiene Un digito");
		}
				
	}

}
