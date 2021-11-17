package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio3MultiplarArray {
    public static void main(String[] args) {

        //creamos variables
        Scanner lecturaTeclado = new Scanner(System.in);
        int [] numeros = new int[5];
        int suma = 0;

        //solicitamos los valores para el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número");
            numeros[i] = lecturaTeclado.nextInt();
        }

        //modificamos los valores del array multiplicandolos por 2
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }

        //sumamos los valores del array
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        //imprimimos por consola
        System.out.println("La suma de todos los datos es: " + suma);
        System.out.println("La media es: " +  suma/ numeros.length);


        lecturaTeclado.close();
    }//fin de main
}//fin de clase
