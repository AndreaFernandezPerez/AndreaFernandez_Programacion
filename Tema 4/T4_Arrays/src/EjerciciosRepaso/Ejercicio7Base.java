package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio7Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] palabras = new String[10];
        int opcion, sumaLetras = 0;
        double media = 0.0;

        //Pedimos las 10 palabras que guardamos en el array

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            palabras[i] = sc.next();
        }

        do {
            System.out.println("¿Que opción quieres elegir?");
            System.out.println("1. Ver todas las palabras: mostrar todas las palabras del array");
            System.out.println("2. Obtener una palabra al azar: mostrará una palabra de las que existen en el array");
            System.out.println("3. Ver número de letras: mostrará el número de letras que hay en total entre todas las palabras");
            System.out.println("4. Ver media de letras: mostrará el número medio de letras entre todas las palabas");
            System.out.println("5. Ver palabra con más letras");
            System.out.println("6. Ver palabra con menos letras");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: //Mostramos todas las palabras del array
                    for (int i = 0; i < palabras.length; i++) {
                        System.out.println(palabras[i]);
                    }
                    break;
                case 2: //obtenemos una palabra al azar
                    int aleatoria =(int) (Math.random()*10);
                    System.out.println("La palabra aleatoria es: " + palabras[aleatoria]);
                    break;
                case 3: //Se muestra en número de letras que hay en total entre todas las palabras
                    for (String item : palabras) {
                        sumaLetras += item.length();
                    }
                    System.out.println("El número de letras total es: " + sumaLetras);
                    break;
                case 4: // mostrar el número medio de letras entre todas las palabras
                    sumaLetras = 0;
                    for (String item : palabras) {
                        sumaLetras += item.length();
                    }//como no está pasando por el case 3, hay que calcularlo de nuevo aqui
                    media = (double) sumaLetras/ (double) palabras.length;
                    System.out.println("La media de letras es: " + media);
                    break;
                case 5 | 6: //Ver palabra con menos y con mas letras
                    String grande = " ";
                    String pequenia = "aaaaaaaaaaaaaaaaa";

                    for (String item : palabras) {

                        item.length();

                        if (item.length() > grande.length()){
                            grande = item;
                        }
                        if (item.length() < pequenia.length()){
                            pequenia = item;
                        }
                    }
                    System.out.println("La palabra mayor es: " + grande);
                    System.out.println("La palabra menor es: " + pequenia);

                    /*for (int i = 0; i < palabras.length; i++) {
                        if (palabras.length > grande.length()){
                            grande = palabras[i];
                        }
                        if (palabras.length < pequenia.length()){
                            pequenia = palabras[i];
                        }
                    }
                    */

                    break;
            }//fin de switch
        }while (opcion != 0);


        sc.close();
    }//fin de main
}//fin de clase
