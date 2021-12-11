package EjerciciosArrayListBase;

import java.util.ArrayList;

public class Ejercicio3Aleatorios {
    public static void main(String[] args) {

        ArrayList<String> nombreCompaneiros = new ArrayList<>();

        nombreCompaneiros.add("Patricia");
        nombreCompaneiros.add("Marcos");
        nombreCompaneiros.add("Sergio");
        nombreCompaneiros.add("Alex");
        nombreCompaneiros.add("Mario");
        nombreCompaneiros.add("Cristina");
        nombreCompaneiros.add("Angel");
        nombreCompaneiros.add("Kai");
        nombreCompaneiros.add("Luismi");
        nombreCompaneiros.add("Jess");
        nombreCompaneiros.add("Alvaro");

        int aleatorio = (int)(Math.random()* nombreCompaneiros.size());

        System.out.println(nombreCompaneiros.get(aleatorio));

    }//fin de main
}//fin de clase
