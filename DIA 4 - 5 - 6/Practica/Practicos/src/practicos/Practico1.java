/*
Crear un programa que dado un número determine si es par o impar.
 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }
    }

}
