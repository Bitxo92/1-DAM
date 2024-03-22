package misClases.avaliacion1;

import java.util.Scanner;
@SuppressWarnings("all")
public class CFecha {

 // Atributos privados
 private int dia;
 private int mes;
 private int ano;

 // Métodos públicos
 public void recogeDia() {
     Scanner scanner = new Scanner(System.in);
     do {
         System.out.print("Introduce el día (entre 1 y 31): ");
         dia = scanner.nextInt();
     } while (dia < 1 || dia > 31);
     
 }

 public void recogeMes() {
     Scanner scanner = new Scanner(System.in);
     do {
         System.out.print("Introduce el mes (entre 1 y 12): ");
         mes = scanner.nextInt();
     } while (mes < 1 || mes > 12);
    
 }

 public void recogeAno() {
     Scanner scanner = new Scanner(System.in);
     do {
         System.out.print("Introduce el año (entre 1990 y 2010): ");
         ano = scanner.nextInt();
     } while (ano < 1990 || ano > 2010);
  
 }

 public void amosaResultado() {
 
	 System.out.print("Resultado: "+Dia()+Mes()+Ano());
 }

//Métodos privados
 private String Dia() {
     return String.format("%02d/", dia);
 }

 private String Mes() {
     return String.format("%02d/", mes);
 }

 private String Ano() {
     return String.format("%02d", (ano % 100));
 }
}

