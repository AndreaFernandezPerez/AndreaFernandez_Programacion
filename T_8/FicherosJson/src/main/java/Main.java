import controller.JSONController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int curso;
        String ciclo;

        JSONController controller = new JSONController();
        // controller.pasarStringJSON();

        // controller.lecturaJSON();

        //controller.leerJSONAsignaturas();
    /*
        System.out.println("Introduce el curso");
        curso = sc.nextInt();
        System.out.println("Introduce el ciclo");
        ciclo = sc.next();
    */
        //controller.leerJSONAsignaturas(ciclo,curso);

        //controller.lecturaJSONAPI(10);

        controller.lecturaUsers();



        sc.close();

    }//fin de main
}//fin de clase
