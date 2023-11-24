package compilador41_49;

import java.io.IOException;

public class compi47 {
	public static void main(String[] args) throws IOException {
		char letra;
		int espacio=0;
		int a =0;
		System.out.print(">");
		letra=(char)System.in.read();
		
		while(letra!='\n') {
			System.out.print(letra);
			letra=(char)System.in.read();
			if(letra==' ') {
				espacio++;
			}
			else if(letra=='a') {
				a++;
			}
		}
		System.out.println("\nTotal espacios en blanco: "+espacio);
		System.out.println("\nTotal letra 'a': "+a);

	}

}
