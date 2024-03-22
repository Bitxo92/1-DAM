package compilador26_34;
import java.util.Scanner;
public class compi30 {
	public static void main(String[] args) {
		int i =1;
		int j=1;
		int sumValor1=0;
		int a =1;
		int b=1;
		int sumValor2 =0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("PRIMERA Lista");
		
		while(i<=4) {
			System.out.println("Dame valor " + j+ " : ");
			 int valor1 = teclado.nextInt();
			 sumValor1= sumValor1+valor1;
			 j++;
			 i++;
		}
		
	    System.out.println("SEGUNDA Lista");
	    
	    while(a<=4) {
	    	System.out.println("Dame valor "+ b+ " : ");
	    	int valor2= teclado.nextInt();
	    	sumValor2 =sumValor2+valor2;
	    	b++;
	    	a++;
	    }
		teclado.close();
	    System.out.println("TOTAL Lista 1: " + sumValor1);
	    System.out.println("TOTAL Lista 2: " + sumValor2);
	    
	    
	    if(sumValor1>sumValor2) {
	    	System.out.println("Lista 1 MAYOR");
	    }
	    else {
	    	System.out.println("Lista 2 Mayor");
	    }
		
	}

}
