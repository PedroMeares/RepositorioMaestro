/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará un 
mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package practica.clase;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practica3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc, dolar, yen, libra;

        System.out.println("Introduzca la cantidad de Euros que desea cambiar.");
        int euro = leer.nextInt();

        System.out.println("-------------------------------------------------");
        System.out.println("Elegir la opcion de cambio que desea saber: ");
        System.out.println("1. Dolar");
        System.out.println("2. Yen");
        System.out.println("3. Libra");
        opc = leer.nextInt();

        System.out.println("-------------------------------------------------");

        switch (opc) {
            case 1:
                System.out.println("Son " + dolar(euro) + " dolares.");

                break;
            case 2:
                System.out.println("Son " + yen(euro) + " yenes.");

                break;
            case 3:
                System.out.println("Son " + libra(euro) + " libras.");

                break;
        }
        System.out.println("-------------------------------------------------");
    }

    public static int dolar(int euro) {
        return (int) (1.28611 * euro);
    }

    public static int yen(int euro) {
        int resultado = (int) (129.852 * euro);
        return resultado;
    }

    public static int libra(int euro) {
        int resultado = (int) (0.86 * euro);
        return resultado;
    }
}
