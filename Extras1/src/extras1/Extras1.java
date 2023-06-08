/*

 */
package extras1;

import Servicios.AhorcadoService;
import java.util.Scanner;

public class Extras1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AhorcadoService as = new AhorcadoService();
        char salida = 'a';
        do {
            System.out.println("1- Iniciar Juego");
            System.out.println("2- Salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    as.juego();
                    break;
                case 2:
                    System.out.println("Seguro desea salir? (S para confirmar)");
                    salida = leer.next().charAt(0);
                    if (salida == 'S') {
                        System.out.println("Gracias por participar!");
                    }
                    break;
                default:
                    System.out.println("No se reconoce la opcion ingresada");
            }
        } while (salida != 'S');
    }
}
