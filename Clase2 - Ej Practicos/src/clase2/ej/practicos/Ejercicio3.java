/*
Escribir un programa que pida una frase y la muestre toda en mayÃºsculas y despuÃ©s toda en minÃºsculas. 
Nota: investigar la funciÃ³n toUpperCase() y toLowerCase() en Java.
 */
package clase2.ej.practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);   
        System.out.println("Escribe una frase");
        String frase = leer.nextLine();
        
        System.out.println("Tu frase escrita en minuscula queda asi");
        System.out.println(frase.toLowerCase());
        System.out.println("Tu frase escrita en mayusculas queda asi");
        System.out.println(frase.toUpperCase());
}
    }
   
