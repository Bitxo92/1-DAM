package preparatorios08_16;
import java.io.IOException;
import java.util.Scanner;
public class prepara11 {
	public static void main(String[] args)throws IOException {
		char letra;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dame DIXITO ou VOCAL minuscula: ");
		letra=(char)System.in.read();
		teclado.nextLine();
		while(letra>='0'&&letra<='9'||letra=='a'||letra=='e'||letra=='o'||letra=='i'||letra=='u') {
			if(letra>='0'&&letra<='9')
				System.out.println("->Correcto, pulsaches este DIXITO: "+letra);
			else
				System.out.println("->Correcto, pulsaches esta VOCAL: "+letra);
			System.out.print("\nDame DIXITO ou VOCAL minuscula: ");
			letra=(char)System.in.read();
			teclado.nextLine();
		}
		teclado.close();
		System.out.println("+++++> INCORRECTO, pulsaches esta tecla: "+letra);
		
	}

}
