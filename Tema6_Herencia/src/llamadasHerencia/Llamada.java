package llamadasHerencia;

public abstract class Llamada {
    //variables
    protected int numOrigen, numDestino, duracion;
    protected double coste;

    //constructores
    public Llamada (){

    }
    public Llamada(int numOrigen, int numDestino, int duracion){
        this.numOrigen = numOrigen;
        this.numDestino = numDestino;
        this.duracion = duracion;
        calcularCosteLlamada();
    }

    //métodos
    public abstract void calcularCosteLlamada();

    public void mostrarDatos(){
        System.out.println("Número origen: " + numOrigen);
        System.out.println("Número destino: " + numDestino);
        System.out.println("Número duracion: " + duracion);
        System.out.println("Número coste: " + coste);
    }

    //getter y setter


    public int getNumOrigen() {
        return numOrigen;
    }

    public void setNumOrigen(int numOrigen) {
        this.numOrigen = numOrigen;
    }

    public int getNumDestino() {
        return numDestino;
    }

    public void setNumDestino(int numDestino) {
        this.numDestino = numDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
}//fin de clase
