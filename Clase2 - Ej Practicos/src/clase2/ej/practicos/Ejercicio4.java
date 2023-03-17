/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package clase2.ej.practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa los grados Centrigados");
        int centigrados = leer.nextInt();
        int F = 32 + (9*centigrados/5);
        System.out.println("La temperatura en Fahrenheit es " + F);
        
    }
    
}
