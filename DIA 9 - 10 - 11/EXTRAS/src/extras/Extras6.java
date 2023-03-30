/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación 
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
package extras;

import java.util.Scanner;


public class Extras6 {
    public static void main(String[] args) {
        
   
    Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];
        String[][] sopadeletras = new String[20][20];
        pedirpalabras(palabras, leer);
        llenarmatriz(palabras,sopadeletras);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(" " + sopadeletras[i][j] + " ");
                
            }
            System.out.println(" ");
        }
    }

    public static String[] pedirpalabras(String[] palabras, Scanner leer) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra de entre 3 y 5 caracteres.");
            palabras[i] = leer.next();
            if (palabras.length > 5 || palabras.length < 3) {
                System.out.println("La palabra no cumple las condiciones"
                        + ", ingrese otra palabra.");
                palabras[i] = leer.next();
            }
           
        }
         return palabras;
    }
    public static String[][] llenarmatriz(String[]p,String[][] sopa){
      int l;
        for (int i = 0; i < 5; i++) {
             l = p[i].length();
             int r = (int)(Math.random()*(19));
             int c = (int)(Math.random()*(14));
            for (int j = 0; j < l; j++) { 
                sopa[r][c] = p[i].substring(j ,(j+1));
                  c++;
            } 
        }
        return sopa;
    }
}
