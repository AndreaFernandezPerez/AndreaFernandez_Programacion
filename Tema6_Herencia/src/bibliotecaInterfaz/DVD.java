package bibliotecaInterfaz;

public final class DVD extends Elemento{
    //variables
    private int anio;
    private GeneroPeliculas genero;
    private String director;
    private String[] actores;


    //constructores
    public DVD(){}

    public DVD(int id, String titulo, Seccion seccion, int anio, GeneroPeliculas genero, String director, String[] actores) {
        super(id, titulo, seccion);
        this.anio = anio;
        this.genero = genero;
        this.director = director;
        this.actores = actores;
    }

    //métodos

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Año: " + anio);
        System.out.println("Género: " + genero);
        System.out.println("Director: "+ director);
    }

    //getter y setter

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public GeneroPeliculas getGenero() {
        return genero;
    }

    public void setGenero(GeneroPeliculas genero) {
        this.genero = genero;
    }
}//fin de clase
