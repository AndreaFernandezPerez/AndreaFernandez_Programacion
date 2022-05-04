package controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// aquí crearemos todas aquellas acciones que queremos que se realicen sobre ficheros

public class FicherosController {
    Scanner sc = new Scanner(System.in);

    public void getFileInfo(File file){

        System.out.println("Información de fichero");
        System.out.println("¿Es directorio? " + file.isDirectory()); //devuelve un boolean, en este caso false
        System.out.println("¿Es fichero? " + file.isFile()); //devuelve un boolean, en este caso true
        System.out.println("¿El fichero existe? " + file.exists()); //devuelve un boolean, en este caso true

        if(!file.exists()){ // si el fichero no existe
            try {
                file.createNewFile(); // hay que crear un try/catch - excepciones porque es posible que no tengamos permisos de escritura, x ejemplo
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Permisos " + file.canWrite()); // nos permmitiria permitir escribir en el fichero
        System.out.println("¿Cuál es su padre? " + file.getParent()); // nos indica la carpeta anterior donde se encuentra
        // System.out.println("¿Cuál es su hijo? " + file.list()); // saca un []String de los objetos que contienen
        System.out.println("Nombre del archivo " + file.getName());
        System.out.println("Ruta absoluta " + file.getAbsolutePath());
        System.out.println("Ruta relativa " + file.getPath());

    }// fin de método getFileInfo

    public void getDirectoryInfo(File file){

        // primero preguntamos si existe, para que en caso de que no, lo cree
        if (!file.exists()){
            try {
                file.createNewFile(); // crea un nuevo file, pero no es un directorio
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
            File[] ficheros = file.listFiles(); //con esto saca la ruta de los ficheros, pero hay que recorrerla
            //System.out.println(ficheros);
            for (File item : ficheros) {
                System.out.println(item.getName());
                //si ponemos .getName, solo dará los nombres de los ficheros
                // si dejamos solo item, nos saca la ruta de los ficheros
            }
        }
    } // fin método getDirectoryInfo


    // FICHEROS DE ENTRADA

    //para leer un fichero por letras --> trabajamos con fileReader
    public void lecturaFichero(File file){

        //Cuando hacemos lecturas, es obligatorio crear excepciones

        FileReader fileReader = null; // permite hacer la lectura de un byte


        try { //el "fallo" que queremos tratrar
            fileReader = new FileReader(file);
            /*int lectura = fileReader.read(); --> .read devuelve un enteros, se utiliza para códigos Ascii
            System.out.println(lectura);*/ // --> esto nos devuelve el número correspondiente al código ascii de la 1ª letra del documento
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

        BufferedReader bufferedReader = null; // para leer un string completo
        try {
            //para leerlo, hay que "inicializar" primero la lectura por letras
            bufferedReader = new BufferedReader(new FileReader(file));
           // String linea = bufferedReader.readLine();
            //System.out.println(linea);
            String lectura = null;
            String lecturaCompleta = "";
            while ((lectura = bufferedReader.readLine())!= null){ // .readline devuelve la lectura de un String hasta el salto de linea
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
        String lineaEscribir = "Esto es un ejemplo de una linea a escribir dento del fichero";

        try{
            fileWriter = new FileWriter(file, true); //si ponemos un true lo que hace es añadir frases nuevas
            // escribe caracter a caracter
            fileWriter.write(101);

            /*
            fileWriter.write("Ejemplo");
            fileWriter.write("\n");
            fileWriter.write("esto es una nueva línea en el fichero");
            fileWriter.write("\n");
            */

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
        // para poder escribir una línea completa
        BufferedWriter bufferedWriter = null;
        PrintWriter printWriter = null;

        try {
            /*
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("esto es un ejemplo");
            bufferedWriter.newLine(); --> newLine para hace un salto de línea
            bufferedWriter.write("esto es una linea nueva");
            bufferedWriter.newLine();
            */
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println("esto es una linea"); // hace salto de línea automáticamente
            printWriter.println("esto es un ejemplo de linea segunda");
            printWriter.println("esto es un ejemplo de linea tercera");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (printWriter != null){
                printWriter.close();
            }
        }

            /*
            try {
                if (bufferedWriter != null) {
                   // fileWriter.close();
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

             */

    }

}//fin de clase
