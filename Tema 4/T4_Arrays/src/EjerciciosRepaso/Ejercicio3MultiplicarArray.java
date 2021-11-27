package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3MultiplicarArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[5];
        int suma = 0, media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un valor");
            numeros [i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
            System.out.println(numeros[i]);
        }
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los números es: " + suma);

        for (int i = 0; i < numeros.length; i++) {
            media = suma/ numeros.length;
        }
        System.out.println("La media de los números es: " + media);






        sc.close();
    }//fin de main
}//fin de clase
