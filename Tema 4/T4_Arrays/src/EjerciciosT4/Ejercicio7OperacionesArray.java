package EjerciciosT4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio7OperacionesArray {
    public static void main(String[] args) {
        int [] numeros = {0,1,2,3,4,5,6,7,8,9};

        //mostramos los datos separados por una coma y un espacio
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d, ", numeros[i]); //¿Cómo quitamos la última coma?
        }
        System.out.println("\n");
        //Incrementar en 1 los valores pares y en -1 los impares.
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0){
                numeros[i]++;
                System.out.printf("%d, ", numeros[i]);
            }else {
                numeros[i]--;
                System.out.printf("%d, ", numeros[i]);
            }
        }
        System.out.println("\n");
        //Duplicar los valores positivos menores que 5
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 5){
                numeros[i] *= 2;
                System.out.printf("%d, ", numeros[i]);
            }
        }
        System.out.println("\n");
        //Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int) (Math.random()*((5 + 1) - (-5)- (-5)));
            numeros[i] += aleatorio;
            System.out.printf("%d, ", numeros[i]);
        }
        System.out.println("\n");

        //rotamos una posición a la derecha
        int ultimoNumero = numeros[numeros.length-1];
        for (int i = numeros.length-1; i > 0; i--) {
            numeros[i] = numeros[i+1];
            System.out.printf("%d, ", numeros[i]);
        }




    }//fin de main
}//fin de clase
