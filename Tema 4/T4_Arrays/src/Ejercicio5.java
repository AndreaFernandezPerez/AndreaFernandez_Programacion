import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int [] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce el número a guardar");
            int numeroIntroducido = lecturaTeclado.nextInt();
            numeros[i] = numeroIntroducido;

            if (numeroIntroducido %2 == 0){
                System.out.printf("%d es par\n",numeros[i]);
            }else {
                System.out.printf("%d es impar%n", numeros[i]);
            }
        }




        lecturaTeclado.close();

    }//fin de main
}//fin de clase
