package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            int numeroIntroducido;
            System.out.println("Introduce un número");
            numeroIntroducido = teclado.nextInt();
            numeros [i] = numeroIntroducido;
        }
        //Orden normal
        for (int i = 0; i < numeros.length; i++) {
            if (i < 9){
                System.out.println(numeros[i] + ", ");
            }
            else {
                System.out.println(numeros[i]);
            }
        }
        //orden inverso
        for (int i = numeros.length -1; i >= 0 ; i--) { // Por que aquí no se puede poner en el valor de la i = numero.length? --> se puede poner i = 9 ó i = numero.length -1
            if (i == 0){
                System.out.println(numeros[i] + ", ");
            }
            else if (i <= 9 ){
            System.out.println(numeros[i]);
            }
        }


        teclado.close();

    }//fin de main
}//fin de clase
