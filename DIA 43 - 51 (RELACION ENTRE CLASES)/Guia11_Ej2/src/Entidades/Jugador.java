/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(RevolverDeAgua r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de RevolverDeAgua. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Entidades;


public class Jugador {
    private static int contadorJugadores = 1;

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        this.id = contadorJugadores++;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public static int getContadorJugadores() {
        return contadorJugadores - 1;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public boolean disparo(RevolverDeAgua revolver) {
        revolver.siguienteChorro();

        if (revolver.mojar()) {
            mojado = true;
            return true;
        } else {
            return false;
        }
    }
}


