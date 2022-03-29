package inventario;

public final class Mesa extends Mueble{
    //variables
    private int capacidad;

    //constructores

    public Mesa() {
    }

    public Mesa(String material, int peso, int precio, int capacidad) {
        super(material, peso, precio);
        this.capacidad = capacidad;
    }

    //métodos

    @Override
    public void mostrarDatosMueble() {
        super.mostrarDatosMueble();
        System.out.println("Capacidad: " + capacidad);
    }

    //getter y setter

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

}//fin de clase
