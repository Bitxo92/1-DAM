package compilador35_40;
import misClases.avaliacion1.CSerie;
import java.util.Scanner;
public class compi38 {
	public static void main(String[] args) {
		CSerie object = new CSerie();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero entre 1 e 20: ");
		int num= teclado.nextInt();
		object.amosaDende20(num);
		teclado.close();
		
	}

}
