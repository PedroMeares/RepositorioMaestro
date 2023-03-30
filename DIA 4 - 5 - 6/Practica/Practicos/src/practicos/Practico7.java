/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo 
lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser 
de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” 
marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, 
que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String codigo = "";
        int i = 0, j = 0;

        System.out.println("Ingrese un codigo ");

        do {
            codigo = leer.nextLine();
            if (codigo.substring(0, 1).equals("X") && codigo.substring(4, 5).equals("O")
                    && codigo.length() == 5) {

                i += 1;
            } else {
                j += 1;
            }

        } while (!("&&&&&".equals(codigo)));

        System.out.println("La cantidad de claves correctas fue de: " + i);
        System.out.println("La cantidad de claves incorrectas fue de: " + (j - 1));
    }
}
