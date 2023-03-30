/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */
package extras;


public class Extras2 {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {1, 2, 3, 4, 5};
        boolean sonIguales = true;
        
        if (vector1.length != vector2.length) {
            sonIguales = false;
        } else {
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] != vector2[i]) {
                    sonIguales = false;
                    break;
                }
            }
        }
        
        if (sonIguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }
    }
}
