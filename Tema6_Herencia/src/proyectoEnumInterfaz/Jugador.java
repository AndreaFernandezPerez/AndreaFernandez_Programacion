package proyectoEnumInterfaz;

public final class Jugador extends Persona implements Seleccionable{

    private String posicion;
    //constructor
    public Jugador(String nombre, String apellido, int sueldo, String posicion) {
        super(nombre, apellido, sueldo);
        this.posicion = posicion;
    }

    //métodos
    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF);

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posicion);
    }

    @Override
    public void atacar() {
        System.out.println("Jugador está atacando, su nivel es muy alto");
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }

    //getter y setter


    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}//fin de clase
