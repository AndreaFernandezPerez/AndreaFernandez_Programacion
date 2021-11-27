package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio2Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[30];
        int suma = 0, media = 0;

        for (int i = 0; i < numeros.length; i++) {
            int aleatorios = (int) (Math.random()*11);
            numeros[i] = aleatorios;
            System.out.println(numeros[i]);
            suma += numeros[i];
            media = suma/ numeros.length;
        }
        System.out.printf("El número de puntos obtenidos es %d.\nLa media es %d\n", suma,media);




        sc.close();

    }//fin de main
}//fin de clase
