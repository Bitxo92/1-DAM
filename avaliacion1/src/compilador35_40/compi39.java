package compilador35_40;
import misClases.avaliacion1.CSerie;
import java.util.Scanner;

public class compi39 {
	public static void main(String[] args) {
		CSerie object = new CSerie();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("O numero A sera menor que o numero B");
		System.out.println("Dame o numero A: ");
		int a= teclado.nextInt();
		System.out.println("Dame o numero B: ");
		int b= teclado.nextInt();
		object.amosaA_B(a, b);
		teclado.close();
	}

}
