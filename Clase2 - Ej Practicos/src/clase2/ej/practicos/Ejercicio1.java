/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 */
package clase2.ej.practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribi tu nombre");
        String nombre = leer.next();
        System.out.println("Tu nombre es " + nombre);
    }
    
}
