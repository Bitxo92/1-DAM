package pizarra15_22;
import java.util.Scanner;
public class piza16 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame tu edad: ");
		int edad=teclado.nextInt();
		
		if(edad>=0&&edad<=17) {
			System.out.println("Menor de idade con "+edad+"anos");
			System.out.println("PROHIBIDO pasar a sala de cine");
		}
		else if(edad>=18&&edad<=110) {
			System.out.println("MAIOR de idade con "+edad+"anos");
			System.out.println("PASE a la sala de cine");
		}
		else {
			System.out.println("Ter "+edad+"non esta CONTEMPLADO");
			System.out.println("PECHEN a sala de cine");
			
		}
		teclado.close();
	}

}
