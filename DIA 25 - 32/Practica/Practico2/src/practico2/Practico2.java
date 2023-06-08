/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales 
con los cuales se realizarán diferentes operaciones matemáticas. 
La clase debe tener un constructor vacío, getters y setters.  
En el constructor vacío se usará el Math.random para generar los dos números. 
 */
package practico2;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosService;

public class Practico2 {

    public static void main(String[] args) {
        ParDeNumeros pdn = new ParDeNumeros();
        ParDeNumerosService PPP = new ParDeNumerosService();

        PPP.mostrarValores(pdn);

        System.out.println(PPP.devolverMayor(pdn));

        PPP.calcularLaPotencia(pdn);

        PPP.calcularRaiz(pdn);

    }
    }
