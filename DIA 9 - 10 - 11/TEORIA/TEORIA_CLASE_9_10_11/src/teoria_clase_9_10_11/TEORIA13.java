/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de 
equipo y define su tipo de dato de tal manera que te permita alojar sus nombres 
más adelante.
 */
package teoria_clase_9_10_11;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class TEORIA13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de integrantes del equipo");
        int n = leer.nextInt();

        String[] Equipo = new String[n];

        Equipo = cargarDatos(n);

        System.out.println("Los integrantes del equipo son:");
        for (int i = 0; i < n; i++) {
            System.out.println(Equipo[i]);

        }

    }

    public static String[] cargarDatos(int n) {

        String[] equipo = new String[n];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de un integrante del Equipo");
            equipo[i] = leer.nextLine();

        }
        return equipo;
    }

}
