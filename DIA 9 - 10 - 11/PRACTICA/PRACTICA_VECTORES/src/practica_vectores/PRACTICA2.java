/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package practica_vectores;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class PRACTICA2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño del vector");
        int tamaño = leer.nextInt();

        int[] vector = new int[tamaño];

        //vector[i] =  (int)(Math.random()*10+1);
        vector = rellenar(tamaño);
        System.out.println("dime que numero deseas buscar");
        int num = leer.nextInt();
        int k = 0;

        for (int i = 0; i < tamaño; i++) {

            if (num == vector[i]) {

                System.out.println(num + " se encuentra en " + (i + 1) + " y se repite " + k + " veces ");
                k++;
            }
        }
        if (k == 0) {
            System.out.println("no se encuentra");
        }
    }

    public static int[] rellenar(int tamaño) {

        int[] vector = new int[tamaño];

        for (int i = 0; i < tamaño; i++) {

            vector[i] = (int) (Math.random() * 11);
            System.out.print(vector[i] + " , ");
        }

        return vector;

    }
}
