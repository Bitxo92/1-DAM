package compilador50_55;
import java.util.Scanner;
public class compi51 {
	public static void main(String[] args) {
		int numero;
	
		Scanner teclado = new Scanner(System.in);
		
		
			
		do {
		
		System.out.println("Dame un numero:");
		 numero= teclado.nextInt();
		
		 
			
			switch(numero){
			case 1: System.out.println("E o 1");
			break;
			case 2: System.out.println("E o 2");
			break;
			case 3: System.out.println("E o 3");
			break;
			case 4: System.out.println("E o 4");
			break;
			case 5:System.out.println("E o 5");
			break;
			default: System.out.println("FINAL");
			}
			
		}while(numero>0&&numero<=5);
		teclado.close();
	
			

			
		
	}

}
