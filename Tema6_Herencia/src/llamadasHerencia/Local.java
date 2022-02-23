package llamadasHerencia;

public final class Local extends Llamada{

    //variables

    //constructores
    public Local(){}

    public Local(int numOrigen, int numDestino, int duracion) {
        super(numOrigen, numDestino, duracion);
    }

    //métodos

    @Override
    public void calcularCosteLlamada() {
        this.coste = 0;
    }


    //getter y setter



}//fin de clase
