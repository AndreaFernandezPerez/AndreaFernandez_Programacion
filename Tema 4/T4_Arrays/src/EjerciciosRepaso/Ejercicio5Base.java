package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio5Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0){
                System.out.println("Par " + numeros[i]);
            }else {
                System.out.println("Impar " + numeros[i]);
            }
        }

        sc.close();

    }//fin de main
}//fin de clase
