package misClases.avaliacion1;

import java.util.Scanner;
@SuppressWarnings("all")
public class CHora {
    // Atributos
    private int hora;
    private int minuto;
    private int segundo;

   

    // Métodos para recoger los valores de hora, minuto y segundo
    public void ingresarHora() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce la hora (entre 0 y 23): ");
            hora = scanner.nextInt();
        } while (hora < 0 || hora > 23);
    }

    public void ingresarMinuto() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce los minutos (entre 0 y 59): ");
            minuto = scanner.nextInt();
        } while (minuto < 0 || minuto > 59);
    }

    public void ingresarSegundo() {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce los segundos (entre 0 y 59): ");
            segundo = scanner.nextInt();
        } while (segundo < 0 || segundo > 59);
    }

    // Método para imprimir la hora formateada
    public void imprimirHora() {
        System.out.print("Resultado: "+Hora()+Minuto()+Segundo());
    }
  //Métodos privados
    private String Hora() {
        return String.format("%02d:", hora);
    }

    private String Minuto() {
        return String.format("%02d:", minuto);
    }

    private String Segundo() {
        return String.format("%02d",segundo);
    }
    
}

