package misClases.avaliacion2;

import java.util.Scanner;
import java.util.Random;

public class CVectorAleatorio {

	private int[] vector = new int[10];
	Scanner scanner = new Scanner(System.in);

	public void inicilizaAleatorio() {
		// Inicializar el vector con números aleatorios entre 30 y 90
		Random aleatorio = new Random();
		for (int i = 0; i < 10; i++) {
			vector[i] = aleatorio.nextInt(61) + 30;
		}

	}

	 public void amosaVector() {
	      System.out.println("   VECTOR de Enteiros");
	      System.out.println("   ==================");

	      int i;
	      for(i = 0; i < this.vector.length; ++i) {
	         System.out.print("      " + i);
	      }

	      System.out.println("");

	      for(i = 0; i < this.vector.length; ++i) {
	         if (this.vector[1] < 10) {
	            System.out.print("      " + this.vector[i]);
	         } else {
	            System.out.print("     " + this.vector[i]);
	         }
	      }

	   }

	private void mostrarMenu() {
		System.out.println("\n");
		System.out.println("MENU");
		System.out.println("======");
		System.out.println("1.- INICIALIZA Aleatoriamente Vector");
		System.out.println("2.- AMOSA Vector");
		System.out.println("3.- ORDENA Ascendentemente");
		System.out.println("4.- ORDENA Descendentemente");
		System.out.println("5.- FINAL");
	}

	public int recolleOpcion() {
		mostrarMenu();
		System.out.println("Introduzca una opción: ");
		int opcion = scanner.nextInt();
		return opcion;
	}

	public void ordenaAscendente() {
		int n = 10;

		for (int i = 1; i <= n - 1; i++)
			for (int j = n - 1; j >= i; j--)
				if (vector[j - 1] > vector[j]) {

					int dato = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = dato;
				}
	}
	
	public void ordenaDescendente() {
		int n = 10;

		for (int i = 1; i <= n - 1; i++)
			for (int j = n - 1; j >= i; j--)
				if (vector[j - 1] < vector[j]) {

					int dato = vector[j - 1];
					vector[j - 1] = vector[j];
					vector[j] = dato;
				}
	}

}
