package bibliotecaInterfaz;

public final class CD extends Elemento implements Prestar{
    //variables
    private int anio;
    private EstiloMusical estilo;

    //constructores
    public CD(){}

    public CD(int id, String seccion, String titulo, int anio, EstiloMusical estilo) {
        super(id, seccion, titulo);
        this.anio = anio;
        this.estilo = estilo;
    }

    //métodos

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("Año: "+ anio);
        System.out.println("Estilo musical: " + estilo);
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
    //getter y setter


    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public EstiloMusical getEstilo() {
        return estilo;
    }

    public void setEstilo(EstiloMusical estilo) {
        this.estilo = estilo;
    }
}//fin de clase
