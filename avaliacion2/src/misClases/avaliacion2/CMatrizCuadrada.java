package misClases.avaliacion2;

public class CMatrizCuadrada {
	
	private int[][] matriz= {{1,2,3},{4,5,6},{7,8,9}};
	
	public void amosaDereitaAbaixo() {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
	}
	
	public void amosaDereitaArriba() {
		for(int i=matriz.length-1;i>=0;i--) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
	}
	
	
	public void amosaEsquerdaAbaixo() {
		for(int i=0;i<matriz.length;i++) {
			for(int j=matriz[0].length-1;j>=0;j--) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
		
	}
	
	public void amosaEsquerdaArriba() {
		for(int i=matriz.length-1;i>=0;i--) {
			for(int j=matriz[0].length-1;j>=0;j--) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public void amosaArribaDereita() {
		for(int j=matriz[0].length-1;j>=0;j--) {
			for(int i=0;i<matriz.length;i++) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
	}
	
	
	public void amosaArribaEsquerda() {
		
		for(int j=matriz[0].length-1;j>=0;j--) {
			for(int i=matriz.length-1;i>=0;i--) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
		
	}
	
	public void amosaAbaixoDereita() {
		for(int j=0;j<matriz[0].length;j++) {
			for(int i=0;i<matriz.length;i++) {
				System.out.print(matriz[i][j]+" "+" ");
			}
			System.out.println();
		}
		
	}
	
	public void amosaAbaixoEsquerda() {
		for(int j=0;j<matriz[0].length;j++) {
			for(int i=matriz.length-1;i>=0;i--) {
				System.out.print(matriz[i][j]+" "+" ");
				
			}
			System.out.println();
		}
		
	}

}
