/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package extras;

import java.util.Scanner;


public class Extras2BIS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la longitud de los vectores: ");
        int longitud = scanner.nextInt();
        
        int[] vector1 = new int[longitud];
        int[] vector2 = new int[longitud];
        
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vector1[i] = scanner.nextInt();
        }
        
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            vector2[i] = scanner.nextInt();
        }
        
        boolean sonIguales = true;
        
        if (vector1.length != vector2.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] != vector2[i]) {
                    sonIguales = false;
                    break;
                }
            }
        }
        
        if (sonIguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
        
        scanner.close();
    }
}
