/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un 
empleado en función de su edad y salario actual. El aumento salarial debe ser 
del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Empleado;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Empleado {

    private String nombre;
    private int edad;
    private int salario;
    private int salarioFinal;
    private int salarioFinal2;
    Scanner leer = new Scanner(System.in);

    public void calcularAumento() {
    }

    public void Aumento() {

        System.out.println("Colocar el nombre del empleado.");
        nombre = leer.nextLine();
        System.out.println("---------------------------------");
        System.out.println("Colocar la edad");
        edad = leer.nextInt();
        System.out.println("---------------------------------");
        System.out.println("Cual es el salario del empleado.");
        salario = leer.nextInt();
        System.out.println("---------------------------------");

        if (edad > 30) {

            salarioFinal = (int) (salario + (salario) * 0.10) ;
            System.out.println("El salario con el aumento del 10% queda en " + salarioFinal + " .");
        } else {
            salarioFinal2 = (int) (salario + (salario) * 0.05);
            
            System.out.println("El salario con el aumento del 5% es de " + salarioFinal2 + " .");
        }
    }
}
