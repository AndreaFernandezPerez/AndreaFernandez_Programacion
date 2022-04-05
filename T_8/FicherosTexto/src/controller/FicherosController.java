package controller;

import java.io.File;
import java.io.IOException;

public class FicherosController {

    public void getFileInfo(File file){
        System.out.println("Información de fichero");
        System.out.println("Es directorio? " + file.isDirectory());
        System.out.println("Es fichero? " + file.isFile());
        System.out.println("Existe? " + file.exists());
        System.out.println("Padre " + file.getParent()); //dice la carpeta anterior
        System.out.println("Hijos " + file.list());
        System.out.println("Nombre del archivo: " + file.getName());
        System.out.println("Ruta absoluta " + file.getAbsolutePath());
        System.out.println("Ruta absoluta del fichero dependiendo de su creación " + file.getPath());

        if (!file.exists()){ // si no existe
            try {
                file.createNewFile(); // creamos el fichero. "Obliga" a hacer una excepción
            } catch (IOException e) { //excepción de entrada y salida
                e.printStackTrace();
            }
        }
    }

    public void getDirectoryInfo(File file){
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(file.isDirectory()){
            String[] nombreFicheros = file.list(); //esto saca el nombre de los ficheros
            //System.out.println(nombreFicheros); Hay que recorrerlo
            for (String nombre : nombreFicheros) {
                System.out.println(nombre);
            }
            File[] ficheros = file.listFiles(); //con esto saca la ruta de los ficheros
            //System.out.println(ficheros);
            for (File item : ficheros) {
                System.out.println(item.getName()); //si ponemos .getName, solo dará los nombres de los ficheros
            }
        }
    }

}//fin de clase
