package proyectoEnumInterfaz;

public final class Entrenador extends Persona{

    //variables
    private String vocacion;

    //constructores
    public Entrenador(String nombre, String apellido, int sueldo, String vocacion) {
        super(nombre, apellido, sueldo);
        this.vocacion = vocacion;
    }

    //métodos
    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Constantes.IRPF) + this.sueldo * 0.10;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(vocacion);
    }

    //getter y setter

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }
}
