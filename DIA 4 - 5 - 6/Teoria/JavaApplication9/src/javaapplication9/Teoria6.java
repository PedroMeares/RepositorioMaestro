/*
 * Implementar un programa que le pida dos números enteros al usuario y 
   determine si ambos o alguno de ellos es mayor a 25.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Teoria6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros aleatoreos");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25.");
        } else if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los dos numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los dos es mayor");
        }

    }

}
