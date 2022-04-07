package controller;

import java.io.File;
import java.util.Scanner;

public class EjercicioController {

    Scanner sc = new Scanner(System.in);


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


}//fin de clase
