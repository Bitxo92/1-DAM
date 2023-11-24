package pizarra30_36;
import java.util.Scanner;
public class piza34 {
    public static void main(String[] args){
        char letra;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una letra minuscula: ");
        letra=teclado.nextLine().charAt(0);
     
        while (letra >= 'a' && letra <= 'z' && letra != 'ñ') {
            System.out.println("CORRECTO: Es minuscula: " + letra);
            System.out.println("Dame otra letra minuscula: ");
 
            letra =teclado.nextLine().charAt(0);
        }

        teclado.close();
        System.out.println("INCORRECTO: No es minuscula: " + letra);
    }
}

