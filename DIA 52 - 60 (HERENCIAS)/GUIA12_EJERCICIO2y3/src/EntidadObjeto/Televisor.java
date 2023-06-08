package EntidadObjeto;

/**
 * Se debe crear también una subclase llamada Televisor con los siguientes
 * atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de
 * los atributos heredados. Los constructores que se implementarán serán: • Un
 * constructor vacío. • Un constructor con la resolución, sintonizador TDT y el
 * resto de los atributos heredados. Recuerda que debes llamar al constructor de
 * la clase padre.
 */
public class Televisor extends Electrodomestico {

    private Integer resolucion;
    private Boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean TDT, Double precio, String color, String consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {

        System.out.println("\t Agregando televisor.");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion de pantalla.[en pulgadas]");
        setResolucion(leer.nextInt());
        System.out.println("¿Cuenta con sintonizador TDT?[si/no]");
        String rta = leer.next();
        if (!rta.equalsIgnoreCase("si")) {
            setTDT(false);
            setPrecio(getPrecio() + 500);
        } else {
            setTDT(true);
        }
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (getResolucion() > 40) {
            setPrecio(getPrecio() + getPrecio() * 0.30);
        }

    }

    @Override
    public String toString() {
        return "Televisor{" + "\n precio= " + precio + "$  \n color = " + color + "\n consumoEnergetico = " + consumoEnergetico + " \n peso = " + peso + "kg  \n resolucion = " + resolucion + "'  \n sintonizador TDT = " + TDT + '}';
    }

}
