package pizarra15_22;
import java.util.Scanner;
public class piza22 {
	public static void main(String[] args) {
		
		Scanner teclado= new Scanner(System.in);
		System.out.println("Dame el primer número: ");
		int num1=teclado.nextInt();
		System.out.println("Dame el segundo número: ");
		int num2=teclado.nextInt();
		
		if(num1<0&&num2<0) {
			System.out.println("Os dous son NEGATIVOS");
		}
		else if(num1<0||num2<0) {
			System.out.println("Un dos dous e Negativo");
		}
		else {
			System.out.println("Os dous son POSITIVOS");
		}
		teclado.close();
		
	}

}
