package EjerciciosT4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4MayorArray {
    public static void main(String[] args) {

        //creamos las variables
        Scanner lecturaTeclado = new Scanner(System.in);
        int longitud;
        int mayor = -99999;
        int menor = 99999;
        int [] enteros;
        //int [] numeros; --> esto es para inicializar un array sin valores

        //pedimos por pantalla cual es la longitud que desea del array
        System.out.println("Introduce la longitud que quieres que tenga el array");
        longitud = lecturaTeclado.nextInt();

        //Creamos el array con la longitud pedida anteriormente
        enteros = new int[longitud];

        //pedimos que introduzcan los valores del array
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Introduzca los valores del array");
            enteros[i] = lecturaTeclado.nextInt();

            //comparamos cual el el menor y mayor número
            if (enteros[i] < menor){
                menor = enteros[i];
            }
            if (enteros[i] > mayor){
                mayor = enteros[i];
            }
        }

            /* comparar con for each
        for (int item : enteros) {
            if (enteros < menor){
                menor = enteros;
            }
            if (enteros > mayor){
                mayor = enteros;
            }
        }
        */


        //otra manera de saber cual es el número mayor y menor
        // Arrays una libreria como Math. y sort ordena

        Arrays.sort(enteros);

        //los imprimimos ordenados
        for (int item : enteros){
            System.out.println(enteros);
        }

        //indicamos cual es mayor o menor
        System.out.println("El mayor es " + enteros[enteros.length-1]); //numeros.length - 1, porque los valores son 10, pero las posiciones empiezan de cero, asi que son 9.
        System.out.println("El menor es " + enteros[0]);

        //imprimimos por consola
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menos es: " + menor);





        lecturaTeclado.close();

    }//fin de main
}//fin de clase
