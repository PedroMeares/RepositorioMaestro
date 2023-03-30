/*
 Escriba un programa que valide si una nota está entre 0 y 10, 
 sino está entre 0 y 10 la nota se pedirá de nuevo hasta que 
 la nota sea correcta.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Teoria8 {

    public static void main(String[] args) {
        int nota;
        Scanner leer = new Scanner(System.in);
        nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.println("Escriba el valor de su nota (0-10)");
            nota = leer.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada no es valida, intente de nuevo");
            }
        }
        System.out.println("La nota ingresada es:" + nota);
    }

}
