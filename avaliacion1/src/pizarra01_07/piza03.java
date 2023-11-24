package pizarra01_07;
import java.util.Scanner;
public class piza03 {
	public static void main(String[] args) {
		int i=20;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero menor de 20: ");
		int x= teclado.nextInt();
		teclado.close();
		
		while(x<=i) {
			System.out.println(x);
			x++;
		}
		
	
	}

}
