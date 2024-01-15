package misClases.avaliacion2;

public class CRecursivo {

	

	private int[] vector = { 1, 3, 6, 2, 8, 7 };

	public void amosa1_N(int n) {

		if (n >= 1) {
			amosa1_N(n - 1);
			System.out.print(n + " ");

		}
	}

	public void amosaN_1(int n) {
		if (n >= 1) {
			System.out.print(n + " ");
			amosaN_1(n - 1);
		}
	}

	public void amosaA_B(int a, int b) {

		if (a <= b) {
			amosaA_B(a, b - 1);
			System.out.print(b + " ");

		}
	}

	public void amosaB_A(int a, int b) {
		if (b >= a) {

			System.out.print(b + " ");
			amosaB_A(a, b - 1);

		}
	}

	public int factorial(int x) {
		if (x >= 1) {
			return x * factorial(x - 1);
		} else {
			return 1; // el factorial de 1 es 1;
		}
	}

	public int suma1_N(int n) {
		if (n >= 1) {
			return n + suma1_N(n - 1);
		} else
			return n;
	}

	public int sumaA_B(int a, int b) {
		if (b >= a) {
			return b + sumaA_B(a, b - 1);
		} else
			return 0;
	}

	public void amosa(int n) {
		if (n >= vector[0]) {
			amosa(n - 1);

			System.out.print(vector[n] + " ");
			
		} else
			System.out.print(vector[0]+" ");
	}
	
	
	public void amosaReves(int n) {
		if (n >= vector[0]) {
			

			System.out.print(vector[n] + " ");
			amosaReves(n - 1);
			
		} else
			System.out.print(vector[0]+" ");
	}
	
	

}
