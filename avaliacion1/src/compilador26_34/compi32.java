package compilador26_34;
import java.util.Scanner;
public class compi32 {
	public static void main(String[] args) {
		int a=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Total triangulos: ");
		int total= teclado.nextInt();
		
		for(int i=1;i<=total;i++ ) {
			System.out.println("**Dame base "+i+" : ");
			int base= teclado.nextInt();
			System.out.println("Dame altura "+i+" : ");
			int altura= teclado.nextInt();
			float area=(float)base*altura/2;
			System.out.println("Superficie "+i+" : " + area);
			if(area>12) {
				a++;
			}
			else {
				
			}
			
		}
		teclado.close();
		System.out.println("Triangulos con superficie superior a 12 son: " + a);
	}

}
