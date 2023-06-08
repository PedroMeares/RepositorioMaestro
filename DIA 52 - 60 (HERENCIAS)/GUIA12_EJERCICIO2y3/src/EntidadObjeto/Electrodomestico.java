
package EntidadObjeto;

import java.util.Scanner;

/**
 *
 * @author 54358
 */
public abstract class Electrodomestico {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    protected Double precio;
    protected String color;
    protected String consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, String consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    
    public void comprobarConsumo(String let){
     if(let.equals("A") || let.equals("B") || let.equals("C") || let.equals("D") || let.equals("E")){
         setConsumoEnergetico(let);
     }else{
         setConsumoEnergetico("F");
     }
        
    }
    
    public void comprobarColor(String col){
        if("negro".equals(col) || "azul".equals(col)  || "gris".equals(col)  ){
         //nada
        }else{
             setColor("blanco");
        }
    }
    
    public void crearElectrodomestico(){
        System.out.println("El precio inicial es de 1000.0$:");
        setPrecio(1000.00);
        System.out.println("Ingrese color: [disponibles->negro,azul,gris,blanco]");
        setColor(leer.next().toLowerCase());
        System.out.println("Ingrese referencia de consumo Energetico:[A,B,C,D,E,F]");
        setConsumoEnergetico(leer.next().toUpperCase());
        System.out.println("Ingrese peso del producto:");
        setPeso(leer.nextDouble());
    }
    
    public void precioFinal(){
        comprobarConsumo(getConsumoEnergetico());
        comprobarColor(getColor());
        switch(getConsumoEnergetico()){
            case "A": setPrecio(getPrecio()+1000.0);
               // System.out.println("Consumo clase 'A' " );
            break;
            case "B": setPrecio(getPrecio()+800.0);
                //System.out.println("Consumo clase 'B' "  );
            break;
            case "C": setPrecio(getPrecio()+600.0);
               // System.out.println("Consumo clase 'C' "  );
            break;
            case "D": setPrecio(getPrecio()+500.0);
               // System.out.println("Consumo clase 'D' "  );
            break;
            case "E": setPrecio(getPrecio()+300.0);
               // System.out.println("Consumo clase 'E' "  );
            break;
            case "F": setPrecio(getPrecio()+100.0);
               // System.out.println("Consumo clase 'F' "  );
            break;
        }
          if(getPeso()>0.0 && getPeso()<20.0){
                    setPrecio(getPrecio()+100.0);
                   // System.out.println("Aumento de precio por peso = 100$");
                }if(getPeso()>19.9&&getPeso()<50.0){
                    setPrecio(getPrecio()+500.0);
                   // System.out.println("Aumento de precio por peso = 500$");
                }if(getPeso()>49.9&&getPeso()<80.0){
                    setPrecio(getPrecio()+800.0);
                   // System.out.println("Aumento de precio por peso = 800$");
                }if(getPeso()>79.9){
                    setPrecio(getPrecio()+1000.0);
                   // System.out.println("Aumento de precio por peso = 1000$");
                }
        
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    
    
}
