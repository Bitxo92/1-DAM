package preparatorios;
import misClases.avaliacion2.CRecursivo;
public class prepara09 {
	public static void main(String[] args) {
		CRecursivo object = new CRecursivo();
		
		object.recolleCadena();
		int total = object.total();
		object.amosaDixitosDuplicados(total);
		
	}

}
