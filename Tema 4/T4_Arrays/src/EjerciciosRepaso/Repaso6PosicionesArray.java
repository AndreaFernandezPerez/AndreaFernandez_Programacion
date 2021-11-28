package EjerciciosRepaso;

import java.util.Scanner;

public class Repaso6PosicionesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] boletoLoteria = new int[5];
        int [] miBoleto = new int[5];

        for (int i = 0; i < boletoLoteria.length; i++) {
            boletoLoteria[i] = (int) (Math.random()*10);
            System.out.print(boletoLoteria[i]);
        }
        System.out.println();
        for (int i = 0; i < miBoleto.length; i++) {
            System.out.println("introduce numeros de tu boleto de loteria");
            miBoleto[i] = sc.nextInt();
        }
        for (int item : miBoleto) {
            System.out.print(item);
        }
        for (int i = 0; i < boletoLoteria.length; i++) {
            if (boletoLoteria[i] == miBoleto[i]){
                System.out.println("has ganado la loteria");
                break;
            }else {
                System.out.println("NO has ganado loteria");
                break;
            }
        }
        sc.close();

    }//fin de main
}//fin de clase
