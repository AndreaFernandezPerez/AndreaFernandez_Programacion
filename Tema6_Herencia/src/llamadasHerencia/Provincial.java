package llamadasHerencia;

public final class Provincial extends Llamada{
    //variables

    //constructores
    public Provincial(){}

    public Provincial(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    //métodos

    @Override
    public void calcularCosteLlamada() {
        this.coste = this.duracion * 0.15;
    }

    //getter y setter

}//fin de clase
