package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio6PosicionesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud;
        int [] numeros;

        System.out.println("Introduce la longitud del array");
        longitud = sc.nextInt();

        numeros = new int[longitud];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un valor");
            numeros [i] = sc.nextInt();
        }

        int ultima = numeros[numeros.length-1];

        //movemos los valores una posición a la derecha
        for (int i = numeros.length-1; i >= 0; i--) {
            if (i == 0){
                numeros[i] = ultima;
            }else {
                numeros[i] = numeros[i - 1];
            }
        }
        //imprimimos la rotación de los números
        System.out.println("Rotamos un valor a la derecha");
        for (int item : numeros) {
            System.out.println(item);
        }

        //rotamos los valores una posición a la izquierda
        int primera = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeros[numeros.length-1]){
                numeros[i] = primera;
            }else {
                numeros[i] = numeros [i + 1];
            }
        }
        System.out.println("Rotamos un valor a la izquierda");
        for (int item : numeros) {
            System.out.println(item);
        }




        sc.close();

    }//fin de main
}//fin de clase
