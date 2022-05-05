package controller;

import java.io.*;

public class EjercicioUno {

    File file = new File("/Users/AndreaFernandez/Desktop/DAM/Programacion/fichero_cifrado.txt");

    public void lecturaFichero(){

        FileReader fr = null;
        FileWriter fileWriter = null;
        int lectura = 0;
        int codigoDescifrado;
        char letraDescifrada = ' ';

        //lectura
        try {
            fr= new FileReader(file);
            while ((lectura=fr.read())!=-1){
                //System.out.println((char) lectura);
                codigoDescifrado = lectura / 2;
                letraDescifrada = (char)codigoDescifrado;
                System.out.println(letraDescifrada);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }// fin método lecturaFichero

}// fin de clase
