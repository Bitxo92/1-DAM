package compilador01_08;

import java.util.Scanner;

public class compi06 {
	public static void main(String[] args) {
		int idade1, idade2, idade3, idadetotal;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nIdade do alumno 1: ");
		idade1= teclado.nextInt();
		
		System.out.print("\nIdade do alumno 2: ");
		idade2= teclado.nextInt();
		
		System.out.print("\nIdade do alumno 3: ");
		idade3= teclado.nextInt();
		teclado.close();
		
		idadetotal=idade1+idade2+idade3;
		System.out.println("\nA idade media é "+ idadetotal/3.0 );
		// al poner 3.0 forzamos al java runtime a darnos un resultado en float
	}
}