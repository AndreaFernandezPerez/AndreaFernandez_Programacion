public class Suv extends Coche{

    //variables
    private boolean traccion;

    //constructores
    public Suv(){

    }

    public Suv(String matricula, String bastidor, int cv, int cc, boolean traccion){
        super(matricula, bastidor ,cv ,cc);
        this.traccion = traccion;
    }

    //métodos

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);
        int aleatorio = (int)(Math.random()*11)+10;
        this.velocidad += aleatorio; //this.velocidad es la velocidad/atributo de esta clase, aunque no aparezca xq hereda
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mostrar datos suv");
        super.mostrarDatos();
        System.out.println("Tracción "+ traccion);
    }
    //getter y setter

}// fin de clase
