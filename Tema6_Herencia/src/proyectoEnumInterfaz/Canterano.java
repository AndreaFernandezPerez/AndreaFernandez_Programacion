package proyectoEnumInterfaz;

public class Canterano extends Persona implements Seleccionable{
    //variables
    private int posibilidades;

    //constructores

    public Canterano(String nombre, String apellido, int sueldo, int posibilidades) {
        super(nombre, apellido, sueldo);
        this.posibilidades = posibilidades;
    }


    //metodo


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(posibilidades);
    }

    @Override
    public void calcularSueldo() {
        this.sueldo = 100;
    }

    @Override
    public void atacar() {
        System.out.println("El canterano ataca poco");
    }

    @Override
    public void defender() {

    }

    @Override
    public void actitudCampo() {

    }

    //getter y setter

    public int getPosibilidades() {
        return posibilidades;
    }

    public void setPosibilidades(int posibilidades) {
        this.posibilidades = posibilidades;
    }
}
