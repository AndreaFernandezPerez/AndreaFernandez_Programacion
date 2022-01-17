package ejercicios.coche;

public class Coche {

    //creamos variables
    private String marca, modelo;
    private double costeAveria;
    private Motor motor;

    //creamos constructores
    public Coche (){
    }

    public Coche (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Coche (String marca, String modelo, Motor motor){
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
    }

    //creamos métodos

    public void acumularAveria (double costeAveria){
        this.costeAveria += costeAveria;
    }

    //creamos getter y setter

    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}
    public double getPrecioAcumulado(){return costeAveria;}

    public double getCosteAveria() {return costeAveria;}

    public Motor getMotor() {return motor;}
}//fin de clase coche
