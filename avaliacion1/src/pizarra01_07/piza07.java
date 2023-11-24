package pizarra01_07;
import java.util.Scanner;
public class piza07 {
	public static void main(String[] args) {
		int i=0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame un numero: ");
		int num= teclado.nextInt();
		System.out.println("A taboa de multiplicar do "+num+":");
		while(i<=10) {
			int j= num*i;
			System.out.println(num+"x"+i+"= "+j);
			i++;
			
		}
		teclado.close();
	}

}
