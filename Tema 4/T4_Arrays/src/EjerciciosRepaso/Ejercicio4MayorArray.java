package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio4MayorArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud, menor = 999999, mayor = -999999;

        System.out.println("Introduce la longitud del array");
        longitud = sc.nextInt();

        int [] numeros = new int[longitud];

        //generamos los valores del array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*51);
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);

        sc.close();

    }//fin de main
}//fin de clase
