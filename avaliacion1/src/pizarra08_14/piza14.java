package pizarra08_14;
import java.util.Scanner;
public class piza14 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int num=teclado.nextInt();
		System.out.println("Taboa de multiplicar do "+num+":");
		for(int i=1;i<=10;i++) {
			int j=num*i;
			System.out.println(num+"x"+i+"= "+j);
		}
		teclado.close();
	}

}
