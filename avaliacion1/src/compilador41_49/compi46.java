package compilador41_49;
import java.io.IOException;
public class compi46 {
	public static void main(String[] args)throws IOException{
		char letra;
		System.out.print(">");
		letra=(char)System.in.read();
		
		while(letra!='\n') {
			System.out.print((char)(letra-3));
			letra=(char)System.in.read();
		}
	}

}
