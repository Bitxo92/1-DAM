package practica;
import misClases.avaliacion2.*;
import java.util.Scanner;
@SuppressWarnings("all")
public class practica5 {
	
	static void menu() {
		System.out.println("\n");
		System.out.println("1.- Matrices");
		System.out.println("2.- Array de caracteres");
		System.out.println("3.- String");
		System.out.println("4.- Sair");
		System.out.println("\n");
	}
	
	static int dameOp() {
		int op;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduca una opcion: ");
		op= scanner.nextInt();
		
		return op;
		
	}
	
	
	public static void main(String[] args) {
		
		
		int op;
		CMatrices matriz = new CMatrices();
		CArrayCaracteres array = new CArrayCaracteres();
		CString string = new CString();
		
		
		
		do {
			menu();
			op= dameOp();
			
			switch(op) {
			
			case 1:
				matriz.recolle();
				matriz.amosa(matriz.matrizA,matriz.matrizB);
				System.out.println("\n");
				matriz.trasposta(matriz.matrizA, matriz.matrizC);
				matriz.trasposta(matriz.matrizB, matriz.matrizD);
				matriz.amosa(matriz.matrizC,matriz.matrizD);
				System.out.println("\n");
				matriz.suma(matriz.matrizA, matriz.matrizB, matriz.matrizC);
				matriz.resta(matriz.matrizA,matriz.matrizB,matriz.matrizD);
				matriz.amosa(matriz.matrizC,matriz.matrizD);
				System.out.println("\n");
				matriz.resta(matriz.matrizB, matriz.matrizA, matriz.matrizC);
				matriz.multiplica(matriz.matrizA, matriz.matrizB, matriz.matrizD);
				matriz.amosa(matriz.matrizC, matriz.matrizD);
				System.out.println("\n");
				break;
				
			case 2:
				array.recolle();
				array.amosa();
				array.maiusculas();
				array.minusculas();
				array.arroba();
				array.espacioBlanco();
				array.sinNumeros();
				array.amosa();
				break;
				
			case 3:
				string.recolle();
				string.amosa();
				string.maiusculas();
				string.minusculas();
				string.arroba();
				string.espacioBlanco();
				string.sinNumeros();
				string.amosa();
				break;
				
			case 4:
				System.out.println("FINAL");
				break;
				
			default:
				System.out.println("OPCION ERRONEA");
						
				
			
			}
			
			
			
		}while(op!=4);
		
		
		
		
	}

}
