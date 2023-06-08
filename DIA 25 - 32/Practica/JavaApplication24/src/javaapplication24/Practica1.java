/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos 
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente. 
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de 
la frase de manera automática
 */
package javaapplication24;

import Entidades.Cadena;
import Servicios.CadenaServicios;

/**
 *
 * @author Peter
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CadenaServicios Cs = new CadenaServicios();
      Cadena cadena1 = new Cadena();
      
      Cs.mostrarVocales(cadena1);
//      Cs.invertirFrase(cadena1);
//      Cs.vecesRepetido(cadena1);
//      Cs.compararLongitud(cadena1);
//      Cs.unirFrase(cadena1);
      Cs.reemplazar(cadena1);
    }
  
}
