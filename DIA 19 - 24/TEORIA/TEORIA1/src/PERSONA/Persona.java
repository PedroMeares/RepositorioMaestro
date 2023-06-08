/*
Crea un método void que reciba un objeto tipo persona como parámetro y utilice 
el get para mostrar sus atributos. Llama ese método desde el main.
 */
package PERSONA;

import java.util.Scanner;

public class Persona {

   
    private String nombre;
    Scanner leer = new Scanner(System.in);

    public void crearPersona() {
        System.out.println("Ingrese el nombre de la persona");
     nombre = leer.next();
    
    }

    public String getNombre() {
        return nombre;
    }

    public Scanner getLeer() {
        return leer;
    }
    
}
