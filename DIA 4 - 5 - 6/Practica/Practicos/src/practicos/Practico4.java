/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra 
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá  imprimir 
“INCORRECTO”. Nota: investigar la funció n Substring y equals() de Java.
 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase o palabra.");
        String frase = leer.nextLine();
        //Aca paso todo a minusculas
        String subfrase = frase.toLowerCase();
        String texto;

        //Aca obtengo la 1er letra de la frase o palabra.
        texto = subfrase.substring(0, 1);

        if ("a".equals(texto)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
