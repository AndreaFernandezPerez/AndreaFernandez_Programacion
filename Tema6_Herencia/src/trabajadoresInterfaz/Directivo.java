package trabajadoresInterfaz;

public final class Directivo extends Persona implements Comision{
    //variables
    private int capital;

    //constructores
    public void Directivo(){}

    public Directivo(String nombre, String apellido, String dni, int capital) {
        super(nombre, apellido, dni);
        this.capital = capital;
    }

    //métodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Capital: " + capital);
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11)/2;
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficio) {
        System.out.println("El beneficio obtenido es: " + beneficio*0.20);
    }
    //getter y setter

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }
}//final de clase
