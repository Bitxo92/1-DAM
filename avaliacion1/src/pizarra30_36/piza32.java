package pizarra30_36;
import java.util.Scanner;
public class piza32 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame unha idade: ");
		int edad=teclado.nextInt();
		
		while(edad>=1&&edad<=7||edad>=65&&edad<=110) {
			if(edad>=1&&edad<=7) {
				System.out.println("NIÑO con "+edad+" anos");
			}
			else {
				System.out.println("ANCIANO con "+edad+" anos");
			}
			System.out.println("Dame unha idade: ");
			edad=teclado.nextInt();
		}
		teclado.close();
		System.out.println("Esta idade: "+edad+", e INCORRECTA");
	}

}
