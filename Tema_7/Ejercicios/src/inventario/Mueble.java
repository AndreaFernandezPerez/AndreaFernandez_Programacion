package inventario;

public abstract class Mueble implements Inventariable{
    //variables
    protected String material;
    protected int peso;
    protected double precio;

    //constructores

    public Mueble() {
    }

    public Mueble(String material, int peso, int precio) {
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

    @Override
    public void calcularPrecio() {
        setPrecio(this.precio+(this.precio*Inventariable.IVA_MUEBLES/100));
        System.out.println("el precio con IVA es de " + getPrecio());
    }

    //getter y setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}//fin de clase
