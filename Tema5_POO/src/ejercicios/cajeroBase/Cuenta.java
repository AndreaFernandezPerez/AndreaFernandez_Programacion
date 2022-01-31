package ejercicios.cajeroBase;

public class Cuenta {

    //variables

    private int pin, isbn;
    private double saldo;
    private Cliente cliente;

    //constructores

    public Cuenta(){

    }

    public Cuenta(Cliente cliente, int pin, double saldo){
        this.cliente = cliente;
        this.pin = pin;
        this.saldo = saldo;
    }

    //métodos

    public void ingresarDinero(String dni, int pin){
      
    }
    public void sacarDinero(String dni, int pin){

    }
    public void mostrarCuenta (String dni, int pin){

    }

    //métodos get y set

}//fin de clase
