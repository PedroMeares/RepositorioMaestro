/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Service;

import Entidad.Perro;
import java.util.Iterator;
import java.util.Scanner;

public class PerroService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    boolean flag = false;

    public void cargarRaza(Perro p) {
        String opc = "S", res;
        do {
            System.out.print("Ingrese raza de perro: ");
            p.getRaza().add(read.next());
            System.out.print("¿Desea ingresar otra raza de perro? S/N: ");
            res = read.next();
            System.out.println();
        } while (res.equalsIgnoreCase(opc));
        mostrar(p, flag);
    }

    public void mostrar(Perro p, boolean flag) {
        if (flag) {
            System.out.println("Se removió la raza. La nueva lista es:\n " + p.getRaza() + "\n");
        } else {
            System.out.println("Razas de perros:\n " + p.getRaza() + "\n");
        }
    }

    public void remover(Perro p) {
        Iterator<String> it = p.getRaza().iterator();
        System.out.print("Ingrese raza a eliminar: ");
        String rem = read.next();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(rem)) {
                it.remove();
                flag = true;
            }
        }
        mostrar(p, flag);
    }
}
