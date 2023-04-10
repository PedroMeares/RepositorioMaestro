/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package CIRCUNFERENCIA;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Circunferencia {

    private double radio;
    public double Area;
    public double Perimetro;

    public Circunferencia() {

    }

    public Circunferencia(double Rad) {
        this.radio = Rad;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void CrearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Colocar el radio de la circunferencia");
        this.setRadio(leer.nextDouble());
    }

    public void Area() {
        Area = 3.14 * (this.getRadio()) * this.getRadio();
        System.out.println("El area es: " + Area);
    }

    public void Perimetro() {
        Perimetro = 2 * 3.14 * this.getRadio();
        System.out.println("El perimetro es: " + Perimetro);
    }
}
