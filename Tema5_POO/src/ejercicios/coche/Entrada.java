package ejercicios.coche;

public class Entrada {

    public static void main(String[] args) {

        Motor motorGasoil = new Motor(150);
        Motor motorGasolina = new Motor (129);

        Coche cocheGasolina = new Coche("Ford", "Fiesta", new Motor(110));
        Coche cocheGasoil = new Coche("Opel", "Astra");

        //System.out.println(cocheGasoil.getMotor().getCaballos()); //con esto nos da los caballo que tiene el cocheGasoil

        System.out.println(cocheGasoil.getCosteAveria());
        cocheGasoil.acumularAveria(900);

        Garaje garaje = new Garaje();
        //coche = null  numCoches = 0  averia = null

        if (garaje.aceptarCoche(cocheGasolina, "aceite")){
            System.out.println("Coche aceptado");
            System.out.println(cocheGasolina.getMotor().getLitrosAceite());
        }else {
            System.out.println("Garaje ocupado");
        }

    }//fin de main
}//fin de clase entrada
