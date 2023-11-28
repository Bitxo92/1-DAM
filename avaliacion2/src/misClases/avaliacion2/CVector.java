package misClases.avaliacion2;

import java.util.Scanner;

public class CVector {

	private int[] vector = new int[20];
	private int total;
	private int opcion;
	private Scanner scanner = new Scanner(System.in);

	public void inicializaVector() {
		
		vector[0]= 3;
		vector[1]= 12;
		vector[2]= 15;
		vector[3]= 22;
		vector[4]= 30;
		vector[5]= 43;
		
      total=vector.length;  
    }

	public void mostrarVector() {
		total=0;
		for (int i : vector) {
			if (i != 0) {
				System.out.print( i + " ");
				total++;
				
			}
			
		}
		System.out.println("total: "+total);
		

	}
	
	public void eliminaVector(int a) {
		for (int i=0;i<vector.length;i++) {
			if(a==vector[i]) 
				vector[i]=0;
				
			
			
		}
		
	}
	
	
	public void insertaVector(int a) {
		int i=total;
		vector[i]=a;
		total++;
	}
	
	private void mostrarMenu() {
		System.out.println("\n");
		System.out.println("MENU");
		System.out.println("======");
		System.out.println("1.- INICIALIZA Vector de enteiros");
		System.out.println("2.- AMOSA Vector");
		System.out.println("3.- INSERTA enteiro en Vector");
		System.out.println("4.- ELIMINA enteiros en Vector");
		System.out.println("5.- FINAL");
	}
	
	public int recolleOpcion() {
		mostrarMenu();
		System.out.println("Introduzca una opción: ");
		opcion = scanner.nextInt();
		return opcion;
	}

}
