package misClases.teoria;

public class CRacional {
	int Numerador;
	int Denominador;

	public void AsignarDatos(int num, int den) {
		Numerador = num;

		if (den == 0) {
			den = 1;
		}
		Denominador = den;

	}

	public void VisualizarRacional() {
		System.out.println(Numerador + "/" + Denominador);

	}
}
