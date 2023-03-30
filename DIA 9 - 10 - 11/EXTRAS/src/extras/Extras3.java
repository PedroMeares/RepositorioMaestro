/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package extras;

import java.util.Random;

public class Extras3 {

    public static void main(String[] args) {
        int[] vector = new int[5];
        rellenarVector(vector);
        imprimirVector(vector);
    }

    public static void rellenarVector(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Números aleatorios entre 0 y 99
        }
    }

    public static void imprimirVector(int[] vector) {
        System.out.println("El vector conformado es:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println(" ");
    }
}
