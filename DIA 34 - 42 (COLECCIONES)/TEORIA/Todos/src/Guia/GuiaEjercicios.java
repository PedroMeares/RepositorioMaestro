/*
1) Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
 */
package Guia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class GuiaEjercicios {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        //1) Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.

        //          Listas
        ArrayList<Integer> x = new ArrayList();
        System.out.print("Ingrese 5 valores para cargar la lista: ");
        for (int i = 0; i < 5; i++) {
            x.add(i, read.nextInt());
        }
        System.out.print("Lista: ");
        System.out.println(x);
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        //          Remover un elemento de la lista
        x.remove(0);
        System.out.print("Nueva lista: ");
//        for (Integer n : x) {
//            System.out.print(n+" ");
//        }
        x.forEach((n) -> {
            System.out.print(n + " ");
        });

        //          Conjunto o Set
        HashSet<Integer> y = new HashSet();
        System.out.print("\nIngrese 5 valores para cargar el conjunto o set: ");
        for (int i = 0; i < 5; i++) {
            y.add(read.nextInt());
        }
        System.out.print("Conjunto:");
        System.out.println(y);
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        //          Remover un elemento del conjunto o set
        y.remove(34);
        System.out.print("Nuevo Conjunto o Set: ");
        for (Integer integer : y) {
            System.out.print(integer + " ");
        }
//        System.out.println(y);

        //          Mapas
        HashMap<Integer, String> dni = new HashMap();
        for (int i = 0; i < 5; i++) {
            System.out.print("\nIngrese el dni y nombre de 5 personas: ");
            dni.put(read.nextInt(), read.next());
        }
        System.out.println(dni);
        System.out.println("Presione cualquier tecla para continuar...");
        new java.util.Scanner(System.in).nextLine();
        //          Remover un elemento del mapa
        dni.remove(2);
        System.out.println("Nuevo Mapa: ");
        dni.entrySet().forEach((entry) -> {
            System.out.println("Dni: " + entry.getKey() + "\tNombre: " + entry.getValue());
        });
//        for (Map.Entry<Integer, String> entry : dni.entrySet()) {
//            System.out.println("Dni: " + entry.getKey() + "\tNombre: " + entry.getValue());
//        }
    }
}
