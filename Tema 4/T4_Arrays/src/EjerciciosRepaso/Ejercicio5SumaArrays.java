package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio5SumaArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        int [] arrayUno;
        int [] arrayDos;
        int [] arrayTres;

        System.out.println("Introduce la longitud del array");
        longitud = sc.nextInt();

        arrayUno = new int[longitud];
        System.out.println("Los valores del primer array son: ");
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int)(Math.random()*11);
            System.out.println(arrayUno[i]);
        }
        arrayDos = new int[longitud];
        System.out.println("Los valores del segundo array son: ");
        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i] = (int)(Math.random()*11);
            System.out.println(arrayDos[i]);
        }
        arrayTres = new int[longitud];
        System.out.println("Los valores del tercer arrya son");
        for (int i = 0; i < arrayTres.length; i++) {
            arrayTres[i]= arrayUno[i]+arrayDos[i];
            System.out.println(arrayTres[i]);
        }

        sc.close();

    }//fin de main
}//fin de clase
