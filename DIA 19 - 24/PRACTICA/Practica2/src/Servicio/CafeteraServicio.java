/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los 
atributos capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) 
y cantidadActual (la cantidad actual de café que hay en la cafetera). Agregar constructor 
vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio 
en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño 
de la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad 
actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le 
informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public void LlenarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(cafe.getCapacidadMaxima()); //aca estoy igualando cantidad actual con cantidadmaxima
    }

    public void servirTaza(Cafetera cafe) {
        System.out.println("Ingrese la cantidad de cafe");
        int caf = leer.nextInt();

        if (cafe.getCantidadActual() >= caf) {
            cafe.setCantidadActual(cafe.getCantidadActual() - caf);
            System.out.println("Se lleno la taza.");

        } else {
            System.out.println("No se lleno la taza. Se sirvieron " + (cafe.getCantidadActual() -caf) + " en la taza.");
            cafe.setCantidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
    }

    public void agregarCafe(Cafetera cafe, int cant) {
        if ((cant + cafe.getCantidadActual()) < cafe.getCapacidadMaxima()) {
            System.out.println("Se lleno la cafetera");
            cafe.setCantidadActual(cafe.getCantidadActual() + cant);
            // cafe.setCantidadActual(cafe.getCapacidadMaxima());
        } else {
            System.out.println("No se puede agregar mas cafe porque supera la capacidad maxima de la cafetera");
        }

    }
}
