package misClases.utilidades;

import java.util.Random;

public class DatosPersonales {

    private static String[] nombres = {
        "Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Sofía", "Miguel", "Elena",
        "José", "Isabel", "Javier", "Lucía", "Diego", "Carmen", "Pablo", "Raquel", "Fernando", "Martina",
        "Roberto", "Teresa", "Antonio", "Beatriz", "Francisco"
    };

    private static String[] apellidos = {
        "García", "Martínez", "López", "González", "Rodríguez", "Fernández", "Pérez", "Sánchez", "Ramírez", "Torres",
        "Flores", "Vásquez", "Díaz", "Rojas", "Alvarez", "Ruiz", "Jiménez", "Moreno", "Mendoza", "Herrera",
        "Medina", "Aguilar", "Castro", "Ortiz", "Delgado"
    };

    public static String dameNombre() {
        Random random = new Random();
        int index = random.nextInt(nombres.length);
        return nombres[index];
    }

    public static String dameApellido() {
        Random random = new Random();
        int index = random.nextInt(apellidos.length);
        return apellidos[index];
    }
}
