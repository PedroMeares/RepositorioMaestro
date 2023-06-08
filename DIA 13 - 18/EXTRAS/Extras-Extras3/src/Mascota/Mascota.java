/*
Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y un método para mostrar por pantalla la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */
package Mascota;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Mascota {

    private String nombre;
    private int edad;
    private String raza;
    private String tipo;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }
    
    public void cargarInformacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Como se llama la mascota");
        nombre = leer.nextLine();
        System.out.println("Que edad tiene la mascota");
        edad = leer.nextInt();
        System.out.println("Que tipo de raza es");
        raza = leer.next();
        System.out.println("Que animal es");
        tipo = leer.next();
    }
    

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + raza);
        System.out.println("Tipo: " + tipo);
    }

    public void cumplirAños() {
        edad++;
    }
}
