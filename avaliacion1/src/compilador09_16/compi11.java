package compilador09_16;

import java.util.Scanner;

public class compi11 {
	public static void main(String[] args) {

		float pvp;
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Dame PVP: ");
		pvp = teclado.nextFloat();
		teclado.close();
		
		float precio = pvp/1.18F;// eliminamos iva para sacar precio
		
		float rebaja = precio-(precio*0.25F);//calculamos la rebaja restan el 25%
		
		float newPvp = rebaja*1.18f;// aplicamos 18% iva
				
		System.out.print("Precio---------------->");
		System.out.println(precio);
		
		System.out.print("Precio Rebajado------->");
		System.out.println(rebaja);
		
		System.out.print("Nuevo PVP------------->");
		System.out.println(newPvp);
		
		
		
	}

}
