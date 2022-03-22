package coche;

public class Entrada {
    public static void main(String[] args) {

        Coche coche = new Coche(5000, "Opel", "Astra");
        coche.mostrarDatosCoche();
        Coche.Motor motor = coche.new Motor(200, 2500);
        coche.mostrarDatosCoche();


    }// fin de main
}//fin de clase
