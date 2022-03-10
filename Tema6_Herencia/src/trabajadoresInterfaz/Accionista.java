package trabajadoresInterfaz;

public final class Accionista extends Persona implements Comision{
    //variables
    private int porcentajeAcciones;

    //constructores
    public void Accionista(){

    }

    public Accionista(String nombre, String apellido, String dni, int porcentajeAcciones) {
        super(nombre, apellido, dni);
        this.porcentajeAcciones = porcentajeAcciones;
    }

    //métodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Porcentaje acciones: " + porcentajeAcciones);
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11);
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficio) {
        System.out.println("El beneficio obtenido es: " + beneficio*0.30);
    }
    //getter y setter

    public int getPorcentajeAcciones() {
        return porcentajeAcciones;
    }

    public void setPorcentajeAcciones(int porcentajeAcciones) {
        this.porcentajeAcciones = porcentajeAcciones;
    }
}//fin de clase
