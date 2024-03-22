package compilador41_49;
import java.io.IOException;
public class compi43 {
	public static void main(String[] args) throws IOException{
		char letra;
		System.out.println(">");
		letra= (char)System.in.read();
		while(letra!='\n') {
			System.out.println(letra);
			letra=(char)System.in.read();
			
		}
	}

}
