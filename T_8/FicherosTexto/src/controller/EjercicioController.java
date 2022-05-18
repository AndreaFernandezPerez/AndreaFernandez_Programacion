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
        // fichero(posición 0 del []) .DS fichero.txt fichero2(1) ficheroNuevo.txt(2)
        int contador = 0;
        int opcion = 0;
        System.out.println("Imprimiendo " + file.getName()); //nos dice el nombre del directorio (el padre), el nombre de la carpeta inicial

        for (File item : ficherosParent) {
            if (!item.isHidden()){ //Hidden para archivos ocultos. Lo negamos para que no salga
                System.out.println(contador + " - " + item.getName());
                contador++;
            }
        }

        System.out.println("Que directorio quieres listar");
        opcion = sc.nextInt();
        // hacemos un if, para indicar que opción tiene que estar dentro del tamaño del [] de ficherosParent, en este caso
        if (opcion >= 0 && opcion < ficherosParent.length){
            if (ficherosParent[opcion].isDirectory()){ // si el [] de ficherosParent es un directorio (carpeta), listaremos los ficheros hijos
                // llamamos al método hijo, para listarlo
                listarChild(ficherosParent[opcion]);
            }else { // si lo que hemos seleccionado no es una carpeta y no puede listar los "hijos", nos indica que es un fichero
                System.out.println("Error. Seleccionado un fichero");
            }
        }else {
            System.out.println("Opción incorrecta");
        }
    } // fin método listParentDirectory

    public void listarChild(File child){
        int contador = 0;
        int opcion = 0;
        File[] ficherosChild = child.listFiles();
        System.out.println("Listando directorio " + child.getName());
        for (File childItem: ficherosChild) {
            System.out.println(contador + " - " + childItem.getName());
            contador++;
        }
        System.out.println(contador + " - Volver al padre");
        System.out.println("Que opción quieres");
        opcion = sc.nextInt();
        // hacemos un if, para indicar que opción tiene que estar dentro del tamaño del [] de ficherosParent, en este caso
        if (opcion >= 0 && opcion <= ficherosChild.length){ // ponemos el = xq queremos incluir la opción volver al padre
            //parent ¿Cuando lo he seleccionado?
            if (opcion == contador){
                listarChild(child.getParentFile()); // sobre el hijo q estamos listando actualmente, preguntamos por el padre
            }else {
                //child . El método se llama a si mismo, haciendose recursivo y volviendo a listar
                if (ficherosChild[opcion].isDirectory()){//si es una carpeta, vuelvo a llamar al método
                    listarChild(ficherosChild[opcion]); // le pasamos el file de la posición del []
                }else {
                    System.out.println("Error. es un fichero");
                }
            }
        }else {
            System.out.println("Opción incorrecta");
        }
    } // fin método listarChild


    // leer documento a través de código ascii
    public void cifrarLinea(){

        /*
        *  char letra = 'e';
        *  System.out.println((byte)letra); --> nos da el número que corresponde a la letra e, siempre y cuando lo casteemos a bytes
        * */

        String lineaEscribir = "Esto es un ejemplo de una línea a escribir dentro del fichero para cifrar y descifrar";
        // sacamos cada una de las letras del String lineaEscribir, para lo que utilizamos un split
        String[] letras = lineaEscribir.split(""); //esto significa que haga el corte sobre todos los caracteres
        for (String letra : letras) {
            int codigo = (byte)letra.charAt(0); //me devuelve la letra en la posición 0 -- casteamos a byte para convertir las letras en código ASCII
            int codigoCifrado = codigo * 2;
            System.out.println(codigoCifrado); // pasamos los números que hemos cifrado correspondientes a cada letra

            char caracterCifrado = (char) codigoCifrado; // y así convertimos los números a letras, que no tienen nada que ver con el texto inicial
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
                // System.out.println(linea);
                fileWriter = new FileWriter(file, true); //esto me escribe la línea en el fichero de la entrada. LO AÑADE!!!
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

        }while (opcion!=0); //si opcion es distinto a 0, vuelve a pedir línea

        // lectura completa del fichero
        // FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            /*
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
             */
            bufferedReader = new BufferedReader(new FileReader(file));
            String lectura = "";
            String lecturaCompleta = ""; // --> para lecturas pequeñas
            StringBuffer lecturaBuffered = new StringBuffer(""); // es un objeto tipo buffered que permite añadir String. Lecturas grandes
            // bufferedReader = new BufferedReader(new FileReader(file));
            while ((lectura = bufferedReader.readLine())!= null){
                // vamos guardando toda la lectura
                // lecturaCompleta += lectura; --> para lecturas pequeñas
                lecturaBuffered.append(lectura + "\n"); //añadimos las diferentes líneas de golpe
            }
            // imprimimos la lectura completa
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
