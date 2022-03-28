package excepciones;

import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {
        /* String palabra = "hola";
        String[] palabras = new String[]{"Uno", "Dos", "Tres", "Cuatro"};
        try{
            System.out.println(palabra.length());
            System.out.println(palabras[5]);
        }catch (NullPointerException e){
            System.out.println("La palabra es nula");
        } catch (Exception e){
            System.out.println(e.getMessage()); //aparece la causa del error
            e.printStackTrace();
            System.out.println("La palabra es nula");
        } finally {
            System.out.println("Ejecución obligatoria");
        }
        System.out.println("Bloque final");*/

        Coche coche = new Coche();
        try {
            coche.metodoUno();
        } catch (IOException e) {
           // e.printStackTrace();
            System.out.println("error en fichero");
        }
        coche.metodoDos(false);


    }//fin de main
}//fin de clase
