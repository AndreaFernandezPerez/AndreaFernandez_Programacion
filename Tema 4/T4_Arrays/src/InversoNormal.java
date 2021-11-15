import java.util.Scanner;

public class InversoNormal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            int numeroIntroducido;
            System.out.println("Introduce un número");
            numeroIntroducido = teclado.nextInt();
            numeros [i] = numeroIntroducido;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Orden normal " + numeros[i]);
        }
        for (int i = numeros.length -1; i >= 0 ; i--) { // Por que aquí no se puede poner en el valor de la i = numero.length? --> se puede poner i = 9 ó i = numero.length -1
            System.out.println(" Orden inverso " + numeros[i]);
        }


        teclado.close();

    }//fin de main
}//fin de clase
