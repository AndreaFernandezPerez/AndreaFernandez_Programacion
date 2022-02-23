package llamadasHerencia;

import java.util.Scanner;

public final class Nacional extends Llamada{

    //variables
    private int franja;

    //constructores

    public Nacional() {
    }

    public Nacional(int numOrigen, int numDestino, int duracion, int franja) {
        super(numOrigen, numDestino, duracion);
        this.franja = franja;
        calcularCosteLlamada(); //hay que volver a llamarlo xq al principio el valor coste = 0;
    }
    //métodos

    @Override
    public void calcularCosteLlamada() {
        switch (franja){
            case 1:
                this.coste = duracion * 0.20;
                break;
            case 2:
                this.coste = duracion * 0.25;
                break;
            case 3:
                this.coste = duracion * 0.30;
                break;
        }

    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Franja: " + franja);
    }

    //getter y setter
    public int getFranja() {
        return franja;
    }

    public void setFranja(int franja) {
        this.franja = franja;
    }


}//fin de clase
