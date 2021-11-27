package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1Base {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce 10 números");
            int numIntro = lecturaTeclado.nextInt();
            numeros[i] = numIntro;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d - %d\n", i, numeros[i]);
        }


        lecturaTeclado.close();

    }//fin de main
}//fin de clase
