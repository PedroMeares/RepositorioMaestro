/*
Crea una clase "Mascota" con las propiedades "nombre", "edad", "raza" y "tipo" (perro, gato, etc.).
Crea un constructor para inicializar los valores de las propiedades y un método para mostrar por pantalla la información de la mascota.
Crea un método "cumplirAnios" que aumente en uno la edad de la mascota.
 */
package extras.extras3;

import Mascota.Mascota;


public class ExtrasExtras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota pet = new Mascota();
        pet.cargarInformacion();
        pet.mostrarInformacion();
        pet.cumplirAños();
    }
    
}
