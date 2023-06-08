/*
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos 
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene 
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en 
distintas variables(arrays), para después calcular un porcentaje de esas 4 personas 
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y 
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. 
Para esto, podemos crear unos métodos adicionales.

 */
package practico3;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Practico3 {

    public static void main(String[] args) {
        PersonaServicio personaServicio = new PersonaServicio();
        
        // Creamos 4 objetos de tipo Persona
        Persona persona1 = personaServicio.crearPersona();
        Persona persona2 = personaServicio.crearPersona();
        Persona persona3 = personaServicio.crearPersona();
        Persona persona4 = personaServicio.crearPersona();
        
        // Llamamos a los métodos para cada objeto Persona
        personaServicio.calcularIMC(persona1);
        personaServicio.calcularIMC(persona2);
        personaServicio.calcularIMC(persona3);
        personaServicio.calcularIMC(persona4);
        
        // Guardamos los resultados de los métodos en arrays
        int[] resultadosIMC = {
            personaServicio.calcularIMC(persona1),
            personaServicio.calcularIMC(persona2),
            personaServicio.calcularIMC(persona3),
            personaServicio.calcularIMC(persona4)
        };
        
        boolean[] resultadosEdad = {
            personaServicio.esMayorDeEdad(persona1),
            personaServicio.esMayorDeEdad(persona2),
            personaServicio.esMayorDeEdad(persona3),
            personaServicio.esMayorDeEdad(persona4)
        };
        
        // Calculamos el porcentaje de personas en cada categoría
        int totalPersonas = 4;
        int personasBajoPeso = 0;
        int personasPesoIdeal = 0;
        int personasSobrepeso = 0;
        int personasMayores = 0;
        int personasMenores = 0;
        
        for (int i = 0; i < totalPersonas; i++) {
            switch (resultadosIMC[i]) {
                case -1:
                    personasBajoPeso++;
                    break;
                case 0:
                    personasPesoIdeal++;
                    break;
                case 1:
                    personasSobrepeso++;
                    break;
            }
            
            if (resultadosEdad[i]) {
                personasMayores++;
            } else {
                personasMenores++;
            }
        }
        
        double porcentajeBajoPeso = (double) personasBajoPeso / totalPersonas * 100;
        double porcentajePesoIdeal = (double) personasPesoIdeal / totalPersonas * 100;
        double porcentajeSobrepeso = (double) personasSobrepeso / totalPersonas * 100;
        double porcentajeMayores = (double) personasMayores / totalPersonas * 100;
        double porcentajeMenores = (double) personasMenores / totalPersonas * 100;
        
        // Mostramos los resultados
        System.out.println("Porcentaje de personas con bajo peso: " + porcentajeBajoPeso + "%");
        System.out.println("Porcentaje de personas con peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayores + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenores + "%");
    }
 
}
