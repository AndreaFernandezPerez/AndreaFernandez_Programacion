package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio1Arrays {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce número a guardar ");
            int numeroIntroducido = teclado.nextInt();
            numeros[i] = numeroIntroducido;
        }
        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("Posición " + i + " - " + numeros[i]);
            System.out.printf("%d : %d\n", i, numeros[i]);
        }

        teclado.close();

    }//fin de main
}//fin de clase
