/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
 el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package clase2.ej.practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir un numero entero");
        int num = leer.nextInt();
        
        System.out.println("Su doble es " + (num*2));
        
        System.out.println("Su triple es " + (num*3));
        
        System.out.println("Su raiz es " + Math.sqrt(num));
    }
    
}
