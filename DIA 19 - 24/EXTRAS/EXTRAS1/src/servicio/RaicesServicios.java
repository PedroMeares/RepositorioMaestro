/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra 
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package servicio;

import CLASE.Raices;
import java.util.Scanner;

public class RaicesServicios {

    Raices Rs = new Raices();
    Scanner leer = new Scanner(System.in);

    public double getDiscriminante(Raices n) {

        double Rs = (Math.pow(n.getB(), 2) - (4 * n.getA() * n.getC()));
        System.out.println(Rs);
        return 1;
    }
    
    public boolean tieneRaices(Raices n){
        return getDiscriminante(n) >= 0;
    }
    public boolean tieneRaiz (Raices n){
        return getDiscriminante (n)==0;
    }

}
