import controller.EjercicioBinarioController;
import model.Usuario;

import java.util.Scanner;

public class MainEjercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, apellido, pass;
        int opcionUsuario = 0, opcionLectura = 0;

        do {
            System.out.println("Intro nombre");
            nombre = sc.next();
            System.out.println("Intro apellido");
            apellido = sc.next();
            System.out.println("Intro password");
            pass = sc.next();
            Usuario usuario = new Usuario(nombre, apellido, pass);
            
            System.out.println("Quieres meter más usuarios");
            opcionUsuario = sc.nextInt();
            // 0 = no ; 1 = si
        }while (opcionUsuario != 0);

    }//fin de main
}
