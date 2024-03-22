package compilador41_49;
import java.io.IOException;
public class compi44 {
	public static void main(String[] args)throws IOException{
		char letra;
		int count =1;
		System.out.print(">");
		letra=(char)System.in.read();
	
		while(letra!='\n') {
			System.out.print(letra);
			letra=(char)System.in.read();
			if(letra!='\n') {
				count++;
			}
	
		}

		System.out.println("\nTeclas pulsadas: "+ count);
	}

}
