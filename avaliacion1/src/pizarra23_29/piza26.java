package pizarra23_29;
import java.util.Scanner;
//@SuppressWarnings("all")
public class piza26 {
	public static void main(String[] args) {
		int i =1;
		
		
		Scanner teclado = new Scanner(System.in);
		
		while(i<=10) {
			System.out.println("Taboa de multiplicar do "+i);
			int j =1;
			while(j<=10) {
				System.out.println(i+" x "+j+" = "+(i*j));
				j++;
			}
			i++;
			teclado.nextLine();
			
		}
		teclado.close();
		
	}

}
