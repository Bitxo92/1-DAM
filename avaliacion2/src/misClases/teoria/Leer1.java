package misClases.teoria;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("all")

public class Leer1 {
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
			Short s = new Short(dato());
			return s;
		} catch (NumberFormatException var1) {
			return -32768;
		}
	}

	public static int datoInt() {
		try {
			Integer i = new Integer(dato());
			return i;
		} catch (NumberFormatException var1) {
			return Integer.MIN_VALUE;
		}
	}

	public static long datoLong() {
		try {
			Long l = new Long(dato());
			return l;
		} catch (NumberFormatException var1) {
			return Long.MIN_VALUE;
		}
	}

	public static float datoFloat() {
		try {
			Float f = new Float(dato());
			return f;
		} catch (NumberFormatException var1) {
			return Float.NaN;
		}
	}

	public static double datoDouble() {
		try {
			Double d = new Double(dato());
			return d;
		} catch (NumberFormatException var1) {
			return Double.NaN;
		}
	}
}