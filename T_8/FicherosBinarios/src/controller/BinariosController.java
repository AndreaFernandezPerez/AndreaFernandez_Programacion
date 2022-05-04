package controller;

import model.Usuario;

import java.io.*;

public class BinariosController {

    /*
    * aquí solo meteremos los objetos/métodos que queremos ejecutar
    *
    * ruta ABSOLITA --> desde la raiz "User/Andrea/Desktop/ficheros/fichero.obj"
    * ruta RELATIVA --> desde donde estoy ubicado "../resources/fichero.obj"
    *  */

    //método

    public void escribirBinario(){
        //ponemos la ruta relativa, y escribimos el nombre del fichero que queremos escribir y donde se va a guardar
        // no podemos hacerlo manualmente, tiene que ser por consola

        // siempre hay que crear primero el fichero que queremos escribir
        File file = new File("src/resources/objetos.bin");
        // FileOutputStream fos = null; --> la podemos eliminar, xq la creamos como una clase anónima
        // cerrarlo!! el último elemento que contiene a todos los demás
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));//así sobreescribimos, si ponemos ,true, nos lo añade
            // si ponemos oos = new ObjectOutputStream(new FileOutputStream(file, true)); nos añade las lineas
            // escribimos el objeto con .writeObject y escribimos el objeto Usuario de manera anónima
            // que anteriormente nos habiamos creado en el Model
            oos.writeObject(new Usuario("Andrea", "Martin", "1234"));
            oos.writeObject(new Usuario("Iker", "Martin", "4321"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oos != null) {
                    oos.close(); // si no cierro el fichero, la escritura no se da
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }//fin método escribirBinario

    public void lecturaBinario(){

        File file = new File("src/resources/objetos.bin");
        // FileInputStream fis = null; --> lo mismo q en la escritura, no es necesario xq lo hacemos como clase anónima
        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            // oil.readObject() lee el objeto
            //Usuario usuario = (Usuario) ois.readObject();     Si ponemos esto, solo recuperamos el primero objeto
            //System.out.println(usuario.toString());           el resto no los leería

            // por lo que tenemos que hacer un while
            Usuario usuarioLectura = null;

            // el while en este caso hay que meterlo en un try/catch para no tener un EOFExcepction
            // xq la última línea ya no hay, no la puede leer y no la puede convertir
            try {
                // mientras sigamos leyendo objetos (Usuarios) y no sea nulo, lo imprimiremos
                // cuando sea nulo diremos Fichero terminado
                while ((usuarioLectura = (Usuario) ois.readObject()) != null){ // al ser un Usuario tenemos q castear
                    System.out.println(usuarioLectura);
                }
            }catch (EOFException e){
                System.out.println("Fichero terminado");
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    /* EJERCICIO
    * con MVC hacer un programa que pida usuarios de forma recurrente
    *  con todos sus datos (nombre, apellido, pass)
    * hasta que el usuario lo indique
    * Cada Vez que el usuario introduzca un usuario se escribira en fichero
    *
    * Cuando el usuario no quiera meter más usuarios se pedirá si quiere leer el fichero
    * En caso de decir que si apareceran los datos del usuario
    * con este formato: Nombre: XXX Apellido: XXX*/

    

}//fin de clase
