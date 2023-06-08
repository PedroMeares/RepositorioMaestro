/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ENTIDADES;

/**
 *
 * @author Peter
 */
public class Caballo extends Animal {

    public Caballo(String nombre, String alimento, Integer edad, String razaAnimal) {
        super(nombre, alimento, edad, razaAnimal);
    }

    @Override
    public void alimentarse() {

        System.out.println("El caballo " + nombre + " se alimenta de " + alimento);

    }
}
