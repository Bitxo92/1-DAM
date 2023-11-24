package pizarra30_36;

import java.io.IOException;

public class piza35 {
	public static void main(String[] args) throws IOException {

		char letra;
		System.out.println("Dame una vocal minuscula: ");
		letra = (char) System.in.read();

		while (letra != 'a' && letra != 'e' &&
               letra != 'i' && letra != 'o' && 
               letra != 'u') {
			System.out.println("La letra introducida no es una vocal minuscula");
			System.out.println("Dame una vocal minuscula: ");
			letra = (char) System.in.read();

		}
		System.out.println("FINAL");
	}

}
