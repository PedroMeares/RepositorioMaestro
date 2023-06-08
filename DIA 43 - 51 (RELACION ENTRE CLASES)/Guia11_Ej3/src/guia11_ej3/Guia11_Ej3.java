/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia11_ej3;

import Entidades.Baraja;
import Entidades.Carta;
import java.util.List;


public class Guia11_Ej3 {


    public static void main(String[] args) {
         Baraja baraja = new Baraja();
        baraja.barajar();
        
        System.out.println("Mostrando las cartas de la baraja:");
        baraja.mostrarBaraja();
        
        System.out.println("\nSiguiente carta: " + baraja.siguienteCarta());
        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
        
        System.out.println("\nDando 5 cartas:");
        List<Carta> mano = baraja.darCartas(5);
        if (mano != null) {
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }
        
        System.out.println("\nCartas en el montón:");
        List<Carta> monton = baraja.cartasMonton();
        if (monton.isEmpty()) {
            System.out.println("No hay cartas en el montón.");
        } else {
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }
}