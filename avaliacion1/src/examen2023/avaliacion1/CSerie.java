package examen2023.avaliacion1;

public class CSerie {
	private int i;
	
	//metodo amosa desde B hasta A los multiplos de 3 y 4
	public void amosaA_Bmulti34reves(int a, int b) {
		
		for(i=b;i>=a;i--) {
			if(i%3==0 && i%4==0)
				System.out.print("(3-4)."+i+" ");
			else if(i%3==0)
				System.out.print("(3)."+i+" ");
			else if(i%4==0)
				System.out.print("(4)."+i+" ");
			else
				System.out.print(i+" ");
		}
	}

}
