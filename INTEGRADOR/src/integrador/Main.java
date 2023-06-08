/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import Servicios.Escuela;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Escuela escuela = new Escuela();
        double promedio = escuela.calcularPromedio();
        System.out.println("El promedio de notas del curso es: " + promedio);

        String[] estudiantesConNotaMayorAlPromedio = escuela.estudiantesConNotaMayorAlPromedio();
        System.out.println("Los estudiantes con nota mayor al promedio son: " + Arrays.toString(estudiantesConNotaMayorAlPromedio));
    }
}
