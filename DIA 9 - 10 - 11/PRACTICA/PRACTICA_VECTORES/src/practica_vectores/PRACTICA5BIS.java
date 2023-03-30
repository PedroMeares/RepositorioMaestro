/*
Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package practica_vectores;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class PRACTICA5BIS {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int cont = 0;
        Scanner sc = new Scanner(System.in);
        llenarMatriz(matrizA, sc);
        matrizAT(matrizA, matrizB);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizA[i][j] == -matrizB[i][j]) {
                    cont++;
                }
            }
        }
        if (cont == 9) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }

    public static int[][] llenarMatriz(int[][] matrizA, Scanner sc) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese un valor: ");
                matrizA[i][j] = sc.nextInt();
            }
        }
        return matrizA;
    }

    public static int[][] matrizAT(int[][] matrizA, int[][] matrizB) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = matrizA[j][i];
            }
        }
        return matrizB;
    }
}
   

