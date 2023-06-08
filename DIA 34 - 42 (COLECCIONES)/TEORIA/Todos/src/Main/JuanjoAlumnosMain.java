/*

En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package main;

import entidad.JuanjoAlumno;
import java.util.ArrayList;
import java.util.Scanner;
import Service.JuanjoAlumnoServicio;

public class JuanjoAlumnosMain {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        JuanjoAlumnoServicio as = new JuanjoAlumnoServicio();

        ArrayList<JuanjoAlumno> alumnos = new ArrayList();
        
        // creamos alumnos
        boolean control = true;
        do {
            alumnos.add(as.crearAlumno());

            System.out.print("  Otro alumno S/N?: ");
            control = leer.next().equalsIgnoreCase("s");

        } while (control);

        // Promedio de un alumno
        System.out.print("\n  Ingresa el nombre del alumno para averiguar su promedio: ");
        String nombreAlumno = leer.next();

        as.notaFinal(nombreAlumno, alumnos);
    }

}
