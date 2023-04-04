/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación 
y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una 
división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. 
Si no, se hace la división y se devuelve el resultado al main.
 */
package Operacion;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {

    }

    public void CrearOperacion() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero: ");
        this.setNumero1(leer.nextDouble());
        System.out.println("Ingreso otro numero: ");
        this.setNumero2(leer.nextDouble());
    }

    public double sumar() {
        return this.getNumero1() + this.getNumero2();
    }

    public double restar() {
        return this.getNumero1() - this.getNumero2();
    }

    public double multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    public double dividir() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }

    public Operacion(double num1, double num2) {
        this.numero1 = num1;
        this.numero2 = num2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
