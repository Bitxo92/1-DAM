package practicas1_4;

import misClases.avaliacion1.CHora;

public class practica3 {

    public static void main(String[] args) {
        // Crear un objeto de la clase CHora
        CHora miHora = new CHora();

        // Utilizar mensajes para recoger los segundos, minutos y la hora
        
        miHora.ingresarSegundo();
        miHora.ingresarMinuto();
        miHora.ingresarHora();

        // Mostrar el resultado
        
        miHora.imprimirHora();
    }
}

