package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio10Loteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] boletoMio = new int[7];
        int [] boletoLoteria = new int[7];
        int aciertos = 0;

        //generamos los valores del boleto ganador
        for (int i = 0; i < boletoLoteria.length; i++) {
            boletoLoteria[i] = (int) (Math.random()*10);
            System.out.print(boletoLoteria[i]);
        }
        System.out.println();
        //generamos el número de mi boleto
        for (int i = 0; i < boletoMio.length; i++) {
            System.out.println("Introduce un número de tu boleto");
            boletoMio[i] = sc.nextInt();
        }
        for (int i = 0; i < boletoMio.length; i++) {
            if (boletoLoteria[i] == boletoMio[i]) {
                aciertos++;
            }
        }
        switch (aciertos) {

            case 0:
                System.out.println("No has acertado ninguno");
                break;
            case 1:
                System.out.println("Has ganado 10 euros");
                break;
            case 2:
                System.out.println("Has ganado 100 euros");
                break;
            case 3:
                System.out.println("Has ganado 1000 euros");
                break;
            case 4:
                System.out.println("Has ganado 10000 euros");
                break;
            case 5:
                System.out.println("Has ganado 100000 euros");
                break;
        }
        sc.close();
    }//fin de main
}//fin de clase
