package pruebasJunit;

public class calculadora {
	private float num1,num2;
	
	public calculadora(float a, float b) {
		num1=a;
		num2=b;
	}
	public float sumar(){
		float result= num1 + num2;
		return result;
	}
	public float restar(){
		float result= num2 - num1;
		return result;
	}
	
	public float dividir(){
		float result= num1 / num2;
		return result;
	}
	
	public float multiplicar(){
		float result= num1 * num2;
		return result;
	}
	
	
	
	public static void main(String[] args) {
		calculadora calc = new calculadora(124.48F,-5.74F);
		System.out.println("Ejemplo 1");
		System.out.println("la suma es: "+ calc.sumar());
		System.out.println("la resta es: "+ calc.restar());
		System.out.println("la division es: "+ calc.dividir());
		System.out.println("la multiplicacion es: "+ calc.multiplicar());
		
		System.out.println("\n");
		
		calculadora calc1 = new calculadora(2,4);
		System.out.println("Ejemplo 2");
		System.out.println("la suma es: "+ calc1.sumar());
		System.out.println("la resta es: "+ calc1.restar());
		System.out.println("la division es: "+ calc1.dividir());
		System.out.println("la multiplicacion es: "+ calc1.multiplicar());
		
	}

}
