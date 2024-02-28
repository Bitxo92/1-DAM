package misClases.avaliacion2;

import misClases.teoria.Leer;

public class CMatrices {
	private int[][] A = new int[3][3];
	private int[][] B = new int[3][3];
	private int[][] C = new int[3][3];
	private int[][] D = new int[3][3];
	private int n = 3;

	private int[][] dameReferencia(char letra) {
		switch (letra) {
		case 'A':
			return A;
		case 'B':
			return B;
		case 'C':
			return C;
		case 'D':
			return D;
		default:
			throw new IllegalArgumentException("Argumento Invalido: " + letra);		
		}}

	public void recolle() {
		System.out.print("Introduce dimension(2 o 3):     ");
		this.n = Leer.datoInt();

		int i;
		int j;
		for (i = 0; i < n; ++i) {
			for (j = 0; j < n; ++j) {
				System.out.print("A[" + i + "][" + j + "]:");
				A[i][j] = Leer.datoInt();
			}
		}

		for (i = 0; i < n; ++i) {
			for (j = 0; j < n; ++j) {
				System.out.print("B[" + i + "][" + j + "]:");
				B[i][j] = Leer.datoInt();
			}
		}

	}

	public void amosa(char una, char dos) {
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		System.out.println();

		for (int i = 0; i < this.n; ++i) {
			int j;
			for (j = 0; j < this.n; ++j) {
				if (M1[i][j] >= 0 && M1[i][j] <= 9) {
					System.out.print("     " + M1[i][j]);
				} else {
					System.out.print("    " + M1[i][j]);
				}
			}

			System.out.print("     ");

			for (j = 0; j < n; ++j) {
				if (M2[i][j] >= 0 && M2[i][j] <= 9) {
					System.out.print("     " + M2[i][j]);
				} else {
					System.out.print("    " + M2[i][j]);
				}
			}

			System.out.println();
		}

		System.out.println();
	}

	public void trasposta(char una, char dos) {
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				M2[i][j] = M1[j][i];
			}
		}

	}

	public void suma(char una, char dos, char tres) {
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		int[][] M3 = dameReferencia(tres);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				M3[i][j] = M1[i][j] + M2[i][j];
			}
		}

	}

	public void resta(char una, char dos, char tres) {
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		int[][] M3 = dameReferencia(tres);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				M3[i][j] = M1[i][j] - M2[i][j];
			}
		}

	}

	public void multiplica(char una, char dos, char tres) {
		int[][] M1 = dameReferencia(una);
		int[][] M2 = dameReferencia(dos);
		int[][] M3 = dameReferencia(tres);

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				M3[i][j] = 0;

				for (int k = 0; k < n; ++k) {
					M3[i][j] += M1[i][k] * M2[k][j];
				}
			}
		}

	}
}
