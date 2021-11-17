package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio4MayorArray {
    public static void main(String[] args) {

        //creamos las variables
        Scanner lecturaTeclado = new Scanner(System.in);
        int longitud;
        int mayor = -99999;
        int menor = 99999;

        //DUDA: si ponemos int [] numeros = new int [0] y le damos valor cero, es como cuando inicializamos una variable normal?

        //pedimos por pantalla cual es la longitud que desea del array
        System.out.println("Introduce la longitud que quieres que tenga el array");
        longitud = lecturaTeclado.nextInt();

        //Creamos el array con la longitud pedida anteriormente
        int [] enteros = new int[longitud];

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

        //imprimimos por consola
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menos es: " + menor);





        lecturaTeclado.close();

    }//fin de main
}//fin de clase
