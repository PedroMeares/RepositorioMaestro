/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". 
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de 
dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
después de realizar una transacción de retiro.
 */
package Cuenta;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private String titular;
    private int Fondos = 5000;
    private int retiro;
    private int saldoFinal;

    public void Cuenta() {

    }

    public void ingresarNombre() {
        System.out.println("Ingrese nombre del titular de la cuenta");
        titular = leer.nextLine();
        System.out.println("Usted tiene $5000 disponibles");
    }

    public void retirarDinero() {
        System.out.println("Cuento quiere retirar");
        retiro = leer.nextInt();
        System.out.println("Se va a retirar " + retiro + " pesos.");
        if (retiro > Fondos) {
            System.out.println("Usted no tiene suficiente saldo");
        } else {
            saldoFinal = Fondos - retiro;
            System.out.println("Su saldo es de " + saldoFinal + " pesos.");

        }
    }
}
