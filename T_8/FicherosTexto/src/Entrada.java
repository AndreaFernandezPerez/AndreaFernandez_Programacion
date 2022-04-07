import controller.FicherosController;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;

        File file = null;
        File directory = null;
        File directory2 = null;
        file = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros/fichero.txt");
        File file2 = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros/ficheroEscritura.txt");
        directory = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros");
        directory2 = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros_nuevo");

        FicherosController ficherosController = new FicherosController();
        //ficherosController.getFileInfo(file);
        //ficherosController.getFileInfo(directory);

        //ficherosController.getDirectoryInfo(directory);
        //ficherosController.getDirectoryInfo(directory2);

        //ficherosController.lecturaFichero(file);

        //ficherosController.lecturaBuffer(file);

        ficherosController.escrituraFichero(file2);

        sc.close();

    }//fin de main
}//fin de clase entrada
