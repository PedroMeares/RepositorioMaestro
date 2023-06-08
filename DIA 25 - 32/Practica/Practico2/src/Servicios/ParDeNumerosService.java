/*
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Servicios;

import Entidades.ParDeNumeros;

public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros objeto) {
        System.out.println("El primer numero es: " + objeto.getNum1());
        System.out.println("El segundo numero es: " + objeto.getNum2());
    }

    public double devolverMayor(ParDeNumeros objeto) {
        double a = Math.max(objeto.getNum1(), objeto.getNum2());
        return a;
    }
    
    public void calcularLaPotencia(ParDeNumeros objeto){
        double a = Math.pow(Math.max(objeto.getNum1(),objeto.getNum2()),Math.min(objeto.getNum1(), objeto.getNum2()));
        System.out.println("La potencia es " + Math.round(a));
            }
    
    public void calcularRaiz(ParDeNumeros objeto) {
        double a = Math.abs(Math.min(objeto.getNum1(), objeto.getNum2()));
        System.out.println("el valor absoluto es: " + Math.sqrt(a));
    }
}

