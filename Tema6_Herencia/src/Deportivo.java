public class Deportivo extends Coche{

    //al poner extends + Coche (nombre de la clase padre) tiene todas las cosas
    //simplemente no lo vemos

    //variables
    private int par;

    //constructores
    //si no se escriben los constructores, no se pueden crear objetos nuevos
    public Deportivo(){

    }
    public Deportivo(String matricula, String bastidor, int cv, int cc, int par){
        super(matricula, bastidor, cv, cc); //esto hace lo mismo que this.matricula = matricula;...
        this.par = par;
    }

    //métodos

    //si queremos utilizar un método de la superclase lo único que tenemos que hacer es llamarle, en este caso calcularVelocidad

    @Override
    public void calcularVelocidad(int velocidad) {
        super.calcularVelocidad(velocidad);//esto para que haga lo mismo que el método de la superclase
        System.out.println("Velocidad calculada"); // y añadimos esto //para el aleatorio primero ponemos el número de rangos, y despues del + el número minimo que queremos
        int aletario = (int)(Math.random()* 11) + 30;
        setVelocidad(getVelocidad()+aletario);
        // esto es lo mismo que la línea de arriba velocidad += aletario;

    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mostrar datos deportivo");
        super.mostrarDatos();
        System.out.println("Par: " + par);
    }
    //getter y setter


    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}//fin de clase
