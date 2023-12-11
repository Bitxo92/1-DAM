package misClases.avaliacion2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CString {
    private String texto;
    private String textoOriginal;

    public void recolle() {
        try {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce un string:");
            textoOriginal = buffer.readLine();
            texto =textoOriginal;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void amosa() {
        System.out.println("String actual: " + texto);
        texto=textoOriginal;
    }

    public void maiusculas() {
        StringBuffer buffer = new StringBuffer(texto.toUpperCase());
        texto = buffer.toString();
        amosa();
    }

    public void minusculas() {
        StringBuffer buffer = new StringBuffer(texto.toLowerCase());
        texto = buffer.toString();
        amosa();
    }

    public void arroba() {
        StringBuffer buffer = new StringBuffer(texto);
        for (int i = 0; i < buffer.length(); i++) {
            char currentChar = buffer.charAt(i);
            if (currentChar == 'a' || currentChar == 'A') {
                buffer.setCharAt(i,'@');
            }
        }
        texto = buffer.toString();
        amosa();
    }


    public void espacioBlanco() {
        StringBuffer buffer = new StringBuffer(textoOriginal);
        boolean espacioEncontrado = false;

        for (int i = 0; i < buffer.length(); i++) {
            if (Character.isWhitespace(buffer.charAt(i))) {
                if (!espacioEncontrado) {
                    espacioEncontrado = true;
                } else {
                    buffer.deleteCharAt(i);
                    i--; 
                }
            } else {
                espacioEncontrado = false;
            }
        }

        texto = buffer.toString();
        amosa();
    }



    public void sinNumeros() {
        StringBuffer buffer = new StringBuffer(textoOriginal);
        for (int i = 0; i < buffer.length(); i++) {
            if (Character.isDigit(buffer.charAt(i))) {
                buffer.deleteCharAt(i);
                i--;
            }
        }
        texto = buffer.toString();
        amosa();
    }


  
}
