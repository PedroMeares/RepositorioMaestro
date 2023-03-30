/*
Los profesores del curso de programación de Egg necesitan llevar un registro de 
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados 
y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos 
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad 
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con 
promedio mayor o igual al 7 de sus notas del curso.
 */
package extras;

import java.util.Scanner;

/**
 *
 * @author CDR
 */
public class Extras4BIS {
    public static void main(String[] args) {
        int[][] varPrac = new int[10][4];
        double[] promedios = new double[10];
        ingresarnotas(varPrac);
        calcularpromedios(promedios,varPrac);
        int contA=0;
        int contD=0;
        for (int i = 0; i < 10; i++) {
            if(promedios[i]>= 7){
                contA++;
            }else contD++;
        }
        System.out.println("Aprobados: "+ contA +".");
        System.out.println("Desaprobados: " + contD +".");
    }
    public static int[][] ingresarnotas(int[][]practicos){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas del alumno # " + (i+1) + ".");
            for (int j = 0; j < 4; j++) {
                System.out.print("Nota # " + (j+1) + ":");
                practicos[i][j] = leer.nextInt();
            }
        }
        return practicos;
    }
    public static double[] calcularpromedios(double[] prom,int[][]notas){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                prom[i] = 0.1*notas[i][0] + 0.15*notas[i][1] 
                        + 0.25*notas[i][2] + 0.5*notas[i][3];
            }
        }
        return prom;
    }
    }
