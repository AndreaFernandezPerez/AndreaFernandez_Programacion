package entradaAleatorio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaAleatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        int numeroIntroducido = 0;
        int aleatorio = (int) (Math.random()*6);
        System.out.println(aleatorio);

        do {
            try{
                System.out.println("Introduce número a jugar");
                sc = new Scanner(System.in);
                numeroIntroducido = sc.nextInt();
                if (numeroIntroducido < 0){
                    throw new ExceptionNumero("Número inferior a 0");
                }
            }catch (InputMismatchException | ExceptionNumero e){
                System.out.println(e.getMessage()); // getMessage imprime los mensajes de dentro del try
            }finally {
                intentos ++;
            }


        }while (numeroIntroducido != aleatorio);
        System.out.println("Número  acertado en " + intentos + " intentos");

        sc.close();
    }
}
