/*

 */
package practica.clase;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practica4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero para saber si es primo.");
        int num = leer.nextInt();

        System.out.println(esPrimo(num));
    }

    public static boolean esPrimo(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

