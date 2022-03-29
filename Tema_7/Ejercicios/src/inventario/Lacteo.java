package inventario;

public final class Lacteo extends Alimento{
    //variables
    private int volumen;

    //constructores

    public Lacteo() {
    }

    public Lacteo(String calidad, String origen, int precio, int volumen) {
        super(calidad, origen, precio);
        this.volumen = volumen;
    }

    //métodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Volumen: " + volumen);
    }

    //getter y setter

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

}//fin de clase
