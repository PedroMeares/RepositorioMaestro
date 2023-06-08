/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia11_ej1;

import Entidades.Perro;
import Entidades.Persona;

public class Guia11_ej1 {

    public static void main(String[] args) {
        //crear perros
        Perro perro1 = new Perro("Cuncun", "Pekines", 5, "pequeño");
        Perro perro2 = new Perro("Oliver", "Shit Tzu", 2, "pequeño");
        // crear personas
        Persona persona1 = new Persona("Pedro", "Meares", 39, "30525735");
        Persona persona2 = new Persona("Maria", "Berecibar", 40, "29968167");

        // Asignar perros a las personas
        persona1.adoptarPerro(perro1);
        persona2.adoptarPerro(perro2);

        // Mostrar información de las personas y sus perros
        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Apellido: " + persona1.getApellido());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Documento: " + persona1.getDocumento());
        System.out.println("----Perro adoptado----");
        System.out.println("Nombre: " + persona1.getPerro().getNombre());
        System.out.println("Raza: " + persona1.getPerro().getRaza());
        System.out.println("Edad: " + persona1.getPerro().getEdad());
        System.out.println("Tamaño: " + persona1.getPerro().getTamano());

        System.out.println("----------------------------------------------------");

        // Mostrar información de las personas y sus perros
        System.out.println("Persona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Documento: " + persona2.getDocumento());
        System.out.println("----Perro adoptado-----");
        System.out.println("Nombre: " + persona2.getPerro().getNombre());
        System.out.println("Raza: " + persona2.getPerro().getRaza());
        System.out.println("Edad: " + persona2.getPerro().getEdad());
        System.out.println("Tamaño: " + persona2.getPerro().getTamano());

        System.out.println("----------------------------------------------------");
    }

}
