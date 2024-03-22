package compilador01_08;

import java.util.Scanner;

public class compi08 {
	public static void main(String[] args) {
		int uxia, maruxa, anxo;

		Scanner teclado = new java.util.Scanner(System.in);
		
		System.out.print("\nIdade de Uxia(EN MESES): ");
		uxia = teclado.nextInt();
		
		System.out.print("\nIdade de Maruxa(EN MESES): ");
		maruxa = teclado.nextInt();
		
		System.out.print("\nIdade de Anxo(EN MESES): ");
		anxo = teclado.nextInt();
		teclado.close();
		
		System.out.print("\nUxía ten " + uxia / 12 + " anos e " + uxia % 12 + " meses.");
		System.out.print("\nMaruxa ten " + maruxa / 12 + " anos e " + maruxa % 12 + " meses.");
		System.out.print("\nAnxo ten " + anxo / 12 + " anos e " + anxo % 12 + " meses.");
	}
}