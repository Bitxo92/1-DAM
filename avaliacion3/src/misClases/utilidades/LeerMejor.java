package misClases.utilidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerMejor {
    public static String dato() {
        String sdato = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            sdato = flujoE.readLine();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        return sdato;
    }

    public static short datoShort() {
        try {
            return Short.parseShort(dato());
        } catch (NumberFormatException e) {
            System.out.println("Error short: " + e.getMessage() + "\n");
            return Short.MIN_VALUE; // valor más pequeño
        }
    }

    public static int datoInt() {
        try {
            return Integer.parseInt(dato());
        } catch (NumberFormatException e) {
            System.out.println("Error int: " + e.getMessage() + "\n");
            return Integer.MIN_VALUE; // valor más pequeño
        }
    }

    public static long datoLong() {
        try {
            return Long.parseLong(dato());
        } catch (NumberFormatException e) {
            System.out.println("Error long: " + e.getMessage() + "\n");
            return Long.MIN_VALUE; // valor más pequeño
        }
    }

    public static float datoFloat() {
        try {
            return Float.parseFloat(dato());
        } catch (NumberFormatException e) {
            System.out.println("Error float: " + e.getMessage() + "\n");
            return Float.NaN; // No es un Número; valor float.
        }
    }

    public static double datoDouble() {
        try {
            return Double.parseDouble(dato());
        } catch (NumberFormatException e) {
            System.out.println("Error double: " + e.getMessage() + "\n");
            return Double.NaN; // No es un Número; valor double.
        }
    }
}