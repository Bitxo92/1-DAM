package pizarra23_29;
import java.util.Scanner;
public class piza29 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=3;i<=8;i++) {
			System.out.println("Multiplos entre 20-50 do "+i);
			for(int j=20;j<=50;j++) {
				if(j%i==0) {
					System.out.println(j);
				}
			}
			teclado.nextLine();
		}
		teclado.close();
		
	}

}
