/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package practica.clase;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, opc;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo numero");
        num2 = scanner.nextInt();

        System.out.println("Elegir la opcion que quieras hacer: ");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.println("La suma de los nros es: " + suma(num1, num2));

                break;
            case 2:
                System.out.println("La resta de los nros es: " + resta(num1, num2));

                break;
            case 3:
                System.out.println("La multiplicacion de los nros es: " + producto(num1, num2));

                break;
            case 4:
                System.out.println("La division de los nros es: " + cociente(num1, num2));

                break;
            default:
                System.out.println("El numero ingresado no se encuentra en las opciones");

        }
    }

    public static int suma(int num1, int num2) {

        return num1 + num2;
    }

    public static int resta(int num1, int num2) {
        int resultado = num1 - num2;
        return resultado;
    }

    public static int producto(int num1, int num2) {
        int resultado = num1 * num2;
        return resultado;
    }

    public static double cociente(int num1, int num2) {
        double resultado = (double) num1 / num2;
        return resultado;
    }
}
