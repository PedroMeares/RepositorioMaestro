/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado 
seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package javaapplication9;

import java.util.Scanner;

public class Teoria10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[4];

        // Leer los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número entre 1 y 20: ");
            numeros[i] = leer.nextInt();
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.print("Número inválido. Ingrese un número entre 1 y 20: ");
                numeros[i] = leer.nextInt();
            }
        }

        // Imprimir los asteriscos
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            for (int j = 0; j < numeros[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
