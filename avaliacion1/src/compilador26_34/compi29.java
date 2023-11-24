package compilador26_34;

public class compi29 {
	public static void main(String[] args) {

		for (int i = 0, j = 0, fib = 1; fib < 1000; i = j, j = fib, fib = i + j)
			System.out.print(fib + " ");

	}

}
