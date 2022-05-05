package controller;

import model.Personaje;

import java.io.*;

public class EjercicioDos {

    File file = new File("/Users/AndreaFernandez/Desktop/DAM/Programacion/personajes_vf.bin");

    public void lectura(){

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Personaje lecturaObj = null;

            while ((lecturaObj = (Personaje) ois.readObject())!=null){
                System.out.println(lecturaObj);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }//fin método lectura

}// fin clase EjercicioDos
