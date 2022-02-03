public class Ingrediente {

    //variables
    private String nombre;
    private double precio;

    //contructores

    public Ingrediente(){

    }

    public Ingrediente(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //métodos

    //métodos get y set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}//fin de clase
