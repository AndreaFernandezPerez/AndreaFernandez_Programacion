package EjerciciosT4;

import java.util.Scanner;

public class Ejercico6PosicionesArray {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int numeros [] = {1,2,3,4,5,6,7,8,9,10};

        //guardamos el último valor
        int ultimo = numeros[numeros.length-1];
        int primero = numeros[0];

        System.out.println("Imprimimos al revés los números del array");
        for (int i = numeros.length-1; i > 0 ; i--) {
            //rotamos posiciones
            numeros[i]= numeros[i-1];
            System.out.println(numeros[i]);
        }

        System.out.println("Rotación de números");
        for (int i = 0; i < numeros.length-1; i++) {
            numeros[i] = numeros[i+1];
            System.out.println(numeros[i]);
        }

        System.out.println("Rotamos números");
        numeros [numeros.length-1]= primero;
        for (int item : numeros) {
            System.out.println(item + " ");
        }
        System.out.println("Rotamos números");
        numeros[0] = ultimo;
        for (int item : numeros) {
            System.out.println(item);
        }



        lecturaTeclado.close();

    }//fin de main
}//fin de clase
