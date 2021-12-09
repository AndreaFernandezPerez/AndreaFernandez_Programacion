package EjerciciosT4Parte2;

import java.util.Scanner;

public class Ejercicio12Invisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPersonas = 0;
        String [] nombres = null;

        System.out.println("Cuantas personas van a participar");
        numPersonas = sc.nextInt();
        nombres = new String[numPersonas];

        for (int i = 0; i < nombres.length ; i++) {
            System.out.println("Escribe el nombre de los participantes");
            nombres [i] = sc.next();
        }
        for (int i = 0; i < nombres.length; i++) {
            int aleatorios = (int) (Math.random()*nombres.length);
            String nombreGenerado = nombres[aleatorios];

            for (int j = 0; j < nombres.length; j++) {
                do {
                    if (nombreGenerado.equals(nombreGenerado)){
                        aleatorios = (int) (Math.random()*nombres.length);
                    }
                }while (nombreGenerado != nombreGenerado);
            }

            System.out.println(nombreGenerado + " - " + nombreGenerado);
        }


        sc.close();

    }//fin de main
}//fin de clase
