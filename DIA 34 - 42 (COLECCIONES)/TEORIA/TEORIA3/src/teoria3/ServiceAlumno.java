/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package teoria3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceAlumno {

    private final List<Alumno> listaAlumnos;

    public ServiceAlumno() {
        listaAlumnos = new ArrayList<>();
    }

    public void crearAlumno() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno:");
        String nombre = leer.nextLine();

        List<Integer> notas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la nota " + i + " del alumno:");
            int nota = leer.nextInt();
            leer.nextLine();  
            notas.add(nota);
        }

        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);
    }

    public void notaFinal() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del alumno para calcular su nota final:");
        String nombreBuscado = leer.nextLine();

        boolean alumnoEncontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                double notaFinal = alumno.calcularNotaFinal();
                System.out.println("La nota final de " + alumno.getNombre() + " es: " + notaFinal);
                alumnoEncontrado = true;
                break;
            }
        }

        if (!alumnoEncontrado) {
            System.out.println("El alumno no se encuentra en la lista.");
        }
    }
   
}
