package teoria.capitulo09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import misClases.teoria.CListaTfnos;
import misClases.teoria.CPersona;
import misClases.teoria.Leer;

public class CApListaTfnos {
    public static int menu() {
        System.out.print("\n\n");
        System.out.println("1. Buscar");
        System.out.println("2. Buscar siguiente");
        System.out.println("3. Añadir");
        System.out.println("4. Eliminar");
        System.out.println("5. Mostrar");
        System.out.println("6. Salir");
        System.out.println();
        System.out.print("Opción: ");
        int op;
        do {
            op = Leer.datoInt();
        } while (op < 1 || op > 6);
        return op;
    }

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader flujoE = new BufferedReader(isr);
        int opcion = 0, pos = -1;
        String cadenabuscar = null;
        String nombre, direccion;
        long telefono;
        boolean eliminado = false;
        CListaTfnos listaTfnos = new CListaTfnos();

        do {
            try {
                opcion = menu();
                switch (opcion) {
                    case 1: // buscar
                        System.out.print("Conjunto de caracteres a buscar: ");
                        cadenabuscar = flujoE.readLine();
                        pos = listaTfnos.buscar(cadenabuscar, 0);
                        if (pos == -1) {
                            if (listaTfnos.longitud() != 0)
                                System.out.println("Búsqueda fallida");
                            else
                                System.out.println("Lista vacía");
                        } else {
                            System.out.println(listaTfnos.valorEn(pos).obtenerNombre());
                            System.out.println(listaTfnos.valorEn(pos).obtenerDireccion());
                            System.out.println(listaTfnos.valorEn(pos).obtenerTelefono());
                        }
                        break;

                    case 2: // buscar siguiente
                        pos = listaTfnos.buscar(cadenabuscar, pos + 1);
                        if (pos == -1) {
                            if (listaTfnos.longitud() != 0)
                                System.out.println("Búsqueda fallida");
                            else
                                System.out.println("Lista vacía");
                        } else {
                            System.out.println(listaTfnos.valorEn(pos).obtenerNombre());
                            System.out.println(listaTfnos.valorEn(pos).obtenerDireccion());
                            System.out.println(listaTfnos.valorEn(pos).obtenerTelefono());
                        }
                        break;

                    case 3: // añadir
                        System.out.print("Nombre: ");
                        nombre = flujoE.readLine();
                        System.out.print("Dirección: ");
                        direccion = flujoE.readLine();
                        System.out.print("Teléfono: ");
                        telefono = Leer.datoLong();
                        listaTfnos.anhadir(new CPersona(nombre, direccion, telefono));
                        break;

                    case 4: // eliminar
                        System.out.print("Teléfono: ");
                        telefono = Leer.datoLong();
                        eliminado = listaTfnos.eliminar(telefono);
                        if (eliminado)
                            System.out.println("Registro eliminado");
                        else if (listaTfnos.longitud() != 0)
                            System.out.println("Teléfono no encontrado");
                        else
                            System.out.println("Lista vacía");
                        break;

                    case 5: // mostrar
                        listaTfnos.mostrarListaTfnos();
                        break;

                    case 6: // salir
                        listaTfnos = null;
                        break;
                }
            } catch (IOException ignorada) {
            }
        } while (opcion != 6);
    }
}

