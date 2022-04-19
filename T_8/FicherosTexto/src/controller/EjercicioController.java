package controller;

import java.io.*;
import java.util.Scanner;

public class EjercicioController {

    //palabras sueltas
    Scanner sc = new Scanner(System.in);
    //lineas completas. Lo lee de la entrada
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


    public void listParentDirectory(){
        File file = new File("/Users/andreafernandez/Desktop/DAM/Programacion/ficheros");
        /*
        *  0 - Fichero1
        *  1 - Fichero2
        *  2 - Fichero-txt
        * */
        File[] ficherosParent = file.listFiles();
        // fichero(0) .DS fichero.txt fichero2(3) ficheroNuevo.txt(4)
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
            if (ficherosParent[opcion].isDirectory()){
                listarChild(ficherosParent[opcion]);
            }
        }else {
            System.out.println("Opción incorrecta");
        }
    }

    public void listarChild(File child){
        int contador = 0;
        int opcion = 0;
        File[] ficherosChild = child.listFiles();
        for (File childItem: ficherosChild) {
            System.out.println(contador + " - " + childItem.getName());
            contador++;
        }
        System.out.println(contador + " - Volver al padre");
        System.out.println("Que opción quieres");
        opcion = sc.nextInt();

        if (opcion >= 0 && opcion <= ficherosChild.length){
            //parent
            if (opcion == contador){
                listarChild(child.getParentFile());
            }else {
                //child
                if (ficherosChild[opcion].isDirectory()){
                    listarChild(ficherosChild[opcion]);
                }else {
                    System.out.println("Error. es un fichero");
                }
            }
        }else {
            System.out.println("Opción incorrecta");
        }
    }

    public void cifrarLinea(){

        String lineaEscribir = "Esto es un ejemplo de una línea a escribir dentro del fichero para cifrar y descifrar";

        String[] letras = lineaEscribir.split(""); //esto significa que haga el corte sobre todos los caracteres
        for (String letra : letras) {
            int codigo = (byte)letra.charAt(0); //casteamos a byte para convertir las letras en c´odigo ASCII
            int codigoCifrado = codigo * 2;
            char caracterCifrado = (char) codigoCifrado;
            System.out.println(caracterCifrado);

        }
    }//fin método cifrarLinea



    // hacer un programa que pida por consola una linea y la guarde en un fichero
    // el programa seguirá pidiendo lineas e introduciendolas en el fichero
    // hasta que se pulse el 0
    // cuando no se quiera continuar se imprimirá el contenido del fichero

    public void ejercicioLecturaEscritura(File file){

        int opcion = 0;
        String linea = "";
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        do {

            try {
                System.out.println("Introduce línea");
                linea = bufferedReader.readLine(); //esto me lee la línea entera
                System.out.println(linea);
                fileWriter = new FileWriter(file, true); //esto me escribe la línea en el fichero de la entrada
                printWriter = new PrintWriter(fileWriter);
                printWriter.println(linea);

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (printWriter != null){
                    printWriter.close();
                }
            }
            System.out.println("Quieres crear más línas (0(no)/1(si))");
            opcion = sc.nextInt();
        }while (opcion!=0);

        // lectura completa del fichero
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String lectura = "";
            String lecturaCompleta = "";
            StringBuffer lecturaBuffered = new StringBuffer(""); // es un objeto tipo buffered que permite añadir String
            // bufferedReader = new BufferedReader(new FileReader(file));
            while ((lectura = bufferedReader.readLine())!= null){
                lecturaBuffered.append(lectura + "\n"); //añadimos las diferentes líneas de golpe
            }
            lecturaCompleta = lecturaBuffered.toString();
            System.out.println(lecturaCompleta);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}//fin de clase
