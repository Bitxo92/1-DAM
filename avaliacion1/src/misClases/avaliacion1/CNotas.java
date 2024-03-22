package misClases.avaliacion1;

public class CNotas {

	private float[] notas = { 3.2F, 7.45F, 8.15F, 5.6F, 5.35F, 9.15F, 2.45F, 4.4F, 6.7F, 1.8F };

	public void mostraNotas() {
		int i;

		System.out.println("Relacion de Notas");
		System.out.println("=================");
		for (i = 0; i < 10; i++) {
			System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
		}

	}

	public float dameNota(int i) {
		return notas[i];
	}

	public void mostraAprobados() {
		int i;
		System.out.println("Relacion de APROBADOS");
		System.out.println("=====================");
		for (i = 0; i < 10; i++) {
			if (notas[i] >= 5) {
				System.out.println("Alumno " + (i + 1) + ": " + notas[i]);

			}
		}
	}

	public void mostraSuspensos() {
		int i;
		System.out.println("Relacion de SUSPENSOS");
		System.out.println("=====================");
		for (i = 0; i < 10; i++) {
			if (notas[i] < 5) {
				System.out.println("Alumno " + (i + 1) + ": " + notas[i]);

			}
		}

	}

	public int dameMaior() {
		int i;
		int maior=0;
		float max = notas[0];
		for (i = 0; i < 10; i++) {
			if (notas[i] > max) {
				maior =i;
				max = notas[i];
			}
		}
		System.out.println("Alumno con MAIOR nota");
		System.out.println("=====================");
		System.out.println("Alumno " + (maior+1) + ": " + max);
		//int maxInt = (int) max;
		//return maxInt;
		return maior;
		
	}
	public int dameMenor() {
		int i;
		int menor=0;
		float min= notas[0];
		for(i=0;i<notas.length;i++) {
			if(notas[i]<min) {
				menor=i;
				min=notas[i];
			}
		}
		System.out.println("Alumno con MENOR nota");
		System.out.println("=====================");
		System.out.println("Alumno " + (menor+1) + ": " + min);

		return menor;
	}
	public float dameNotaMedia() {
		int i;
		float sum=0;
		float media;
		float count=0;
		for(i=0;i<notas.length;i++) {
			sum+=notas[i];
			count ++;
		}
		media= sum/count;
		
		System.out.println("=====================");
		System.out.println("Nota Media: "+media);

		
		return media;
	}

}
