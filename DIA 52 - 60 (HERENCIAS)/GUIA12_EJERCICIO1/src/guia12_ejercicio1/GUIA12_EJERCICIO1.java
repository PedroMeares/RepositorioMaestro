/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
 */
package guia12_ejercicio1;

import ENTIDADES.Animal;
import ENTIDADES.Caballo;
import ENTIDADES.Gato;
import ENTIDADES.Perro;


public class GUIA12_EJERCICIO1 {


    public static void main(String[] args) {
        
        Animal perro1= new Perro("stich","Carnivoro",15,"doberman");
        perro1.alimentarse();
         Animal perro2= new Perro("teddy","Croquetas",10,"chihuahua");
        perro2.alimentarse();
         Animal gato1= new Gato("pelusa","galletas",15,"siames");
        gato1.alimentarse();
         Animal caballo1= new Caballo("spark","pasto",25,"fino");
        caballo1.alimentarse();
    }
    
}
