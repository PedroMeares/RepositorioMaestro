package Servicios;


import Entidad.Estudiante;
import java.util.ArrayList;
import java.util.List;


public class Escuela {
    private Estudiante[] estudiantes;
    
    public Escuela() {
        estudiantes = new Estudiante[8];
        estudiantes[0] = new Estudiante("Juan", 7.5);
        estudiantes[1] = new Estudiante("Ana", 8.2);
        estudiantes[2] = new Estudiante("Luis", 6.9);
        estudiantes[3] = new Estudiante("María", 9.1);
        estudiantes[4] = new Estudiante("Carlos", 7.8);
        estudiantes[5] = new Estudiante("Sofía", 8.5);
        estudiantes[6] = new Estudiante("Pedro", 6.8);
        estudiantes[7] = new Estudiante("Lucía", 8.9);
    }
    
    public double calcularPromedio() {
        double sumaNotas = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.getNota();
        }
        return sumaNotas / estudiantes.length;
    }
    
    public String[] estudiantesConNotaMayorAlPromedio() {
        double promedio = calcularPromedio();
        List<String> estudiantesConNotaMayorAlPromedio = new ArrayList<String>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                estudiantesConNotaMayorAlPromedio.add(estudiante.getNombre());
            }
        }
        String[] estudiantesArray = new String[estudiantesConNotaMayorAlPromedio.size()];
        estudiantesArray = estudiantesConNotaMayorAlPromedio.toArray(estudiantesArray);
        return estudiantesArray;
    }
}

   