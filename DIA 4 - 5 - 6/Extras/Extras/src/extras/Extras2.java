/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente 
a cada una. A continuación, realizar las instrucciones necesarias para que: B tome 
el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar 
sólo una variable auxiliar.
 */
package extras;

/**
 *
 * @author CDR
 */
public class Extras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 12, b = 3, c = 67, d = 40, aux;
        System.out.println("Valores iniciales:\t A:" + a + "    B:" + b + "      C:" + c + "    D:" + d);
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Valores finales:\t A:" + a + "    B:" + b + "    C:" + c + "    D:" + d);
    }

}
