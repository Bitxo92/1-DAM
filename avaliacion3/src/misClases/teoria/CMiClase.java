package misClases.teoria;

public class CMiClase {
	public void muestra(int a) throws EValorNoValido {
	
			if(a==0)
				throw new EValorNoValido("Error: valor ("+a+")");
			System.out.println(a);
//			if(a%2==0)
//				throw new EValorNoValido("Error: valor ("+a+")");
//			System.out.println(a);
		
		
		
		}

}
