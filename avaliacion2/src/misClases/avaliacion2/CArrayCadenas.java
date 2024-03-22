package misClases.avaliacion2;
import java.util.Scanner;
public class CArrayCadenas {
	
	private String[] vector = new String[7];
	Scanner scanner = new Scanner (System.in);
	
	public void inicializaVector() {
		
		vector[0]="Lunes";
		vector[1]="Martes";
		vector[2]="Miercoles";
		vector[3]="Jueves";
		vector[4]="Viernes";
		vector[5]="Sabado";
		vector[6]="Domingo";
		
		
	}
	
	public void amoseVector() {
		for(int i=0;i<vector.length;i++) 
			System.out.println("Dia "+i+":"+vector[i]);
		
	}
	
	private void mostrarMenu() {
		System.out.println("\n");
		System.out.println("MENU");
		System.out.println("======");
		System.out.println("1.- INICIALIZA Array de Cadenas");
		System.out.println("2.- AMOSA Array");
		System.out.println("3.- ORDENA Ascendentemente");
		System.out.println("4.- ORDENA Descendentemente");
		System.out.println("5.- FINAL");
	}
	
	public int recolleOpcion() {
		
		mostrarMenu();
		System.out.println("Introduzca una opcion: ");
		int opcion= scanner.nextInt();
		return opcion;
			
	}
	
	public void ordenarAscendente() {
	    int n = vector.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            // Comparar las primeras letras de las cadenas y hacer el intercambio si es necesario
	            if (vector[j].charAt(0) > vector[j + 1].charAt(0)) {
	                String temp = vector[j];
	                vector[j] = vector[j + 1];
	                vector[j + 1] = temp;
	            }
	        }
	    }
	}
	
	public void ordenarDescendente() {
	    int n = vector.length;
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = 0; j < n - 1 - i; j++) {
	            // Comparar las primeras letras de las cadenas y hacer el intercambio si es necesario
	            if (vector[j].charAt(0) < vector[j + 1].charAt(0)) {
	                String temp = vector[j];
	                vector[j] = vector[j + 1];
	                vector[j + 1] = temp;
	            }
	        }
	    }
	}

}
