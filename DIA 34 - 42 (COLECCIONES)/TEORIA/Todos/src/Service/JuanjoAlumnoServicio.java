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
package Service;

import entidad.JuanjoAlumno;
import java.util.ArrayList;
import java.util.Scanner;

public class JuanjoAlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public JuanjoAlumno crearAlumno() {
        JuanjoAlumno alumno = new JuanjoAlumno();

        System.out.print("\n  Ingresa el nombre del alumno: ");
        alumno.setNombre(leer.next());

        System.out.println("  Ingresa las 3 notas:");

        for (int i = 0; i < 3; i++) {

            System.out.print("    Nota " + (i + 1) + ": ");
            alumno.getNotas().add(leer.nextInt());
        }
        return alumno;
    }

    public void notaFinal(String nombre, ArrayList<JuanjoAlumno> alumnos) {
        double notaFinal = 0;
        boolean control = false;

        for (JuanjoAlumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                control = true;

                for (Integer nota : alumno.getNotas()) {
                    notaFinal += nota;
                }
                double promedio = notaFinal / alumno.getNotas().size();
                System.out.printf("  La nota promedio final de " + nombre + " es: %.2f", promedio);
            }
        }

        if (!control) {
            System.out.println("  El alumno \"" + nombre + "\" no se encuentra en la lista\n");
        }

    }
}

