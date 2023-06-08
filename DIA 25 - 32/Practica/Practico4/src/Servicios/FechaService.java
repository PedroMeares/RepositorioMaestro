/*
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos 
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario).
 */
package Servicios;

import java.util.Scanner;
import java.util.Date;

public class FechaService {
    
    public static Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu fecha de nacimiento (formato: dd/mm/aaaa): ");
        String fecha = leer.nextLine();
        String[] fechaArr = fecha.split("/");
        int dia = Integer.parseInt(fechaArr[0]);
        int mes = Integer.parseInt(fechaArr[1]) - 1; // en Date, los meses empiezan en 0
        int anio = Integer.parseInt(fechaArr[2]) - 1900; // en Date, los años se cuentan a partir de 1900
        return new Date(anio, mes, dia);
    }
    
    public static Date fechaActual() {
        Date fechaActual = new  Date();
        return new Date();
    }
    
    public static int diferencia(Date fecha1, Date fecha2) {
        long diferenciaMili = fecha2.getTime() - fecha1.getTime();
        long diferenciaAnios = diferenciaMili / (1000 * 60 * 60 * 24 * 365);
        return (int)diferenciaAnios;
    }
}
