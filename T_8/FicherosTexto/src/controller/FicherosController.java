package controller;

import java.io.*;
import java.util.ArrayList;
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


    // FICHEROS DE ENTRADA

    //para leer un fichero por letras --> trabajamos con fileReader
    public void lecturaFichero(File file){

        //Cuando hacemos lecturas, es obligatorio crear excepciones

        FileReader fileReader = null;


        try { //el "fallo" que queremos tratrar
            fileReader = new FileReader(file);
            /*int lectura = fileReader.read();
            System.out.println(lectura);*/
            int lectura = fileReader.read();

            while ((lectura = fileReader.read())!=-1){ //volvemos a reevaluar
                System.out.println((char) lectura); //para leerlos con letras --> lo casteamos a char
            }


            /* NO ES RECOMENDABLE HACER ESTO
            do {
                lectura = fileReader.read();
                if (lectura >-1){
                    System.out.println(lectura);
                }
            }while (lectura!=-1);

             */

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // es recomendable cerrar las excepciones
            try {
                fileReader.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }


    }//fin método lecturaFichero


    //para leer un fichero por líneas --> trabajamos con bufferReader
    public void lecturaBuffer(File file){

        BufferedReader bufferedReader = null;
        try {
            //para leerlo, hay que "inicializar" primero la lectura por letras
            bufferedReader = new BufferedReader(new FileReader(file));
           // String linea = bufferedReader.readLine();
            //System.out.println(linea);
            String lectura = null;
            String lecturaCompleta = "";
            while ((lectura = bufferedReader.readLine())!= null){
                //System.out.println(lectura);
                lecturaCompleta += lectura;
                lecturaCompleta += "\n";
            }
            System.out.println("La lectura complesta es: ");
            System.out.println(lecturaCompleta);

            //como saber cuantas vocales tengo
            lecturaCompleta.split("a");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }// fin método lecturaBuffer


    //FICHEROS DE SALIDA

    public void escrituraFichero(File file){

        FileWriter fileWriter = null;

        try{
            fileWriter = new FileWriter(file, true); //si ponemos un true lo que hace es añadir frases nuevas

            fileWriter.write("Ejemplo");
            fileWriter.write("\n");
            fileWriter.write("esto es una nueva línea en el fichero");
            fileWriter.write("\n");
            fileWriter.write(101);


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }//fin de método escrituraFichero

    public void escribirFicheroCompleto(File file){

        //lo igualamos a null para poder usarlo fuera del try
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("esto es una linea");
            /*
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("esto es un ejemplo");
            bufferedWriter.newLine();
            bufferedWriter.write("esto es una linea nueva");
            bufferedWriter.newLine();
            */

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null) {
                   // fileWriter.close();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}//fin de clase
