/*
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto 
de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package Teoria;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Teorica11 {

    /**
     * @Peter args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        String retorno = convertir(frase);
        System.out.println(" La palabra convertida es:" + retorno);
    }

    public static String convertir(String frase) {
        String codigo = "";
        for (int i = 0; i < frase.length(); i++) {
            String letra = frase.substring(i, i + 1).toLowerCase();
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
            }
            codigo = codigo.concat(letra);
        }
        return codigo;
    }
}
