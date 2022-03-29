package inventario;

public final class Carne extends Alimento{

    //variables
    private int proteina;

    //constructor

    public Carne() {
    }

    public Carne(String calidad, String origen, int precio, int proteina) {
        super(calidad, origen, precio);
        this.proteina = proteina;
    }

    //método

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        this.proteina = proteina;
    }

    //getter y setter

    public int getProteina() {
        return proteina;
    }

    public void setProteina(int proteina) {
        this.proteina = proteina;
    }

}//fin de clase
