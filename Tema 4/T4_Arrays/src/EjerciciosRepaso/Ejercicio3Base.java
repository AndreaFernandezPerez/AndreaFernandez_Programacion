package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio3Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];

        //Introducimos los números del array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número");
            int numIntro = sc.nextInt();
            numeros[i] = numIntro;
        }

        //Recorremos el array en el orden introducido con comas, excepto el último
        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length-1){
                System.out.print(numeros[i] + ", ");
            }else {
                System.out.print(numeros[i] + "\n");
            }
        }

        //Recorremos el array en orden inverso con comas, excepto el último valor
        for (int i = numeros.length-1; i >= 0; i--) {
            if (i > numeros[0]){
                System.out.print(numeros[i] + ", ");
            }
            if (i == numeros[0]){
                System.out.print(numeros[i] + "\n");
            }
        }

        sc.close();

    }//fin de main
}//fin de clase
