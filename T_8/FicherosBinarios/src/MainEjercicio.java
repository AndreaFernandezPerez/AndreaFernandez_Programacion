import controller.EjercicioBinarioController;
import model.Usuario;

import java.util.Scanner;

public class MainEjercicio {
    public static void main(String[] args) {

        EjercicioBinarioController ejercicio = new EjercicioBinarioController();
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, pass;
        int opcionUsuarios = 0, opcionLectura = 0;

        // así inicializamos el fichero
        // solo escribir datos
        ejercicio.existeFichero();

        // si no hemos inicializado los ficheros, lo creamos de cero
        do {
            System.out.println("Intro nombre");
            nombre = sc.next();
            System.out.println("Intro apellido");
            apellido = sc.next();
            System.out.println("Intro password");
            pass = sc.next();
            Usuario usuario = new Usuario(nombre, apellido, pass);
            ejercicio.addUsuario(usuario);
            System.out.println("Quieres meter más usuarios: 0(no)/1(si)");
            opcionUsuarios = sc.nextInt();
            // 0 = no ; 1 = si
        }while (opcionUsuarios != 0);

        // Cuando ya no quiero añadir más usuarios, creo el fichero
        ejercicio.escrituraUsuario();

        System.out.println("¿Quieres leer el fichero?");
        opcionLectura = sc.nextInt();
        if (opcionLectura == 1){
            // solo quiero mostrar datos
            ejercicio.lecturaUsuario(true);
        }else {
            System.out.println("Terminado");
        }

    }//fin de main
}
