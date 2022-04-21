package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioBinarioController {

    /* EJERCICIO
     * con MVC hacer un programa que pida usuarios de forma recurrente
     * con todos sus datos (nombre, apellido, pass)
     * hasta que el usuario lo indique
     * Cada Vez que el usuario introduzca un usuario se escribira en fichero
     *
     * Cuando el usuario no quiera meter más usuarios se pedirá si quiere leer el fichero
     * En caso de decir que si apareceran los datos del usuario
     * con este formato: Nombre: XXX Apellido: XXX*/


    //tenemos que escribir el usuario

    private ArrayList<Usuario> listaUsuarios;


    public void escrituraUsuario(){

        File file = new File("src/resources/usuarios.bin");
        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }// fin de método escribir usuario



}//fin de clase
