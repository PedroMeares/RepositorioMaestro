/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su 
equivalente: 1 día, 2 horas.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor de tiempo en minutos.");
        int min = leer.nextInt();
        int hora, dia;

        hora = min / 60;
        dia = hora / 24;
        hora = hora % 24;

        System.out.println(min + " minutos son " + dia + " días y " + hora + " horas.");

    }

}
