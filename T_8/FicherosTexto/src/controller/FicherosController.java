package controller;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FicherosController {
    Scanner sc = new Scanner(System.in);

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

    public void listParentDirectory(){
        File file = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros");
        File[] ficherosParent = file.listFiles();
        int contador = 0;
        int opcion = 0;
        System.out.println("Imprimiendo " + file.getName()); //nos dice el nombre del directorio
        for (File item : ficherosParent) {
            if (!item.isHidden()){ //Hidden para archivos ocultos. Lo negamos para que no salga
                System.out.println(contador + " - " + item.getName());
                contador++;
            }
        }
        System.out.println("Que directorio quieres listar");
        opcion = sc.nextInt();
        if (opcion >= 0 && opcion < ficherosParent.length){

        }else {
            System.out.println("Opción incorrecta");
        }
    }

    public void listChild(File child){
        int contador = 0;
        int opcion = 0;
        File[] ficherosChild = child.listFiles();
        for (File childItem: ficherosChild) {
            System.out.println(contador + " - " + childItem.getName());
            contador++;
        }
        System.out.println("Que opcion quieres");

        if (opcion >= 0 && opcion < ficherosChild.length){

        }else {
            System.out.println("Opción incorrecta");
        }
    }

}//fin de clase
