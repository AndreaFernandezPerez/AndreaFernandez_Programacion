package EjerciciosT4Parte2;

import java.util.Scanner;

public class Ejercicio8FraseArray {
    public static void main(String[] args) {
        String frase = "La emocion de ganar debe ser mayor a la de perder";

        String [] palabras = frase.split(" ");

        String menor = "aaaaaaaaaaaaaaaaaa", mayor = "";
        for (String item : palabras) {
            item.length();
            if (item.length() > mayor.length()){
                mayor = item;
            }
            if (item.length() < menor.length()){
                menor = item;
            }
            if (item.length() == 4){
                System.out.println(item + " ");
            }
        }
        System.out.println("La palabra mayor es: " + mayor);
        System.out.println("La palabra menor es: " + menor);


    }//fin de main
}//fin de clase

