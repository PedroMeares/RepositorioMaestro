/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Extras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese letra: ");
        String letra=read.next();
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) ||
            "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
            System.out.println("Es vocal");
        } else {
            System.out.println("No es vocal");
        }
    }
    
}
