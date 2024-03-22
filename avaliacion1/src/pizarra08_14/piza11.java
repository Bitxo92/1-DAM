package pizarra08_14;
import java.util.Scanner;
public class piza11 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un nº<20 :");
		int num=teclado.nextInt();
		
		for(int i=20;i>=num;i--) {
			System.out.println(i);
		}
		teclado.close();
	
	}

}
