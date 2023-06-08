/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisesService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    LinkedHashSet<String> pais = new LinkedHashSet<>();

    public void crearPais() {
        do {
            System.out.print("Ingrese país: ");
            pais.add(leer.next());
            System.out.print("¿Quiere guardar otro país? S/N: ");
        } while (!leer.next().equalsIgnoreCase("n"));
        mostrarPaises();
    }

    public void mostrarPaises() {
        System.out.println("\nLos países ingresados son:\n\t" + pais);
    }

    public void ordenarAlfa() {
        Set<String> paisesOrdenados = new TreeSet<>(pais);
        System.out.println("Conjunto ordenado alfabéticamente: " + paisesOrdenados);
    }

    public void buscarEliminarPais() {
        Iterator<String> paisIterator = pais.iterator();
        System.out.println("ingrese el Pais a eliminar");
        String unPais = leer.next();
        boolean borrar = false;
        while (paisIterator.hasNext()) {//Retorna verdadero si al iterator le quedan elementos por iterar
            if (paisIterator.next().equalsIgnoreCase(unPais)) {/*Devuelve el siguiente elemento en la colección, mientras le método hasNext() retorne true.
                                                           Este método es el que nos sirve para mostrar el elemento,*/
                paisIterator.remove();
                borrar = true;
            }
        }
        if (borrar) {
            System.out.println("se encontro y se borro el pais");
//            System.out.println(pais);
        } else {
            System.out.println("no se encontro el pais");
        }
        System.out.println(pais);

    }

}
