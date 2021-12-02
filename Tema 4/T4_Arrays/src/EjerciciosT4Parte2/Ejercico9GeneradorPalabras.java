package EjerciciosT4Parte2;

import java.util.Scanner;

public class Ejercico9GeneradorPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palabrasGenerar;
        char [] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println("Cuantas palabras quieres generar");
        palabrasGenerar = sc.nextInt();

        for (int i = 0; i < palabrasGenerar; i++) {
            System.out.println("Palabra " + i);
            System.out.println("Cuantas letras tiene la palabra");
            int numeroLetras = sc.nextInt();
            String palabra = "";

            for (int j = 0; j < numeroLetras; j++) {
                char letraAleatoria = abecedario[(int) (Math.random()*abecedario.length)];
                palabra += letraAleatoria;
            }
            System.out.println(palabra);
        }



        sc.close();
    }//fin de main
}//fin de clase
