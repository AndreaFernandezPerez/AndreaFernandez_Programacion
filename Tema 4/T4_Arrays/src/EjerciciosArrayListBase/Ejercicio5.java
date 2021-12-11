package EjerciciosArrayListBase;

import java.util.ArrayList;

public class Ejercicio5 {
    public static void main(String[] args) {

        ArrayList<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add("Andrea");
        palabras.add("clase");
        palabras.add("examenes");
        palabras.add("navidad");
        palabras.add("familia");
        palabras.add("motivada");
        palabras.add("fiesta");
        palabras.add("coche");
        palabras.add("gatos");

        String palabraMenor = "aaaaaaaaaaaaaa";
        String palabraMayor = "";

        for (String item : palabras) {
            System.out.println(item.length());
            if (item.length() > palabraMayor.length()){
                palabraMayor = item;
            }
            if (item.length() < palabraMenor.length()){
                palabraMenor = item;
            }
        }
        System.out.println("La palabra mayor es: " + palabraMayor);
        System.out.println("La palabra menor es: " + palabraMenor);


    }//fin de main
}//fin de clase
