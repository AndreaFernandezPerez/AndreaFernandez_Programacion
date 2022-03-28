package inventario;

public abstract class Alimento implements Inventariable{
    //variables
    private String calidad, origen;
    private double precio;

    //constructores

    public Alimento(String calidad, String origen, int precio) {
        this.calidad = calidad;
        this.origen = origen;
        this.precio = precio;
    }

    //métodos
    public void mostrarDatos(){
        System.out.printf("Calidad: %s\nOrigen: %s\nPrecio: %d", calidad, origen, precio);
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

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}//fin de clase
