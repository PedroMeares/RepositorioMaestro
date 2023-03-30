/*
Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos.
 */
package extras;

import java.util.Random;
import java.util.Scanner;

public class Extras5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ingrese la cantidad de filas");
        int f = leer.nextInt();
        System.out.println("ingrese la cantidad de columnas");
        int c = leer.nextInt();
        int[][] matriz = new int[f][c];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        int suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("la suma de la matriz es " + suma);
    }
}
