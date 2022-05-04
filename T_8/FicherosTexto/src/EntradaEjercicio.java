import controller.EjercicioController;

import java.io.File;

public class EntradaEjercicio {
    public static void main(String[] args) {

        EjercicioController ejercicioController = new EjercicioController();
        // ejercicioController.listParentDirectory();

        // ejercicioController.cifrarLinea();
        File file = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros/ficheroLecturaEscritura.txt");

        ejercicioController.ejercicioLecturaEscritura(file);
    }
}
