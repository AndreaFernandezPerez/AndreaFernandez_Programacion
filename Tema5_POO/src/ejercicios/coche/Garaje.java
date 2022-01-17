package ejercicios.coche;

public class Garaje {

    //atributos

    private Coche coche;
    private String averia;
    private int numCoche;

    //constructores
    public Garaje () {

    }

    //métodos

    public boolean aceptarCoche (Coche coche, String averia){
        if (this.coche != null){
            return false;
        }else {
            numCoche++;
            this.coche = coche;
            if (averia.equalsIgnoreCase("aceite")) {
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite()+10);
            }else {
                coche.getMotor().setLitrosAceite(coche.getMotor().getLitrosAceite()+(int)(Math.random()*10));
            }
            return true;
        }

    }

    //getter y setter


}//fin de clase
