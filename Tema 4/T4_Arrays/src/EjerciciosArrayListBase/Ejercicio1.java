package EjerciciosArrayListBase;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("hola");
        palabras.add("andrea");
        palabras.add("instituto");
        palabras.add("estudiar");
        palabras.add("examenes");
        palabras.add("clases");
        palabras.add("tren");
        palabras.add("trabajo");
        palabras.add("perro");
        palabras.add("casa");

        for (String item : palabras) {
            System.out.println(item);
        }


    }//fin de main
}//fin de clase
