/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Entidad.Persona;

/**
 *
 * @author Peter
 */
public class POOej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona PrimerPersona = new Persona();

        PrimerPersona.nombre = "Pedro";
        PrimerPersona.genero = "Maculino";
        PrimerPersona.edad = 39;
        PrimerPersona.dni = "30525735";

        System.out.println(PrimerPersona.nombre + " " + ", de sexo " + PrimerPersona.genero + ".");

    }

}
