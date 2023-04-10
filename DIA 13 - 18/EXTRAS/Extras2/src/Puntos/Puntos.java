/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
números y los ingresa en los atributos del objeto. Después, a través de otro 
método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package Puntos;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Puntos {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public void crearPuntos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese coordenadas del primer punto:");
        System.out.println("Latitud:");
        x1 = leer.nextInt();
        System.out.println("Longitud:");
        y1 = leer.nextInt();
        System.out.println("Ingrese coordenadas del segundo punto:");
        System.out.println("Latitud:");
        x2 = leer.nextInt();
        System.out.println("Longitud:");
        y2 = leer.nextInt();
    }

    public void calcularDistancia() {
        double D;
        D = Math.sqrt( Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
        System.out.println("La distancia es = " + D);
    }
}
