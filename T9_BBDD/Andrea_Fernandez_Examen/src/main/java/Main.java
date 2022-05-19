import controller.EjercicioDos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        EjercicioDos controller = new EjercicioDos();

        controller.leerJSON();

        System.out.println("Que deseas hacer?");
        System.out.println("1. Burcar por total");
        opcion = sc.nextInt();
        System.out.println("2. Buscar por pais");
        opcion = sc.nextInt();


        sc.close();

    }// fin main
}// fin clase
