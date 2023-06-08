/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJERCICIO3;

import EntidadObjeto.Electrodomestico;
import EntidadObjeto.Lavadora;
import EntidadObjeto.Televisor;
import java.util.ArrayList;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        // Creo 4 electrodomésticos y añado al ArrayList
        electrodomesticos.add(new Lavadora(1500.0, "blanco", "A", 30.0, 10));
        electrodomesticos.add(new Lavadora(1200.0, "negro", "B", 25.0, 8));
        electrodomesticos.add(new Televisor(42, true, 2000.0, "azul", "C", 50.0));
        electrodomesticos.add(new Televisor(55, false, 3000.0, "gris", "D", 60.0));

        double sumaPrecioElectrodomesticos = 0;
        double sumaPrecioLavadoras = 0;
        double sumaPrecioTelevisores = 0;
//        double precioFinal = 0;

        for (Electrodomestico elec : electrodomesticos) {
            elec.precioFinal();
            double precioFinal = elec.getPrecio();
            sumaPrecioElectrodomesticos += precioFinal;
            if (elec instanceof Lavadora) {
                sumaPrecioLavadoras += precioFinal;
            } else if (elec instanceof Televisor) {
                sumaPrecioTelevisores += precioFinal;
            }
            System.out.println("Precio final del electrodoméstico: $" + precioFinal);
        }

        System.out.println("Suma de precios de todos los electrodomésticos: $" + sumaPrecioElectrodomesticos);
        System.out.println("Suma de precios de las lavadoras: $" + sumaPrecioLavadoras);
        System.out.println("Suma de precios de los televisores: $" + sumaPrecioTelevisores);
    }

}
