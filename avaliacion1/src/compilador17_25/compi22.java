package compilador17_25;
import java.util.Scanner;
public class compi22 {
	public static void main(String[] args) {
		int i=1;
		float altura;
		float suma =0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Cuantos alumnos hay: " );
		float alumnos = teclado.nextFloat();
		
		while(i<alumnos) {
			System.out.println("Dame altura " + i + ": ");
		    altura = teclado.nextFloat();
		    suma = suma + altura;
		    i++;
		    	
		}
		teclado.close();
		float media= suma/alumnos;
		System.out.println("Altura promedio: " + media);
	
	}

}
