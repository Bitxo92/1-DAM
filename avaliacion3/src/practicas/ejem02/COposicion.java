 package practicas.ejem02;

public class COposicion {
   private CAspirante[] oposicion = new CAspirante[5];
   private int total = 0;

   public void llenar() {
      oposicion[0] = new CAspirante(100, "Marta Martínez", 35.95F);
      oposicion[1] = new CAspirante(200, "Marcos Arias", 45.75F);
      oposicion[2] = new CAspirante(300, "Uxía Novoa", 38.25F);
      oposicion[3] = new CAspirante(400, "Joan Barcel", 29.85F);
      oposicion[4] = new CAspirante(500, "Petra Raiña", 26.15F);
      total = 5;
   }

   public void vaciar() {
      total = 0;
   }

   private int dameIndice(int cla) {
      for(int i = 0; i < total; ++i) {
         if (oposicion[i].getClave() == cla) {
            return i;
         }
      }

      return -1;
   }

   private void elimina(int i) {
      while(i < total - 1) {
         oposicion[i] = oposicion[i + 1];
         ++i;
      }

      --total;
   }

   public void eliminarAspirante(int cla) {
      int indice = dameIndice(cla);
      if (indice == -1) {
         System.out.println("Aspirante no ENCONTRADO");
      } else {
         elimina(indice);
         System.out.println("Aspirante ELIMINADO");
      }

   }

   public void mostrar() {
      if (total == 0) {
         System.out.println("Oposición VACIA");
      } else {
         mostrarCabecera();

         for(int i = 0; i < total; ++i) {
            oposicion[i].mostrar();
         }
      }

   }

   private void mostrarCabecera() {
      System.out.println("CLAVE\tNOMBRE  \tTASAS");
      System.out.println("=====\t======  \t=====");
   }

   private void menu() {
      System.out.println("\n  M E N U - 2");
      System.out.println("  ===========");
      System.out.println("1.- LLENAR Oposición");
      System.out.println("2.- VACIAR Oposición");
      System.out.println("3.- MOSTRAR Oposición");
      System.out.println("4.- ELIMINAR Aspirante");
      System.out.println("5.- FINAL");
      System.out.print("Pulsa opción: ");
   }

   public int dameOpcion() {
      menu();
      int opcion = Leer.datoInt();
      System.out.println();
      return opcion;
   }
}
