package examen2023;

import java.util.Scanner;

public class pregunta1 {
	public static void main(String[] args) {

		int edad;
		int a=0;//contador del rango(40,60)
		int b=0;//contador del rango(55,65)
		int c=0;//contador del rango(60,80)
		int d=0;//contador del rango(65,90)
		Scanner teclado = new Scanner(System.in);

		System.out.print(" Dame edad: ");
		edad = teclado.nextInt();

		while (edad >= 40 && edad <= 90) {
			System.out.print("CORRECTO, edad pulsada: " + edad);
			
			if ((edad >= 40 && edad <= 60) && (edad >= 55 && edad <= 65) && (edad >= 60 && edad <= 80)) {
				
				System.out.print("-> modificados estos intervalos:(40,60) (55,65) (60,80)");
				a++;
				b++;
				c++;

			}
			
			else if((edad >= 55 && edad <= 65) && (edad >= 60 && edad <= 80)&& (edad>=65&&edad<=90)) {
				System.out.print("-> modificados estos intervalos: (55,65) (60,80) (65,90)");
				b++;
				c++;
				d++;
				
			}
			
			else if((edad >= 40 && edad <= 60) && (edad >= 55 && edad <= 65)) {
				System.out.print("-> modificados estos intervalos: (40,60) (55,65)");
				a++;
				b++;
			}
			
			else if((edad >= 55 && edad <= 65) && (edad >= 60 && edad <= 80)) {
				System.out.print("-> modificados estos intervalos: (55,65) (60,80)");
				b++;
				c++;
				
			}
			
			else if((edad >= 60 && edad <= 80)&& (edad>=65&&edad<=90)) {
				System.out.print("-> modificados estos intervalos: (60,80) (65,90)");
				c++;
				d++;
			}
			
			else if((edad >= 40 && edad <= 60)) {
				System.out.print("-> modificados este intervalo: (40,60)");
				a++;
				
			}
			else {
				System.out.print("-> modificados este intervalo: (65,90)");
				d++;
			}
			
			System.out.print("\n Dame edad: ");
			edad = teclado.nextInt();
				
		}
		
		teclado.close();
		
		System.out.println(" +++++> Entre 40 e 60 pulsaronse " +a +" edades");
		System.out.println(" +++++> Entre 55 e 65 pulsaronse " +b +" edades");
		System.out.println(" +++++> Entre 60 e 80 pulsaronse " +c +" edades");
		System.out.println(" +++++> Entre 65 e 90 pulsaronse " +d +" edades");

	}

}
