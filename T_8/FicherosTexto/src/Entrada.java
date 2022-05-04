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
        file = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros/fichero.txt");
        directory = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros");

        file.isDirectory(); //devuelve un boolean

        File directory2 = null;
        directory2 = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros_nuevo");
        File file2 = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros/ficheroEscritura.txt");
        File file3 = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros/ficheroEscrituraCompleto.txt");

        FicherosController ficherosController = new FicherosController();
        // ficherosController.getFileInfo(file); --> nos da toda la información del fichero que hemos preguntado en la controladora
        // ficherosController.getFileInfo(directory);

        //ficherosController.getDirectoryInfo(directory); --> devuelve los nombres de los ficheros que contienen ese directorio
        //ficherosController.getDirectoryInfo(directory2);

        //ficherosController.lecturaFichero(file);

        //ficherosController.lecturaBuffer(file);

        // ficherosController.escrituraFichero(file2);

        // ficherosController.getFileInfo(file3);
        ficherosController.escribirFicheroCompleto(file3);

        sc.close();

    }//fin de main
}//fin de clase entrada
