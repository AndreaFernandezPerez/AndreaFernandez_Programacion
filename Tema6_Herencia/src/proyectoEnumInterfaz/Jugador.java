package proyectoEnumInterfaz;

public final class Jugador extends Persona{

    //constructor
    public Jugador(String nombre, String apellido, int sueldo) {
        super(nombre, apellido, sueldo);
    }

    //métodos
    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF);

    }
}//fin de clase
