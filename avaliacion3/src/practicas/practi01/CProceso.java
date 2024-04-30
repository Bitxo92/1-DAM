package practicas.practi01;

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
      return this.identificador;
   }

   public void setIdentificador(String iden) {
      this.identificador = iden;
   }

   public String getTitulo() {
      return this.titulo;
   }

   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }

   public float getArancel() {
      return this.arancel;
   }

   public void setArancel(float arancel) {
      this.arancel = arancel;
   }

   public void mostrar() {
      System.out.println(this.identificador + "\t\t" + this.titulo + "\t" + this.arancel);
   }
}