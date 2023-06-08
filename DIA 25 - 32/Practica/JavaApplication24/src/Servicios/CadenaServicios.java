/*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicios {

    Cadena cadena1 = new Cadena();

    public void mostrarVocales(Cadena cadena1) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        String vocales = "AEIOUaeiou";
        System.out.println("Ingrese una frase");
        String frase1 = leer.nextLine();
        cadena1.setFrase(frase1);
        //cadena1.getFrase();

        for (int i = 0; i < frase1.length(); i++) {
            char c = frase1.charAt(i);
            if (vocales.indexOf(c) != -1) {
                cont++;
            }
        }
        System.out.println("Se encontraron: " + cont + " vocales.");
        System.out.println("--------------------------------------");
    }

    public void invertirFrase(Cadena cadena1) {

        String fraseInv = "";
        String frase1 = cadena1.getFrase();

        for (int i = frase1.length() - 1; i >= 0; i--) {
            fraseInv += frase1.charAt(i);
        }
        System.out.println("La frase invertida es: " + fraseInv);
        System.out.println("--------------------------------------");
    }

    public void vecesRepetido(Cadena cadena1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la letra que desea saber si se repite");
        String letra = leer.nextLine();
        cadena1.setLongitud(cadena1.getFrase().length());
        int cont = 0;

        for (int i = 0; i < cadena1.getLongitud(); i++) {

            if (letra.equals(cadena1.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        System.out.println("La letra " + letra + " se repite: " + cont);
        System.out.println("---------------------------------------");
    }

    public void compararLongitud(Cadena cadena1) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase");
        String fraseN = leer.nextLine();
        System.out.println("---------------------------------------");
        System.out.println("La primer frase tiene " + cadena1.getLongitud() + " caracteres.");
        System.out.println("---------------------------------------");
        System.out.println("La segunda frase tiene " + fraseN.length() + " caracteres.");
        System.out.println("---------------------------------------");

        if (cadena1.getLongitud() == fraseN.length()) {
            System.out.println("Tienen la misma longitud.");
            System.out.println("---------------------------------------");
        }
    }

    public void unirFrase(Cadena cadena1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una otra nueva frase");
        String fraseNdos = leer.nextLine();
        String fraseNtres = cadena1.getFrase().concat(" " + fraseNdos);
        System.out.println("---------------------------------------");
        System.out.println("La frase final queda de la siguiente forma: " + fraseNtres);
        System.out.println("---------------------------------------");
    }

    public void reemplazar(Cadena cadena1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("reemplazar");
        String frase = cadena1.getFrase();
        int longi = cadena1.getFrase().length();
        System.out.println("ingrese un caracter que reemplace a laletra 'A' ");
        String letra = leer.next();
        String fraseN = frase.replace("a", letra);
        System.out.println(fraseN);
        System.out.println("---------------------------------------");
    }
    
    public void contiene(Cadena cadena1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("conteiene");
        String frase = cadena1.getFrase();
        System.out.println("ingrese la letra que desea buscar");
        String letra = leer.next();
        int longi = cadena1.getFrase().length();
        for (int i = 0; i < longi; i++) {
            if ((frase.substring(i, i + 1).equalsIgnoreCase(letra))) {
                System.out.println("la letra " + letra + " se encuentra en la frase");
            }
        }
    }
    
}
