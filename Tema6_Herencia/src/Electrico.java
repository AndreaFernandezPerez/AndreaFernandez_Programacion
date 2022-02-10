public class Electrico extends Coche {

    //variables
    private int bateria;

    //constructores
    public Electrico(){

    }

    public Electrico(String matricula, String bastidor, int cv, int cc, int bateria){
        super(matricula, bastidor ,cv ,cc);
        this.bateria = bateria;
    }

    //métodos

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        int aleatorio = (int) (Math.random()*11)+20;
        this.velocidad += aleatorio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mostrar datos eléctrico");
        super.mostrarDatos();
        System.out.println("Bateria: " + bateria);
    }
    //getter y setter


    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
}//fin de clase
