/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a continuaciónn 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial.
 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cont = 0, num2, num;

        System.out.println("Ingrese el valor maximo.");
        num = leer.nextInt();
        if (num > 0) {

            while (cont <= num) {
                System.out.println("Ingrese el valor a sumar");
                num2 = leer.nextInt();
                cont = cont + num2;
            }
        }
        System.out.println("Se superó el limte: " + num + "\nEl acumulador fue de: " + cont);
    }
}
