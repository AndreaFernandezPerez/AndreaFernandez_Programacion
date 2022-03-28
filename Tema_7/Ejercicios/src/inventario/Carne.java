package inventario;

public class Carne extends Alimento{
    //variables
    private int proteinas;

    //constructores

    public Carne(String calidad, String origen, int precio, int proteinas) {
        super(calidad, origen, precio);
        this.proteinas = proteinas;
    }

    //métodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Proteinas: " + proteinas);
    }

    //getter y setter

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

}//fin de clase
