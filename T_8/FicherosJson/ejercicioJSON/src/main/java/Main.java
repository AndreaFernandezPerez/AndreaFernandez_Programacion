import controller.JSONController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUsuarios;
        String genero;

        System.out.println("Cuantos usuarios");
        numUsuarios = sc.nextInt();
        System.out.println("Qué género (male/female/ambos)");
        genero = sc.next();

        JSONController jsonController = new JSONController();
        jsonController.leerUsuarios(numUsuarios, genero);

        sc.close();
    }// fin de main
}
