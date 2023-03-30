/*
 Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Extras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double height, prom_gen = 0, prom_men = 0, j = 0;
        System.out.print("Cantidad de personas a medir: ");
        int n = read.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Altura de la persona:  ");
            height = read.nextDouble();
            if (height <= 1.6) {
                prom_men = prom_men + height;
                j++;
            }
            prom_gen = prom_gen + height;
        }
        System.out.println("El promedio de la altura general es:  " + (prom_gen / n)
                + "\nEl promedio de menor a 1,60m es:  " + (prom_men / j));
    }

}
