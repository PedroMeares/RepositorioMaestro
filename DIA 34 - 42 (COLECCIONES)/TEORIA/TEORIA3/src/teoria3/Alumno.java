/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teoria3;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public double calcularNotaFinal() {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (double) sum / notas.size();
    }
}
