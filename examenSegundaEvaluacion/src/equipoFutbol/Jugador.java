package equipoFutbol;

public final class Jugador extends Persona{
    //variables
    private String posicion;

    //constructores
    private Jugador(){}

    public Jugador(String nombre, String apellido, String dni, int edad, String posicion) {
        super(nombre, apellido, dni, edad);
        this.posicion = posicion;
        calcularSueldo();
    }


    //métodos

    @Override
    public void calcularSueldo() {
        this.sueldo *= 1.5;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Posición: " + posicion);
    }
    //getter y setter


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}//fin de clase
