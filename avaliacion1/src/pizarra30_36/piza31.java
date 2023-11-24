package pizarra30_36;
import java.util.Scanner;
public class piza31 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame tu edad: ");
		int edad =teclado.nextInt();
		
		while(edad>=1&&edad<=7||edad>=65&&edad<=110) {
			System.out.println("Dame tu edad de nuevo: ");
			edad =teclado.nextInt();
		}
		teclado.close();
		System.out.println("FINAL");
	}

}
