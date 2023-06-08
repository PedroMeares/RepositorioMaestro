/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sevices;

import Entidades.Circulo;
import Interfaces.CalculoCirculo;

/**
 *
 * @author Peter
 */
public class CirculoService implements CalculoCirculo {

    @Override
    public double calcularArea(Circulo circ) {
        return PI * Math.pow(circ.getRadio(), 2);
    }

    @Override
    public double calcularPerimetro(Circulo circ) {
        return PI * circ.getRadio() * 2;
    }
}
