package misClases.avaliacion2;

import java.util.Scanner;
@SuppressWarnings("all")
public class CMatrices {
    public int[][] matrizA;
    public int[][] matrizB;
    public int[][] matrizC;
    public int[][] matrizD;

    public void recolle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame o número de filas para as matrices: ");
        int filas = scanner.nextInt();
        System.out.println("Dame o número de columnas para as matrices: ");
        int columnas = scanner.nextInt();
        matrizA = new int[filas][columnas];
        matrizB = new int[filas][columnas];
        matrizC = new int[filas][columnas];
        matrizD = new int[filas][columnas];

        // Recoller datos matriz A
        System.out.println("Introduce os datos para a Matriz A:");
       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce o elemento na posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Recoller datos matriz B
        System.out.println("Introduce os datos para a Matriz B:");
       
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce o elemento na posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
    }

    public void amosa(int[][] matriz1, int[][] matriz2) {

            // Mostrar ambas matrices en la misma línea
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                	System.out.print(" ");
                    System.out.printf("%-3d", matriz1[i][j]);
                }
                System.out.print("          "); // Separación de 10 espacios
                for (int j = 0; j < 2; j++) {
                	System.out.print(" ");
                    System.out.printf("%-3d", matriz2[i][j]);
                }
                System.out.println();
            }
        
    }

    public void trasposta(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
    }

    public void suma(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    public void resta(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
    }

    public void multiplica(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
        // Para multiplicar débese cumprir a condición (o nº de filas = o nº de columnas)
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz3[i][j] = 0; // Inicializar a 0 antes de acumular
                for (int k = 0; k < matriz1[0].length; k++) {
                    matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
    }


    private void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " "+" "+" ");
            }
            System.out.println();
        }
    }
}


