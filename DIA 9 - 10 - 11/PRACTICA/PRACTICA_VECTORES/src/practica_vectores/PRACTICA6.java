/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde 
la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa 
que permita introducir un cuadrado por teclado y determine si este cuadrado es 
mágico o no. El programa deberá comprobar que los números introducidos son correctos, 
es decir, están entre el 1 y el 9.
 */
package practica_vectores;

import java.util.Scanner;


public class PRACTICA6 {

    public static void main(String[] args) {
        {
            int[][] cuadrado = new int[3][3]; // creación del cuadrado mágico
            Scanner scanner = new Scanner(System.in);

            // ingreso de los valores del cuadrado mágico
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Ingrese el valor para la fila " + (i + 1) + " columna " + (j + 1) + ": ");
                    cuadrado[i][j] = scanner.nextInt();
                    // comprobación de que el valor ingresado está entre 1 y 9
                    while (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                        System.out.print("Valor incorrecto. Ingrese un valor entre 1 y 9: ");
                        cuadrado[i][j] = scanner.nextInt();
                    }
                }
            }

            // cálculo de la suma mágica
            int sumaMagica = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];

            // comprobación de filas
            for (int i = 0; i < 3; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 3; j++) {
                    sumaFila += cuadrado[i][j];
                }
                if (sumaFila != sumaMagica) {
                    System.out.println("El cuadrado no es mágico.");
                    return;
                }
            }

            // comprobación de columnas
            for (int j = 0; j < 3; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < 3; i++) {
                    sumaColumna += cuadrado[i][j];
                }
                if (sumaColumna != sumaMagica) {
                    System.out.println("El cuadrado no es mágico.");
                    return;
                }
            }

            // comprobación de diagonales
            int sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
            int sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
            if (sumaDiagonal1 != sumaMagica || sumaDiagonal2 != sumaMagica) {
                System.out.println("El cuadrado no es mágico.");
                return;
            }

            // si todas las sumas son iguales, el cuadrado es mágico
            System.out.println("El cuadrado es mágico.");
        }

    }
}
