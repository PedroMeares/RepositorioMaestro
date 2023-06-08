
package Entidades;

import java.util.Random;

/**
 *
 * @author Peter
 */
public class Cine {
    private int filas;
    private int columnas;
    private Pelicula pelicula;
    private int precioEntrada;
    private char[][] sala;

    public Cine(int filas, int columnas, Pelicula pelicula, int precioEntrada) {
        this.filas = filas;
        this.columnas = columnas;
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.sala = new char[filas][columnas];
        inicializarSala();
    }

    private void inicializarSala() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                sala[i][j] = ' ';
            }
        }
    }

    public void mostrarSala() {
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < columnas; j++) {
                System.out.print((i + 1) + " " + (char)('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void ubicarEspectadores(int numEspectadores) {
        Random random = new Random();
        for (int i = 0; i < numEspectadores; i++) {
            Espectador espectador = new Espectador("Espectador " + (i + 1), random.nextInt(41) + 10, random.nextInt(151) + 50);

            int fila = random.nextInt(filas);
            int columna = random.nextInt(columnas);

            while (sala[fila][columna] != ' ') {
                fila = random.nextInt(filas);
                columna = random.nextInt(columnas);
            }

            if (espectador.getEdad() >= pelicula.getEdadMinima() && espectador.getDinero() >= precioEntrada) {
                sala[fila][columna] = 'X';
            }
        }
    }
}
