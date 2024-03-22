package practicas1_4;
import misClases.avaliacion1.CFecha;
public class practica1 {

    // Método main público y estático
    public static void main(String[] args) {
    	
        // Crear un objeto de la clase CFecha
        CFecha fecha = new CFecha();

        // Enviar mensajes para recoger el día, mes y año
        fecha.recogeDia();
        fecha.recogeMes();
        fecha.recogeAno();

        // Mostrar el resultado utilizando el método amosaResultado()

        fecha.amosaResultado();
    }
}

