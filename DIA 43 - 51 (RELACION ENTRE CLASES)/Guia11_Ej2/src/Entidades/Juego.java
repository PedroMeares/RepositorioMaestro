/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
RevolverDeAgua
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, RevolverDeAgua r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidades;

import java.util.ArrayList;


public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        int numJugadores = jugadores.size();
        int indiceJugadorActual = 0;
        boolean alguienMojo = false;

        while (!alguienMojo) {
            Jugador jugadorActual = jugadores.get(indiceJugadorActual);
            alguienMojo = jugadorActual.disparo(revolver);

            if (alguienMojo) {
                System.out.println("¡El jugador: " + jugadorActual.getNombre() + " se ha mojado!");
            } else {
                System.out.println("El jugador: " + jugadorActual.getNombre() + " está a salvo.");
                indiceJugadorActual = (indiceJugadorActual + 1) % numJugadores;
            }
        }
    }
}

