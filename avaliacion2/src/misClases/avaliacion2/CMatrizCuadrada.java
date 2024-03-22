package misClases.avaliacion2;

public class CMatrizCuadrada {

	private int[][] matriz = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	private int[][] matrizA = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	private int[][] matrizB = new int[3][3];

	public void amosaDereitaAbaixo() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}
	}

	public void amosaDereitaArriba() {
		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}
	}

	public void amosaEsquerdaAbaixo() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = matriz[0].length - 1; j >= 0; j--) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}

	}

	public void amosaEsquerdaArriba() {
		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int j = matriz[0].length - 1; j >= 0; j--) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}

	}

	public void amosaArribaDereita() {
		for (int j = matriz[0].length - 1; j >= 0; j--) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}
	}

	public void amosaArribaEsquerda() {

		for (int j = matriz[0].length - 1; j >= 0; j--) {
			for (int i = matriz.length - 1; i >= 0; i--) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}

	}

	public void amosaAbaixoDereita() {
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			System.out.println();
		}

	}

	public void amosaAbaixoDereita2() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[j][i] + " " + " ");
			}
			System.out.println();
		}

	}

	public void amosaAbaixoEsquerda() {
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = matriz.length - 1; i >= 0; i--) {
				System.out.print(matriz[i][j] + " " + " ");

			}
			System.out.println();
		}

	}

	public void amosaAbaixoEsquerda2() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[j][2 - i] + " " + " ");
			}
			System.out.println();
		}
	}

	public void amosaAbaixoEsquerda3() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j == 0 ? 2 : j == 1 ? 0 : 1] + " ");
			}
			System.out.println();
		}
	}
	
	public void copiaAenB963741963() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[2-j][i==0?2:i==1?0:2];
			}

		}

	}
	
	public void copiaAenB369369147() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[j][i==0?2:i==1?2:0];
			}

		}

	}

	public void copiaAenBcolumna1Repe() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[j][i==0?0:i==1?2:0];
			}

		}

	}

	public void copiaAenBfila2Repe() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[2-j][i==0?2:1];
			}
		}
	}
	
	public void copiaAenBfila3Repe() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j] = matrizA[j==0?1:j==1?2:2][2-i];
			}
		}
	}
	
	

	public void amosaMatrizB() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();

		}

	}

	public void amosaMatrizA() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();

		}

	}
<<<<<<< HEAD
=======
	
	
	public void amosa(char letra) {
		int i, j;
		int[][] m = null;

		if (letra == 'A')
			m = matrizA;
		else if (letra == 'B')
			m = matrizB;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print("  " + m[i][j] + "  ");
			System.out.println();
		}
		System.out.println();
	}
	
	public void amosaEnColumna() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrizB[i][j]=matrizA[j==0?0:j==1?2:0][2-i];
			}
			

		}
	}
>>>>>>> origin/main

}
