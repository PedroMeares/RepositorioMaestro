/*
1-Diseñar un programa que lea y guarde razas de perros en un razaPerros de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el razaPerros.
2- Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class razaPerros {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList<>();

        Scanner leer = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingresa la raza del perro");
            String raza = leer.nextLine();

            razas.add(raza);

            System.out.println("Quiere seguir cargando.");
            continuar = leer.nextLine().equalsIgnoreCase("s");

        }
        for (String raza : razas) {
            System.out.println(raza);
        }
        System.out.println("");
        System.out.println("Cual es la raza que desea encontrar");
        String raza = leer.nextLine();

        Iterator<String> it = razas.iterator();
        boolean encontrada = false;

        while (it.hasNext()) {

            String proxRaza = it.next();
            if (proxRaza.equalsIgnoreCase(raza)) {
                System.out.println("Raza encontrada.");
                it.remove();
                encontrada = true;
                break;
            }

        }
        if (!encontrada) {
            System.out.println("Raza no encontrada.");
        }
        Collections.sort(razas);
        razas.forEach(r -> {
            System.out.println(r);
        });
        
    }
}
