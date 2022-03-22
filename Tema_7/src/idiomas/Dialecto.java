package idiomas;

public final class Dialecto extends Idiomas implements Cuantificable{

    //variables
    private Idiomas idioma;
    private  int numeroHablantes;

    //constructores


    public Dialecto(Idiomas idioma, int numeroHablantes) {
        this.idioma = idioma;
        this.numeroHablantes = numeroHablantes;
    }

    public Dialecto(String nombre, int numeroHablantes, Idiomas idioma, int numeroHablantes1) {
        super(nombre, numeroHablantes);
        this.idioma = idioma;
        this.numeroHablantes = numeroHablantes1;
    }

    //métodos
    @Override
    public void saludar() {
        System.out.println("Este es el saludo en catalán");
    }

    @Override
    public void despedir() {
        System.out.println("Esta es la despedida en catalán");
    }

    @Override
    public void cuantificarHablantes(int n) {

    }

    public void calcularNumeroHablantes(int numeroHablantes, Cuantificable c){
        c.cuantificarHablantes(numeroHablantes);
    }

    //getter y setter

    public Idiomas getIdioma() {
        return idioma;
    }

    public void setIdioma(Idiomas idioma) {
        this.idioma = idioma;
    }

    @Override
    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    @Override
    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }
}
