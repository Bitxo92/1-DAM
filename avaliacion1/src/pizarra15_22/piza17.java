package pizarra15_22;
import java.util.Scanner;
public class piza17 {
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int num=teclado.nextInt();
		
		if(num>1&&num<=10) {
			int j=num*4;
			System.out.println("Entre o 1 e o 10");
			System.out.println("Numero secreto: "+j);
		}
		else if(num>=11&&num<=20) {
			int k=num*3;
			System.out.println("Entre o 11 e o 20");
			System.out.println("Numero secreto: "+k);
		}
		else if(num>=21&&num<=30) {
			int i=num*2;
			System.out.println("Entre o 21 e o 30");
			System.out.println("Numero secreto: "+i);
			
		}
		else {
			
			System.out.println("Numero non permitido: "+num);
		}
		teclado.close();
	}

}
