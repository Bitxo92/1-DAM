  package practicas.practi01;

import java.util.ArrayList;
import java.util.Iterator;

public class CJuzgado {
   private ArrayList<CProceso> juzgado = new ArrayList<>();

   public void llenar() {
      this.juzgado.removeAll(this.juzgado);
      this.juzgado.add(new CProceso("P101", "Empresa ARA", 1230.5F));
      this.juzgado.add(new CProceso("P102", "Punto limpio", 2245.75F));
      this.juzgado.add(new CProceso("P103", "Divorcio Pedro", 538.25F));
      this.juzgado.add(new CProceso("P104", "Concesionario", 3429.5F));
      this.juzgado.add(new CProceso("P105", "Alquiler piso", 826.25F));
      this.juzgado.add(new CProceso("P102", "Punto limpio", 2245.75F));
   }

   public void vaciar() {
      juzgado.removeAll(juzgado);
   }

   private CProceso dameProceso(String ide) {
      Iterator<CProceso> iterator = juzgado.iterator();

      while(iterator.hasNext()) {
         CProceso proceso = (CProceso)iterator.next();
         if (ide.equals(proceso.getIdentificador())) {
            return proceso;
         }
      }

      return null;
   }

   private CProceso dameProcesoModificado(CProceso pro) {
      this.mostrarCabecera();
      pro.mostrar();
      System.out.print("NUEVO identificador: ");
      pro.setIdentificador(Leer.datoString());
      System.out.print("NUEVO titulo: ");
      pro.setTitulo(Leer.datoString());
      System.out.print("NUEVO arancel: ");
      pro.setArancel(Leer.datoFloat());
      return pro;
   }

   public void modificarProceso(String ide) {
      CProceso proceso = this.dameProceso(ide);
      if (proceso == null) {
         System.out.println("Proceso no ENCONTRADO");
      } else {
         int indice = this.juzgado.indexOf(proceso);
         proceso = this.dameProcesoModificado(proceso);
        juzgado.set(indice, proceso);
      }

   }

   private CProceso nuevoProceso() {
      System.out.print("Identificador: ");
      String identificador = Leer.datoString();
      System.out.print("Titulo: ");
      String titulo = Leer.datoString();
      System.out.print("Arancel: ");
      float arancel = Leer.datoFloat();
      return new CProceso(identificador, titulo, arancel);
   }

   public void insertarProceso() {
      this.juzgado.add(this.nuevoProceso());
   }

   public void eliminarProceso(String ide) {
      CProceso proceso = this.dameProceso(ide);
      if (proceso == null) {
         System.out.println("Proceso no ENCONTRADO");
      } else {
         this.juzgado.remove(proceso);
         System.out.println("Proceso ELIMINADO");
      }

   }

   public void mostrar() {
      Iterator<CProceso> iterator = this.juzgado.iterator();
      if (this.juzgado.isEmpty()) {
         System.out.println("Juzgado VACIO");
      } else {
         this.mostrarCabecera();

         while(iterator.hasNext()) {
            ((CProceso)iterator.next()).mostrar();
         }
      }

   }

   private void mostrarCabecera() {
      System.out.println("IDENTIFICADOR\tTITULO  \tARANCEL");
      System.out.println("=============\t======  \t=======");
   }

   private void menu() {
      System.out.println("\n  M E N U - Prática 1");
      System.out.println("  ===================");
      System.out.println("1.- LLENAR Juzgado");
      System.out.println("2.- VACIAR Juzgado");
      System.out.println("3.- MOSTRAR Juzgado");
      System.out.println("4.- INSERTAR Proceso");
      System.out.println("5.- MODIFICAR Proceso");
      System.out.println("6.- ELIMINAR Proceso");
      System.out.println("7.- FINAL");
      System.out.print("Pulsa opción: ");
   }

   public int dameOpcion() {
      this.menu();
      int opcion = Leer.datoInt();
      System.out.println();
      return opcion;
   }
}