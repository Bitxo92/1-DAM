package misClases.avaliacion2;
import java.util.Scanner;

public class CDameDato {
	
	private int opcion;
	private int datoInt;
	private float datoFloat;
	private String datoString;
	
	private Scanner teclado = new Scanner (System.in);
	
	public int recolleInt() {
		System.out.print("Introduzca un Integer: ");
		datoInt= teclado.nextInt();
		return datoInt;
	}
	
	public void mostrarInt() {
		System.out.print("el valor del Integer es: "+ datoInt);
	}
	
	public float recolleFloat() {
		System.out.print("Introduzca un Float: ");
		datoFloat=teclado.nextFloat();
		return datoFloat;
	}
	
	public void mostrarFloat() {
		System.out.print("el valor del Float es: "+ datoFloat);
	}
	
	public String recolleString() {
		System.out.print("Introduzca un String: ");
		teclado.nextLine();
		datoString = teclado.nextLine();
		
		return datoString;
	}
	public void mostrarString() {
		System.out.print("el valor del String es: "+ datoString);
	}
	
	private void mostrarMenu() {
		System.out.println("\n");
		System.out.println("MENU");
		System.out.println("======");
		System.out.println("1.- Dame un ENTEIRO");
		System.out.println("2.- Dame un REAL");
		System.out.println("3.- Dame una CADEA");
		System.out.println("FINAL");
		
	}
	
	public int dameOpcion() {
		
		mostrarMenu();
		System.out.println("Introduzca una opción: ");
		opcion=teclado.nextInt();
		return opcion;
		
		
	}
	
	

}
