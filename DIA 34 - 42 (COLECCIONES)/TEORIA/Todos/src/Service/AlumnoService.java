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
package Service;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public void crearAlumno() {
        String opc = "S", res;
        do {
            Alumno al = new Alumno();
            System.out.print("Ingrese nombre del alumno: ");
            al.setNombre(read.next());
            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese nota " + (i + 1) + ": ");
                al.getNotas().add(read.nextInt());
            }
            alumnos.add(al);
            System.out.print("¿Desea ingresar otro alumno? S/N: ");
            res = read.next();
            System.out.println();
        } while (res.equalsIgnoreCase(opc));
        mostrar(alumnos);
        notaFinal(alumnos);
    }

    public void notaFinal(ArrayList<Alumno> alumnos) {
        Iterator<Alumno> it = alumnos.iterator();
        String name;
        int acum = 0, prom;
        System.out.print("\nIngrese nombre del alumno para calcular el promedio: ");
        name = read.next();
        //FUNCIONA - NO ES NECESARIO EL ITERATOR
        for (Alumno est : alumnos) {
            if (est.getNombre().equalsIgnoreCase(name)) {
                for (Integer nota : est.getNotas()) {
                    acum+=nota;
                }
//                //  Otra forma de hacerlo
//                for (Iterator<Integer> it = est.getNotas().iterator(); it.hasNext();) {
//                    Integer nota = it.next();
//                    acum+=nota;
//                }
            }
        }
        //NO FUNCIONA - No me toma el ultimo alumno ingresado
//        do {
//            if (it.next().getNombre().equalsIgnoreCase(name)) {
//                for (Integer nota : it.next().getNotas()) {
//                    acum+=nota;
//                }
//            }
//        } while (it.hasNext());
        
//        while (it.hasNext()) {
////            Iterator<Integer> itEs= it.next().getNotas().iterator();
//            if (it.next().getNombre().equalsIgnoreCase(name)) {
//                for (Integer nota : it.next().getNotas()) {
//                    acum+=nota;
//                }
//            }
//        }
        //Asi seria con Iterator - SIGUE SIN FUNCIONAR DENTRO DE UN WH ITERATOR
//        for (Integer nota : it.next().getNotas()) {
//            acum += nota;
//        }

        prom = acum / 3;
        System.out.println("El promedio de " + name + " es: " + prom + "\n");
//      contains
    }

    public void mostrar(ArrayList<Alumno> alumnos) {
        alumnos.forEach((alumno) -> {
            System.out.println(alumno);
        });
    }
}
