import java.util.Scanner;

public class NumerosTecladoArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numerosTeclado = new int[10];

        for (int i = 0; i < numerosTeclado.length; i++) {
            int numeroIntroducido;
            System.out.println("Introduce un número");
            numeroIntroducido = teclado.nextInt();
            numerosTeclado[i] = numeroIntroducido;
            System.out.println(numerosTeclado[i]);
        }

        teclado.close();

    }//fin de main
}//fin de clase
