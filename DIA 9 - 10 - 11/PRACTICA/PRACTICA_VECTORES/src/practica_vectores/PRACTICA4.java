/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre 
la traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa).
 */
package practica_vectores;

/**
 *
 * @author Peter
 */
public class PRACTICA4 {

    public static void main(String[] args) {
        int[][] matrizA = new int[4][4];
        matrizA = rellenar(4, 4);
        int[][] matrizB = new int[4][4];
       matrizB = trasponer(matrizA, 4, 4);
        mostrar(matrizA, 4, 4);
       mostrar(matrizB, 4, 4);

    }

    public static int[][] rellenar(int f, int c) {
        int[][] matriz = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }

    public static int[][] trasponer(int[][] matrizA, int f, int c) {
        int[][] matriz = new int[c][f];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < f; j++) {
                matriz[i][j] = matrizA[j][i];
            }
        }
        return matriz;
    }

    public static void mostrar(int[][] matrizA, int f, int c) {

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("(" + matrizA[i][j] + ")");

            }
            System.out.println("");
        }
        System.out.println("");
    }
}
