/*
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
package Servicio;

import java.util.Arrays;

public class ArregloService {

    public double[] inicializarA(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random() * 10;
        }
        return vector;
    }

    public void mostrar(double[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    public double[] ordenar(double[] vector) {
        double aux[] = new double[vector.length];
        Arrays.sort(vector);
        int posicion = 0;
        for (int i = vector.length - 1; i < 0; i--) {
            aux[posicion] = vector[i];
            System.out.println(aux[posicion]);
            posicion++;
        }
        return aux;
    }
    
    public double[] inicializarB(double[]B, double[]vector){
        double[] aux = new double [B.length];
        for (int i = 0; i < B.length; i++) {
            // Arrays.fill(b, 10, 20, 0.5); con esto podria reemplazar el if
            if (i<=9) {
                aux[i]= vector[i];
            }else{
                aux[i]=0.5;
            }
        }
        return aux;
    }

}
