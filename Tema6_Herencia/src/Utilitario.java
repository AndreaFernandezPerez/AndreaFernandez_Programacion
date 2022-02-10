public class Utilitario extends Coche{

    //variables
    int plazas;

    //constructores
    public Utilitario(){

    }

    public Utilitario(String matricula, String bastidor, int cv, int cc, int plazas){
        super(matricula, bastidor ,cv ,cc);
        this.plazas = plazas;
    }

    //métodos

    // si no modificamos el método de la superclase, no es necesario escribirlo
    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mostrar datos utilitario");
        super.mostrarDatos();
        System.out.println("Plazas: " + plazas);
    }
    //getter y setter


    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
}//fin de clase
