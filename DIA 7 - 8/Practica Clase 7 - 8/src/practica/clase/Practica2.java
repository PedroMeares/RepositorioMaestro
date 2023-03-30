/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos 
de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package practica.clase;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String respuesta = "";
        encuesta(sc, respuesta);
    }

    public static void encuesta(Scanner sc, String respuesta) {

        do {
            System.out.print("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
            System.out.print("¿Desea ingresar otra persona? (Sí/No): ");
            respuesta = sc.nextLine();
        } while (!respuesta.equalsIgnoreCase("No"));
    }
}
