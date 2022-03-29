package inventario;

public abstract class Alimento implements Inventariable{
    //variables
    protected String calidad, origen;
    protected double precio;

    //constructores

    public Alimento() {
    }

    public Alimento(String calidad, String origen, double precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    //métodos
    public void mostrarDatos(){
        System.out.printf("Calidad: %s\nOrigen: %s\nPrecio: %f", calidad, origen, precio);
    }

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.IVA_ALIMENTOS/100));
        System.out.println("el precio con IVA es de " + precio);
    }

    //getter y setter

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}//fin de clase
