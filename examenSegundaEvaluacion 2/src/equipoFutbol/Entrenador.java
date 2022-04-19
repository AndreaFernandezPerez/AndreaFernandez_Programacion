package equipoFutbol;

public final class Entrenador extends Persona{
    //variables
    private String vocacion;

    //constructores

    public Entrenador() {

    }

    public Entrenador(String nombre, String apellido, String dni, int edad, String vocacion) {
        super(nombre, apellido, dni, edad);
        this.vocacion = vocacion;
        calcularSueldo();
    }

    //métodos

    @Override
    public void calcularSueldo() {
        this.sueldo *= 1.25;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        this.vocacion = vocacion;
    }
    //getter y setter

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }
}//fin de clase
