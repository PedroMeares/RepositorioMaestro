/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
 */
package guia11_ej2;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.RevolverDeAgua;
import java.util.ArrayList;


public class Guia11_Ej2 {

    
    public static void main(String[] args) {
      // Obtengo numero de usuarios (entre 1 y 6)
        int numJugadores = 6; // Valor por defecto
        // Aquí puedes incluir el código para obtener el número de jugadores del usuario
        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; // Valor por defecto
        }

        // Creo jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for (int i = 0; i < numJugadores; i++) {
            jugadores.add(new Jugador());
        }

        // Creo revolver de agua y llenarlo
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolver.llenarRevolver();

        // Creo juego y lleno con jugadores y revolver
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, revolver);

        // Realizar rondas hasta que alguien se moje
        juego.ronda();
    }
}