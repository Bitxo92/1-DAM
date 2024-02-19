package practica;
import misClases.avaliacion2.*;
import misClases.teoria.Leer;
import java.util.Scanner;
@SuppressWarnings("all")
public class practica5 {
	
	private static void menu() {
		System.out.println("\n");
		System.out.println("1.- Matrices");
		System.out.println("2.- Array de caracteres");
		System.out.println("3.- String");
		System.out.println("4.- Sair");
		System.out.println("\n");
	}
	   private static int dameOp() {
		      menu();
		      int numero = Leer.datoInt();
		      System.out.println();
		      return numero;
		   }

	
	
	public static void main(String[] args) {
		
		
		int op;
		CMatrices matriz = new CMatrices();
		CArrayCaracteres array = new CArrayCaracteres();
		CString string = new CString();
		
		
		
		do {
			
			op= dameOp();
			
			switch(op) {
			
			case 1:
				matriz.recolle();
				matriz.amosa('A', 'B');
				System.out.println("\n");
				matriz.trasposta('A', 'C');
				matriz.trasposta('B', 'D');
				matriz.amosa('C','D');
				System.out.println("\n");
				matriz.suma('A', 'B','C');
				matriz.resta('A','B','D');
				matriz.amosa('C','D');
				System.out.println("\n");
				matriz.resta('B','A','C');
				matriz.multiplica('A','B','D');
				matriz.amosa('C','D');
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
