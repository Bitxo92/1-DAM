package pizarra23_29;
import java.util.Scanner;
public class piza25 {
	public static void main(String[] args) {
		int num;
		int a=0;//acumulador a del if
		int b=0;//acumulador b del else
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entre 1 e 100: ");
		num=teclado.nextInt();
		
		while(num>=1&&num<=100) {
			
			if(num<=50) {
				a++;
			}
			else {
				b++;
			}
			System.out.println("Dame un numero entre 1 e 100: ");
			num=teclado.nextInt();
		}
		teclado.close();
		System.out.println("Entre 1 e 50 houbo "+a+" numeros");
		System.out.println("Entre 51 e 100 houbo "+b+" numeros");
		
	}

}
