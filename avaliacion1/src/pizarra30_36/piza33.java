package pizarra30_36;
import java.io.IOException;
import java.util.Scanner;

public class piza33 {
    public static void main(String[] args) throws IOException {
        char letra;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Dame una letra minúscula: ");
        letra = (char) System.in.read();

        while (!(letra >= 'a' && letra <= 'z')) {
            System.out.println("Dame una letra minúscula: ");
            letra = (char) System.in.read();
            teclado.nextLine();
        }

        teclado.close();
        System.out.println("FINAL");
    }
}

