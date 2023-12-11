package misClases.avaliacion2;

public class CMatriz {

	//array bidimensional de tipo int, con dimensión 2 X 3
	private int[][] matriz = new int[2][3];

	// Método para inicializar el array con datos específicos
	public void inicializa() {
		// Datos específicos para inicializar la matriz
		int[][] datos = { { 6, 9, 8 }, { 4, 7, 3 } };

		// Copiar los datos a la matriz
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = datos[i][j];
			}
		}
	}

	// Método para mostrar la matriz por filas
	public void amosaPorFilas() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j] + " " + " ");
			}
			// Nueva línea para separar filas
			System.out.println(); 
		}
	}

	// Método para mostrar la matriz por columnas
	public void amosaPorColumnas() {
		for (int j = 0; j < matriz[0].length; j++) {
			for (int i = 0; i < matriz.length; i++) {
				System.out.print(matriz[i][j] + " "+" ");
			}
			// Nueva línea para separar columnas
			System.out.println(); 
		}
	}
	
	public void amosaPorFilasTotal() {
		 for (int i = 0; i < matriz.length; i++) {
			 //reinicializamos contador a 0 tras salir del bucle j
	            int totalFila = 0;
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " "+" ");
	                totalFila += matriz[i][j];
	            }
	            System.out.println("(total: " + totalFila + ")");
	        }
		
	}
	
	
	public void amosaPorColumnasTotal() {
		
		for(int j=0;j<matriz[0].length;j++) {
			int totalColumna=0;
			for(int i=0;i<matriz.length;i++) {
				System.out.print(matriz[i][j] + " "+" ");
				totalColumna+=matriz[i][j];
	
			}
			System.out.println("(total: " + totalColumna + ")");
			
		}
	}
	
	
	
	public void oMaior() {
		int max=0;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				if(matriz[i][j]>max) {
					max=matriz[i][j];
				}
				
			}
		}
		System.out.println("O maior da matriz: "+max);
	}
	
	
	public void amosaFilaMaior(){
		int filaMaior = 0;
  
        int maiorValor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    filaMaior = i;
                    
                }
            }
        }

        System.out.println("Fila Maior");
        System.out.println("==========");

        for (int j = 0; j < matriz[filaMaior].length; j++) {
            System.out.print(matriz[filaMaior][j]);
        }
		
	}
	
	public void amosaColumnaMaior() {
	   
	    int colMaior = 0;
	    int maiorValor = matriz[0][0];

	    for (int j = 0; j < matriz[0].length; j++) {
	        for (int i = 0; i < matriz.length; i++) {
	            if (matriz[i][j] > maiorValor) {
	                maiorValor = matriz[i][j];
	                
	                colMaior = j;
	            }
	        }
	    }

	    System.out.println("Columna Maior");
	    System.out.println("==============");

	    for (int i = 0; i < matriz.length; i++) {
	    	System.out.printf("%6d%n", matriz[i][colMaior]);
	    }
	}


}
