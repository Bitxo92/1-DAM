package misClases.teoria;

public class CListaTfnos {
	private CPersona[]listaTelefonos;
	private int nElementos;
	
	public CListaTfnos() {
		nElementos=0;
		listaTelefonos= new CPersona[nElementos];
		
	}
	
	private void unElementoMas(CPersona[] listaActual) {
	    int nuevaLongitud = listaActual.length + 1;
	    CPersona[] nuevaLista = new CPersona[nuevaLongitud];
	    for (int i = 0; i < listaActual.length; i++) {
	        nuevaLista[i] = listaActual[i];
	    }
	    listaTelefonos = nuevaLista;
	    nElementos++;
	}

	private void unElementoMenos(CPersona[] listaActual) {
	    if (listaActual.length == 0)
	        return;
	    int nuevaLongitud = listaActual.length - 1;
	    CPersona[] nuevaLista = new CPersona[nuevaLongitud];
	    int k = 0;
	    for (int i = 0; i < listaActual.length; i++) {
	        if (listaActual[i] != null) {
	            nuevaLista[k++] = listaActual[i];
	        }
	    }
	    listaTelefonos = nuevaLista;
	    nElementos--;
	}

	
	public void ponerValorEn(int i, CPersona objeto) {
		if(i>=0&&i<nElementos)
			listaTelefonos[i]=objeto;
		else
			System.out.println("Indice fuera de limites");
	}
	public CPersona valorEn(int i) {
		if(i>=0&&i<nElementos)
			return listaTelefonos[i];
		else {
			System.out.println("indice fuera de limites");
			return null;
		}
	}
	
	public int longitud() {
		return nElementos;
	}
	
	public void anhadir(CPersona obj) {
	    unElementoMas(listaTelefonos); // Increase array size by 1
	    listaTelefonos[nElementos - 1] = obj; // Add the new person to the end of the array
	}

	
	public boolean eliminar(long tel) {
		for(int i=0;i<nElementos;i++)
			if(listaTelefonos[i].obtenerTelefono()==tel) {
				listaTelefonos[i]=null;
				unElementoMenos(listaTelefonos);
				return true;
			}
		return false;
	}
	
	public int buscar(String str, int pos) {
	    String nombre;
	    if (str == null)
	        return -1;
	    if (pos < 0)
	        pos = 0;
	    for (int i = pos; i < nElementos; i++) {
	        if (listaTelefonos[i] == null)
	            continue;
	        nombre = listaTelefonos[i].obtenerNombre();
	        if (nombre != null && nombre.contains(str))
	            return i;
	    }
	    return -1;
	}


	
	  public void mostrarListaTfnos() {
	        for (int i = 0; i < nElementos; i++) {
	            System.out.println("Persona " + (i + 1));
	            listaTelefonos[i].mostrarPersona();
	        }
	    }

}
