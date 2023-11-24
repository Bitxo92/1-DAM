package compilador17_25;
import java.util.Scanner;
public class compi23 {
	public static void main(String[] args) {
		int i;
		int j=1;
		int a =0;
		int b =0;
		float suma=0;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Cuantos empleados hay: ");
		i = teclado.nextInt();
		
		while(j<=i) {
			System.out.println("Dame sueldo " + j + ": ");
			float sueldo = teclado.nextFloat();
			j++;
			suma = suma + sueldo;
			
		
			
			if(sueldo>=100 && sueldo<=300) {
				a++;
			}
			else if (sueldo>300) {
				b++;
			}
			else {
			
			}
		}
		teclado.close();
		System.out.println("Empleados con sueldos entre 100 y 300: " + a);
		System.out.println("Empleados con sueldos superiores a 300:" +b);
		System.out.println("Gastos total de la empresa en sueldos: " + suma);
	}
	

}
