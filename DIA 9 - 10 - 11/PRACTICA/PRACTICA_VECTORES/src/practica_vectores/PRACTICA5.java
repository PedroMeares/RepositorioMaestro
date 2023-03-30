/*
 Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta 
de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package practoca5;

/**
 *
 * @author CDR
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    public static boolean esAntisimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Comprobamos si la matriz es cuadrada
        if (filas != columnas) {
            return false;
        }

        // Comprobamos si la matriz es antisimétrica
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }

}
