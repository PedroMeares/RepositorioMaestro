/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package practicos;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Practico8 {

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero para formar un cuadrado de asteriscos");
        num = SC.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int z = 1; z <= num; z++) {
                if (z == 1 || z == num || i == 1 || i == num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
