package practicas1_4;
public class practica2 {
    public static void main(String[] args) {
        int startAscii = 32;
        int endAscii = 126;

        for (int i = startAscii; i <= endAscii; i++) {
            
            System.out.printf("%-4d%-5c", i, (char) i);

            // añade una nueva linea cada 10 caracteres
            if ((i - startAscii +1) % 10 == 0) {
                System.out.println("\n");
                
            }
        }
    }
}
