package inventario;

public final class Silla extends Mueble{
    //variables
    private int patas;

    //constructores

    public Silla() {
    }

    public Silla(String material, int peso, int precio, int patas) {
        super(material, peso, precio);
        this.patas = patas;
    }

    //métodos

    @Override
    public void mostrarDatosMueble() {
        super.mostrarDatosMueble();
        System.out.println("Patas: " + patas);
    }

    //getter y setter

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}//fin de clase
