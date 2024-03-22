package pizarra30_36;
import java.util.Scanner;
public class piza36 {
	public static void main(String[] args){
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una vocal minuscula: ");
		letra= teclado.nextLine().charAt(0);
		
		while(letra=='a'||letra=='e'||letra=='i'||
			  letra=='o'||letra=='u') {
			System.out.println("CORRECTO: e VOCAL minuscula a "+letra);
			System.out.println("Dame otra VOCAL minuscula: ");
			letra=teclado.nextLine().charAt(0);
		}
		teclado.close();
		System.out.println("INCORRECTO: non e VOCAL minuscula a "+letra);
		
		
		
	}

}
