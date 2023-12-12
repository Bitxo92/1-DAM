package misClases.avaliacion2;

import java.util.Scanner;

public class CVector {

	private int[] vector = new int[20];
	private int total;
	private int opcion;
	private Scanner scanner = new Scanner(System.in);

	public void inicializaVector() {

		vector[0] = 3;
		vector[1] = 12;
		vector[2] = 15;
		vector[3] = 22;
		vector[4] = 30;
		vector[5] = 43;

		total = 6;
	}

	public void mostrarVector() {

		for (int i = 0; i < total; i++)
			System.out.println("el valor de " + i + ": " + vector[i]);

		System.out.println("total: " + total);

	}

	public void eliminaVector(int a) {
		int posicion=0;
		for (int i = 0; i < total; i++) {
			if (vector[i]==a) {
				vector[i] = 0;
				posicion=i;
			}

		}
		
		for(int i=posicion+1;i<total;i++) {
			vector[i-1]=vector[i];
		}
		
		total--;

	}

	public void insertaVector(int a) {
		int posicion=0;
		//for-loop para buscar la posicion para el numero introducido
		for(int i=0;i<total;i++) {
			if(vector[i]<a) {
				posicion=i+1;
				
				
			}
		}
		//desplazamos valores en el array para hacer sitio para el nuevo valor
		
		for(int i=total;i>posicion;i--) {
			vector[i]=vector[i-1];
			
		}
		//introducimos valor
		vector[posicion]=a;
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
