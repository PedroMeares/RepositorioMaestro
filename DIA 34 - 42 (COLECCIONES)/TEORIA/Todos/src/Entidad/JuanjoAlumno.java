/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;

public class JuanjoAlumno {
    
    private String nombre;
    private ArrayList<Integer> notas;

    public JuanjoAlumno() {
        this.notas = new ArrayList();
    }

    public JuanjoAlumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

    public Iterable<Integer> getNota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    


    
    
    
    
    
}
