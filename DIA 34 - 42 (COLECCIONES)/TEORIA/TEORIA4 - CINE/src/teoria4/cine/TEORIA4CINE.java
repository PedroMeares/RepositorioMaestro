/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package teoria4.cine;

import Pelicula.Pelicula;
import java.util.Scanner;
import serviceCine.ServiceCine;

public class TEORIA4CINE {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiceCine cine = new ServiceCine();
        String opcion;

        do {
            System.out.print("Ingrese el título de la película: ");
            String titulo = leer.nextLine();
            System.out.print("Ingrese el director de la película: ");
            String director = leer.nextLine();
            System.out.print("Ingrese la duración de la película (en horas): ");
            double duracion = Double.parseDouble(leer.nextLine());

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            cine.agregarPelicula(pelicula);

            System.out.print("¿Desea ingresar otra película? (s/n): ");
            opcion = leer.nextLine();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("----- Lista de películas -----");
        cine.mostrarPeliculas();

        System.out.println("\n----- Películas con duración mayor a 1 hora -----");
        cine.mostrarPeliculasDuracionMayorAUnaHora();

        System.out.println("\n----- Películas ordenadas por duración (de mayor a menor) -----");
        cine.ordenarPeliculasPorDuracionDescendente();
        cine.mostrarPeliculas();

        System.out.println("\n----- Películas ordenadas por duración (de menor a mayor) -----");
        cine.ordenarPeliculasPorDuracionAscendente();
        cine.mostrarPeliculas();

        System.out.println("\n----- Películas ordenadas por título -----");
        cine.ordenarPeliculasPorTitulo();
        cine.mostrarPeliculas();

        System.out.println("\n----- Películas ordenadas por director -----");
        cine.ordenarPeliculasPorDirector();
        cine.mostrarPeliculas();
    }
}
