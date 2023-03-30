/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Extras8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, cantNum = 0, cantPar = 0, cantImpar = 0;

        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            num = leer.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            } else {
                cantNum++;
                if (num % 2 == 0) {
                    cantPar++;
                } else {
                    cantImpar++;
                }
                if (num % 5 == 0) {
                    System.out.println("Se ha ingresado un múltiplo de 5.");
                    break;
                }
            }
        }

        System.out.println("Cantidad de números leídos: " + cantNum);
        System.out.println("Cantidad de números pares: " + cantPar);
        System.out.println("Cantidad de números impares: " + cantImpar);
    }

}
