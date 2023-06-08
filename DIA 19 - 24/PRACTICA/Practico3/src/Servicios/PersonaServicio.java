/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: 
nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir
algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M u O. Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de 
su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la 
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

    public class PersonaServicio {

        public boolean esMayorDeEdad(Persona p) {
            return p.getEdad() >= 18;
        }

        public Persona crearPersona() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese el sexo (H/M/O): ");
            char sexo = scanner.next().charAt(0);
            while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
                System.out.print("Sexo incorrecto. Ingrese el sexo (H/M/O): ");
                sexo = scanner.next().charAt(0);
            }

            System.out.print("Ingrese el peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingrese la altura en m: ");
            double altura = scanner.nextDouble();

            return new Persona(nombre, edad, sexo, peso, altura);
        }

        public int calcularIMC(Persona p) {
            double imc = p.getPeso() / Math.pow(p.getAltura(), 2);
            if (imc < 20) {
                return -1; // por debajo de su peso ideal
            } else if (imc >= 20 && imc <= 25) {
                return 0; // en su peso ideal
            } else {
                return 1; // tiene sobrepeso
            }
        }

    
    }
