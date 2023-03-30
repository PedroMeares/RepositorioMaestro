/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package practica_vectores;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class PRACTICA3 {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int cifra = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        System.out.print("Ingrese tamaño del vector: ");
        int size = read.nextInt();
        int vec[] = new int[size];
        vec = rellenar(size);
        for (int i = 0; i < size; i++) {
            if (vec[i] == 0) {
                cont1++;
            }
            while (vec[i] > 0) {
                vec[i] = vec[i] / 10;
                cifra++;
            }
            switch (cifra) {
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
            cifra = 0;
        }
        System.out.println("Hay " + cont1 + " números de 1 dígito.");
        System.out.println("Hay " + cont2 + " números de 2 dígitos.");
        System.out.println("Hay " + cont3 + " números de 3 dígitos.");
        System.out.println("Hay " + cont4 + " números de 4 dígitos.");
        System.out.println("Hay " + cont5 + " números de 5 dígitos.");
    }

    public static int[] rellenar(int tamaño) {
        Scanner read = new Scanner(System.in);
        int[] vector = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese numero: ");
            vector[i] = read.nextInt();
        }
        return vector;
    }

}
