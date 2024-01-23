package misClases.teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {
   public static String dato() {
      String sdato = "";

      try {
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader flujoE = new BufferedReader(isr);
         sdato = flujoE.readLine();
      } catch (IOException var3) {
         System.err.println("Error: " + var3.getMessage());
      }

      return sdato;
   }

   public static short datoShort() {
      try {
         return Short.parseShort(dato());
      } catch (NumberFormatException var1) {
         return -32768;
      }
   }

   public static int datoInt() {
      try {
         return Integer.parseInt(dato());
      } catch (NumberFormatException var1) {
         return Integer.MIN_VALUE;
      }
   }

   public static long datoLong() {
      try {
         return Long.parseLong(dato());
      } catch (NumberFormatException var1) {
         return Long.MIN_VALUE;
      }
   }

   public static float datoFloat() {
      try {
         return Float.parseFloat(dato());
      } catch (NumberFormatException var1) {
         return Float.NaN;
      }
   }

   public static double datoDouble() {
      try {
         return Double.parseDouble(dato());
      } catch (NumberFormatException var1) {
         return Double.NaN;
      }
   }
}
    