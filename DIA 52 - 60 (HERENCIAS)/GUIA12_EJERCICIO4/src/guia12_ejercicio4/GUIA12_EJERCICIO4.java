/*
 
 */
package guia12_ejercicio4;

import Entidades.Circulo;
import Entidades.Rectangulo;
import Sevices.CirculoService;
import Sevices.RectanguloService;


public class GUIA12_EJERCICIO4 {


    public static void main(String[] args) {
        Circulo circ = new Circulo(5);
        Rectangulo rec = new Rectangulo(7, 3);
        
        CirculoService servC = new CirculoService() {};
        RectanguloService servR = new RectanguloService();
        
        System.out.println("Area circulo: " + servC.calcularArea(circ));
        System.out.println("Perimetro circulo: " + servC.calcularPerimetro(circ));
        System.out.println("Area rectangulo: " + servR.calcularArea(rec));
        System.out.println("Perimetro rectangulo: " + servR.calcularPerimetro(rec));
    }
    
}
