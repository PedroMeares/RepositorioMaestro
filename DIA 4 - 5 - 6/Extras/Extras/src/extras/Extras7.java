/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Extras7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
        int max = 0, min = 0, lim, n, i = 1, j = 0;
        double acum = 0;
        System.out.print("Ingrese limite: ");
        lim = read.nextInt();
        System.out.println("Con Do-While:");
        do {
            System.out.print("Ingrese nro. " + i + ": ");
            n = read.nextInt();
            
            if (max<n) {
                max = n;
            }
            if (j == 0) {
                min = n;
                j++;
            } else {
                if (min > n) {
                    min = n;
                }
            }
            if (n > 0) {
                acum = acum + n;
            }
            i++;
        } while (i <= lim);
        System.out.println("El maximo fue: " + max + "\tEl minimo fue: " + min + "\tEl promedio es: " + (acum / lim));
        System.out.println("Con While:");
        i = 1;
        j = 0;
        acum = 0;
        min = 0;
        max = 0;
        while (i <= lim) {
            System.out.print("Ingrese nro. " + i + ": ");
            n = read.nextInt();
            if (n > max) {
                max = n;
            }
            if (j == 0) {
                min = n;
                j++;
            } else {
                if (min > n) {
                    min = n;
                }
            }
            if (n > 0) {
                acum = acum + n;
            }
            i++;
        }
        System.out.println("El maximo fue: " + max + "\tEl minimo fue: " + min + "\tEl promedio es: " + (acum / lim));
    }
    
}
