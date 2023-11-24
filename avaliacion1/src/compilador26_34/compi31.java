package compilador26_34;
import java.util.Scanner;
public class compi31 {
	public static void main(String[] args) {
		int j= 1;
		int a=0;
		int b=0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Cuantos numeros: ");
		int i= teclado.nextInt();
		
		while(j<=i) {
			System.out.println("Dame valor "+ j+ " : ");
			int valor = teclado.nextInt();
			j++;
			
			if(valor%2==0) {
				a++;
			}
			else {
				b++;
			}
		}
		teclado.close();
		System.out.println("Cantidad de pares: "+ a);
		System.out.println("Cantidad de impares: "+b);
	}

}
