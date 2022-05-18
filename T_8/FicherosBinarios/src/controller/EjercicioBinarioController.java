package controller;

import model.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.ObjectOutputStream;

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

    //variables
    private ArrayList<Usuario> listaUsuarios;

    //constructor
    public EjercicioBinarioController() {
        listaUsuarios = new ArrayList<>();
    }


    //métodos
    public void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public void escrituraUsuario(){ // al principio pasabamos Usuario usuario

        File file = new File("src/resources/usuarios.bin");
        ObjectOutputStream oos = null;


        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            // oos.writeObject(usuario);
            /*
            for (Usuario itemUser : listaUsuarios) {
                oos.writeObject(itemUser);
            }
             */
            oos.writeObject(listaUsuarios); // hace lo mismo que el for anterior
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }// fin de método escribir usuario


    public void mostrarDatosUsuario(Usuario usuario){
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Pass: " + usuario.getContrasenia());
    }
    public void lecturaUsuario(boolean lectura){
        File file = new File("src/resources/usuarios.bin");
        // FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Usuario item = null;
            try{
                if (!lectura){
                    listaUsuarios = (ArrayList<Usuario>) ois.readObject();
                }else {
                    // a los ficheros no se les puede hacer for
                    while ((item = (Usuario) ois.readObject())!=null){
                        mostrarDatosUsuario(item);

                        /*
                        if (lectura){
                            // mostrarDatosUsuario(item);
                        }else {
                            listaUsuarios.add(item); //para cargar los datos
                        }
                        */
                    }
                }

            }catch (EOFException e){
                System.out.println("Terminado de leer fichero");
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

    }// fin de método lecturaUsuario

    public void existeFichero(){
        File file = new File("src/resources/usuarios.bin");
        if (file.exists()){
            lecturaUsuario(false); // xq no quiere mostrar los datos, si no añadirlos
        }

    } // fin de método existeFichero



}//fin de clase
