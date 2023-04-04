/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, 
Autor, Número de páginas, y un constructor con todos los atributos pasados por 
parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo 
los datos al usuario y luego informar mediante otro método el número de ISBN, 
el título, el autor del libro y el número de páginas.
 */
package ejercicio1;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Ejercicio1_LIBROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Bienvenido a la libreria Programar");
        System.out.println("Ingrese los siguientes datos del libro en orden ISBM, Titulo, Autor y Numero de pagina.");
        System.out.println(" ");
      
                
        Libro libro1 = new Libro();
        
        libro1.cargarLibro();
        
        libro1.mostrarInformacion();

    }

}
