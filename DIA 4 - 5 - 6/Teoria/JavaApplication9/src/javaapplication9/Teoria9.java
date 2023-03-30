/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero".  El programa deberá
calcular y mostrar el resultado de la suma de los números leídos, pero si el número 
es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Teoria9 {

    public static void main(String[] args) {
        int num, suma, cont;
        Scanner leer = new Scanner(System.in);
        suma = 0;
        cont = 0;

        while (cont < 20) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();

            if (num == 0) {
                System.out.println("Se ha encontrado el valor 0");
                break;
            }
            if (num < 0) {
                continue;
            }
            suma += num;
            cont++;
        }
        System.out.println("La suma de los numeros leido es " + suma);
    }
}
