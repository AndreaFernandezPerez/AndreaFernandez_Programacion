package repasoEjercicios.idiomas;

public class Dialecto extends Idioma{
    //variables
    private Idioma dialecto;
    private int numeroHablantes;

    //constructores


    public Dialecto(Idioma dialecto, int numeroHablantes) {
        this.dialecto = dialecto;
        this.numeroHablantes = numeroHablantes;
    }

    public Dialecto(String nombre, int numeroHablantes, Idioma dialecto, int numeroHablantes1) {
        super(nombre, numeroHablantes);
        this.dialecto = dialecto;
        this.numeroHablantes = numeroHablantes1;
    }

    //métodos

    public void calcularNumeroHablantes(int numeroHablantes, Cuantificable c){
        c.cuantificarHablantes(numeroHablantes);
    }
    @Override
    public void saludar() {
        System.out.println("este es el saludo en catalán");
    }

    @Override
    public void despedir() {
        System.out.println("este es la despedida en catalán");
    }


    //getter y setter


    public Idioma getDialecto() {
        return dialecto;
    }

    public void setDialecto(Idioma dialecto) {
        this.dialecto = dialecto;
    }

    @Override
    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    @Override
    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }
}//fin de clase
