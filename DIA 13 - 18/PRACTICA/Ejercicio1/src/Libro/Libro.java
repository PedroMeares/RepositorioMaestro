/*
Crear una clase llamada Libro que contenga los siguientes atributos: 
ISBN, Título, Autor, Número de páginas, y un constructor con todos los 
atributos pasados por parámetro y un constructor vacío. Crear un método 
para cargar un libro pidiendo los datos al usuario y luego informar 
mediante otro método el número de ISBN, el título, el autor del libro 
y el número de páginas.
 */
package Libro;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int numPage;

    public Libro(int isbn, String titulo, String autor, int numPage) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPage = numPage;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el número de ISBN: ");
        isbn = leer.nextInt();

        System.out.print("Ingrese el título del libro: ");
        titulo = leer.next();
       
        System.out.print("Ingrese el nombre del autor: ");
        autor = leer.next();

        System.out.print("Ingrese el número de páginas: ");
        numPage = leer.nextInt();
    }

    public void mostrarInformacion() {
        System.out.println("ISBN: " + isbn);
        
        System.out.println("Título: " + titulo);
        
        System.out.println("Autor: " + autor);
        
        System.out.println("Número de páginas: " + numPage);
    }

    public Libro() {
    }

}
