package compilador01_08;

import java.util.Scanner;

public class compi07 {
	public static void main(String[] args) {	
	 int uxia, maruxa, anxo ;
	 
	 Scanner teclado = new Scanner(System.in);
	 
	 System.out.print("\nIdade de Uxia(EN MESES): ");
	 uxia= teclado.nextInt();
	 
	 System.out.print("\nIdade de Maruxa(EN MESES): ");
	 maruxa= teclado.nextInt();
	 
	 System.out.print("\nIdade de Anxo(EN MESES): ");
	anxo= teclado.nextInt();
	
	teclado.close();
	
	System.out.print("\nOs anos de Uxia son "+ uxia/12);
	
	System.out.print("\nOs anos de Maruxa son "+ maruxa/12);
	
	System.out.print("\nOs anos de Anxo son "+ anxo/12);	
	}
}
