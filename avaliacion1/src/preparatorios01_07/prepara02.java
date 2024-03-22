package preparatorios01_07;
import java.util.Scanner;
public class prepara02 {
	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame idade: ");
		idade=teclado.nextInt();
		
		while(idade>=1&&idade<=9||idade>=65&&idade<=110) {
			
			if(idade<=9) 
			   System.out.println("ESTE CATIVO TEN "+idade+" anos");
			else
				System.out.println("ESTE Anciano TEN "+idade+" anos");
			System.out.print("Dame idade: ");
			idade=teclado.nextInt();
			
		}
		teclado.close();
		System.out.println("+++++> Idade NON permitida");
	}

}
