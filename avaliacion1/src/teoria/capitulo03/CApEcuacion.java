package teoria.capitulo03;
import misClases.teoria.CEcuacion;
public class CApEcuacion {
	public static void main(String[] args) {
		CEcuacion ecuacion = new CEcuacion();
		ecuacion.Ecuacion(1, -3.2, 0, 7);
		double resultado1=ecuacion.ValorPara(1);
		double resultado2=ecuacion.ValorPara(1.5);
		System.out.println(resultado1);
		System.out.println(resultado2);
		
	}

}
