
package EntidadObjeto;


public class Lavadora extends Electrodomestico{
    private Integer capacidad;

    public Lavadora() {
    }

    public Lavadora(Double precio, String color, String consumoEnergetico, Double peso,Integer capacidad) {
        super(precio, color, consumoEnergetico, peso);
        this.capacidad=capacidad;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }   

    public void crearLavadora(){
        System.out.println("\t Agregando lavadora.");
        crearElectrodomestico();
        System.out.println("Ingresar Capacidad de Carga.");
        setCapacidad(leer.nextInt());
        precioFinal();
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
       if(getCapacidad()>30){
           setPrecio(getPrecio()+500.0);
           System.out.println("Capacidad mayor a 30kg, se agregan 500$ al precio establecido.");
       } 
    }

    @Override
    public String toString() {
        return "Lavadora{" + "\n precio = " + precio + "$  \n color = " + color + "\n consumoEnergetico = " + consumoEnergetico + "\n peso = " + peso + "kg  \n capacidad = " + capacidad +"kg" + '}';
    }
    
    
}

