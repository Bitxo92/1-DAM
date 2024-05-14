package practicas.practi02;

public class CProceso {
	private String identificador;
	private String titulo;
	private float arancel;

	public CProceso(String ide, String tit, float ara) {
		this.identificador = ide;
		this.titulo = tit;
		this.arancel = ara;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String iden) {
		identificador = iden;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public float getArancel() {
		return arancel;
	}

	public void setArancel(float arancel) {
		this.arancel = arancel;
	}

	public void mostrar() {
		System.out.println(identificador + "\t\t" + titulo + "\t" + arancel);
	}

}
