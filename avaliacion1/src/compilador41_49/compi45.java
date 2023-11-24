package compilador41_49;
import java.io.IOException;
public class compi45 {
	public static void main(String[] args) throws IOException{
		char letra;
		System.out.print(">");
		letra= (char)System.in.read();
		
		//codigo byte tiene una relacion directa con ASCII
		//system.in.read convierte characteres a byte
		while(letra!='\n') {
			System.out.print((char)(letra+3));
			letra=(char)System.in.read();
		}
	}

}
