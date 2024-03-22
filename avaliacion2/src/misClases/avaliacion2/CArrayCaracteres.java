package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CArrayCaracteres {
    private char[] caracteres = new char[50];

    public void recolle() {
        System.out.println("Introduce una cadena de caracteres:");
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            buffer.read(caracteres, 0, caracteres.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void amosa() {
        System.out.println(new String(caracteres));
    }

    public void maiusculas() {
        String cadena = new String(caracteres);
        cadena = cadena.toUpperCase();
        System.out.println(cadena);
    }

    public void minusculas() {
        String cadena = new String(caracteres);
        cadena = cadena.toLowerCase();
        System.out.println(cadena);
    }

    public void arroba() {
        String cadena = new String(caracteres);
        cadena = cadena.replace('a', '@').replace('A', '@');
        System.out.println(cadena);
    }

    public void espacioBlanco() {
        String cadena = new String(caracteres);
        cadena = cadena.trim().replaceAll("\\s+", " ");
        System.out.println(cadena);
    }

    public void sinNumeros() {
        String cadena = new String(caracteres);
        StringBuilder br = new StringBuilder(cadena);

        for (int i = 0; i < br.length(); i++) {
            if (br.charAt(i) >= '0' && br.charAt(i) <= '9') {
                br.deleteCharAt(i);
                i--;
               
            }
            
            	
        }

        cadena = br.toString();
        System.out.println(cadena);
    }

  
}

