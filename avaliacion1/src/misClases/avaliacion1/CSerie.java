package misClases.avaliacion1;

public class CSerie {
	private int i;

	public void amosa1_10() {
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

	public void amosa10_1() {
		i = 10;
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}

	public void amosaAta20(int i) {

		for (int j = i; j <= 20; j++) {
			System.out.println(j);

		}
	}

	public void amosaDende20(int i) {
		int j = 20;
		while (i <= j) {
			System.out.println(j);
			j--;

		}

	}

	public void amosaA_B(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);

		}
	}

	public void amosaB_A(int a, int b) {
		while (a <= b) {
			System.out.println(b);
			b--;
		}
	}

	public void amosaB_AsumaAimpares(int a, int b) {
		for (i = b; i >= a; i--) {
			if (i % 2 != 0)
				System.out.print(a + "+" + i);
			else {
				System.out.print(" ");
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}

	public void amosaA_BrestaBtres(int a, int b) {
		for (i = a; i <= b; i++) {
			if (i % 3 == 0)
				System.out.print("(" + b + "-" + i + ")");
			else {
				System.out.print(" ");
				System.out.print(i);
				System.out.print(" ");
			}
		}
	}

	public void amosaA_Bsuma500seis(int a, int b) {
		for (i = a; i <= b; i++) {
			if (i % 6 == 0)
				System.out.print((500 + i) + " ");
			else if (i % 2 == 0)
				System.out.print(i + " ");

		}
	}

	public void amosaA_Bmulti4partido(int a, int b) {

		for (i = a; i <= b; i++) {
			if (i % 4 == 0)
				System.out.print("(" + i / 4 + "*" + "4" + ")" + " ");
			else
				System.out.print(i + " ");
		}
	}

	public int amosaResult(int a, int b) {
		int result=0;
		for (int i = 70000; i <= 150000; i++) {
			if ((byte) i == a && (short) i == b) 
				result = i;

		}
		return result;

	}
}
