/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa 
deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá 
ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, se debe mostrar 
el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve 
a mostrar el menú.


 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        String s = "n";
        do {
            System.out.println("Ingrese dos números: ");
            int n1 = leer.nextInt();
            int n2 = leer.nextInt();
            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("La suma es = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("La resta es = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("El producto es = " + (n1 * n2));
                    break;
                case 4:
                    System.out.println("El cociente es = " + (n1 / n2));
                    break;
                case 5:
                    System.out.println("Está seguro que desea salir? (s/n)");
                    s = leer.next();
                    if (s.equalsIgnoreCase("s")) {
                        System.out.println("Chau");
                    }
                    break;
            }

        } while (!("s".equals(s)));
    }

}
