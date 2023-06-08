/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Entidades.Circulo;

/**
 *
 * @author Peter
 */
public interface CalculoCirculo {
    
    public double PI = Math.PI;
    
    public abstract double calcularArea(Circulo circ);
    public abstract double calcularPerimetro(Circulo circ);
}
