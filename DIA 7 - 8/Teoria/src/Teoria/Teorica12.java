/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número múltiplo del segundo e imprima si 
el primer número es múltiplo del segundo, sino informe que no lo son.

 */
package Teoria;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Teorica12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int n2 = sc.nextInt();
        esMultiplo(n1, n2);
    }

    public static void esMultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println("El numero " + n1 + " es multiplo de " + n2);
        } else {
            System.out.println("No son multiplos");
        }
    }
}
