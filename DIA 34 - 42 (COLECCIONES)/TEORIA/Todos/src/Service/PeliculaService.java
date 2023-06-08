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
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;

import Comparator.PeliculaComparator;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> pelis = new ArrayList<>();

    public void menu() {
        int opc;
        do {
            System.out.print("--------------------------------------------------------------------------------\n"
                    + "\t\t\t\t   Menu\n--------------------------------------------------------------------------------\n"
                    + "1) Cargar peliculas\t\t2) Ver peliculas\t  3) Ver peliculas > 1hs\n"
                    + "4) Ordenar por duración (Descendente)    5) Ordenar por duración (Ascendente)"
                    + "\n6) Ordenar por titulo alfabéticamente    7) Ordenar por director alfabéticamente\n0) Salir\n"
                    + "Escoja un opción: ");
            opc = read.nextInt();
            switch (opc) {
                case 1:
                    cargarPeliculas();
                    break;
                case 2:
                    showAllMovies(pelis);
                    break;
                case 3:
                    showMovies(pelis);
                    break;
                case 4:
                    ordenDescendeteDuracion();
                    break;
                case 5:
                    ordenAscendeteDuracion();
                    break;
                case 6:
                    ordenAlfabeticoTitulo();
                    break;
                case 7:
                    ordenAlfaDirector();
                    break;
                case 0:
                    System.out.println("\t\t\tEl programa finalizó\n");
                    break;
                default:
                    System.out.println(" Escogió un valor inválido");;
            }
        } while (opc != 0);

    }

    public void cargarPeliculas() {
        do {
            Pelicula peli = new Pelicula();
            System.out.print("\nIngrese el titulo de la pelicula: ");
            peli.setTitulo(read.next());
            System.out.print("Ingrese el director: ");
            peli.setDirector(read.next());
            System.out.print("Duración: ");
            peli.setDuracion(read.nextInt());
            pelis.add(peli);
            System.out.print("¿Desea ingresar otra pelicula? S/N: ");
            /*Otra Alternativa
            System.out.print("\nIngrese el titulo de la pelicula/director/duracion: ");
            peli.add(new Pelicula(read.next(), read.next(), read.nextInt);
            System.out.print("¿Desea ingresar otra pelicula? S/N: ");
            */
        } while (!read.next().equalsIgnoreCase("n"));
    }

    public void showAllMovies(ArrayList<Pelicula> pelis) {
        System.out.println("\n\t\t\tLas peliculas son:\n");
        pelis.forEach((peli) -> {
            System.out.println("\t"+peli);
        });
    }
    
    public void showMovies(ArrayList<Pelicula> pelis){
        System.out.println("\n\t\tLas peliculas con una duración mayor a 1hs son:\n");
        for (Pelicula peli : pelis) {
            if (peli.getDuracion()>1) {
                System.out.println("\t"+peli);
            }
        }
    }
    
    public void ordenAscendeteDuracion(){
        Collections.sort(pelis, PeliculaComparator.duracionAscendente);
        System.out.println(" Ordenamiento Ascendente completado.");
        showAllMovies(pelis);
    }
    
    public void ordenDescendeteDuracion(){
        Collections.sort(pelis, PeliculaComparator.duracionDescendente);
        System.out.println(" Ordenamiento descendente completado.");
        showAllMovies(pelis);
    }
    
    public void ordenAlfabeticoTitulo(){
        Collections.sort(pelis, PeliculaComparator.ordenAlfaTitulo);
        showAllMovies(pelis);
    }
    
    public void ordenAlfaDirector(){
        Collections.sort(pelis, PeliculaComparator.ordenAlfaDirec);
        showAllMovies(pelis);
    }
}
