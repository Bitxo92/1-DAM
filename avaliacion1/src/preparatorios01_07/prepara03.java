package preparatorios01_07;
import java.io.IOException;
import java.util.Scanner;
public class prepara03 {
	public static void main(String[] args)throws IOException{
		char letra;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame CONSONANTE minúscula: ");
		letra = (char) System.in.read();
		teclado.nextLine();
		
		while(letra>'a'&&letra<='z'&&letra!='e'&&letra!='i'&&letra!='o'&&letra!='u') {
			System.out.println("Correcto, pulsaches esta CONSONANTE minúscula: " + letra);
			System.out.print("Dame CONSONANTE minúscula: ");
			letra = (char) System.in.read();
			teclado.nextLine();
		}
		teclado.close();
		System.out.println("+++++> INCORRECTO, pulsaches esta tecla: " + letra);
		
		
	}

}
