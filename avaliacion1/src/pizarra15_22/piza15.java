package pizarra15_22;
import java.util.Scanner;
public class piza15 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame A: ");
		int a=teclado.nextInt();
		System.out.println("Dame B: ");
		int b=teclado.nextInt();
		teclado.close();
		
		if(a>b) {
			System.out.println("A e MAIOR que B");
		}
		else if(a<b) {
			System.out.println("A E MENOR que B");
		}
		else {
			System.out.println("A e IGUAL que B");
		}
	}

}
