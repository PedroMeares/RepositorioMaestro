package GUIA12_EJERCICIO2;

import EntidadObjeto.Electrodomestico;
import EntidadObjeto.Lavadora;
import EntidadObjeto.Televisor;
import java.util.ArrayList;

public class Main {

    /**
     * Finalmente, en el main debemos realizar lo siguiente: Vamos a crear una
     * Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el
     * precio final de los dos electrodomésticos.
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        Lavadora y = new Lavadora();
        Televisor t = new Televisor();
        t.crearTelevisor();
        electrodomesticos.add(t);
        y.crearLavadora();
        electrodomesticos.add(y);
        
        for (Electrodomestico aux : electrodomesticos) {
            System.out.println(aux.toString());
        }
    }
}

    
      
