/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java.
 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase aleatorea");
        String frase = leer.nextLine();

        if ("Eureka".equals(frase)) {
            System.out.println("Mensaje correcto");
        } else {
            System.out.println("Mensaje incorrecto");
        }
    }
}
