package inventario;

public abstract class Mueble implements Inventariable{
    //variables
    private String material, peso;
    private double precio;

    //constructores

    public Mueble(String material, String peso, int precio) {
        this.material = material;
        this.peso = peso;
        this.precio = precio;
    }

    //métodos
    public void mostrarDatosMueble(){
        System.out.println("Material: " + material);
        System.out.println("Peso: " + peso);
        System.out.println("Precio: " + precio);
    }

    //getter y setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}//fin de clase
