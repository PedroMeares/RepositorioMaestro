/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    CuentaBancaria cb = new CuentaBancaria();

    Scanner leer = new Scanner(System.in);

    public void crearCuenta(CuentaBancaria cliente) {
        System.out.println("Ingrese numero de cta.");
        cliente.setNumeroCuenta  (leer.nextInt());
        System.out.println("Ingresar DNI del cliente");
        cliente.setDniCliente  (leer.nextLong());
       
    }

    public void Ingresar(CuentaBancaria cliente) {
        
        System.out.println("Ingrese la cantidad de dinero a acreditar");
        double ingreso = leer.nextDouble();
        cliente.setSaldoActual(cliente.getSaldoActual() + ingreso);
        System.out.println("Su saldo actual es" + cliente.getSaldoActual());
    }
    
    public void Retirar(CuentaBancaria cliente){
        System.out.println("Ingrese la cantidad de dinero a retirar");
        double retiro = leer.nextDouble();
        
        if (retiro>cliente.getSaldoActual()){
            System.out.println("Saldo insuficiente" + "Retirando saldo disponible.");
            retiro = cliente.getSaldoActual();
        }
        cliente.setSaldoActual(cliente.getSaldoActual() - retiro);
        System.out.println("Su nuevo saldo es" + cliente.getSaldoActual());
           }
    
    public void extraccionRapida(CuentaBancaria cliente){
        System.out.println("Ingrese la cantidad de dinero a retirar " + " puede retirar hasta" + cliente.getSaldoActual() * 0.20);
        double retiro = leer.nextDouble();
        if (retiro>(cliente.getSaldoActual()*0.20)){
            System.out.println("El monto supera el limite del 20%");
            }
        cliente.setSaldoActual(cliente.getSaldoActual() - retiro);
        System.out.println("Su nuevo saldo es" + cliente.getSaldoActual());
    }

    public void Consulta(CuentaBancaria cliente) {

        System.out.println("Su nuevo saldo es" + cliente.getSaldoActual());
    }
    
    public void consultaDatos(CuentaBancaria cliente){
        System.out.println(cliente.toString());
    }

}
