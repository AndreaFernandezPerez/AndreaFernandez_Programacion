import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        String [] palabras = new String[10];
        int opcion;
        int sumaLetras = 0;

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            palabras[i] = lecturaTeclado.nextLine();
        }

        System.out.println("1. Ver todas las palabras");
        System.out.println("2. Palabra al azar");
        System.out.println("3. Ver número de letras");
        System.out.println("4. Ver media de letras");
        System.out.println("5. Ver palabra con más letras");
        System.out.println("6. Ver palabra con menos letras");
        System.out.println("¿Que opción quieres?");
        opcion = lecturaTeclado.nextInt();

        switch (opcion){
            case 1:
                for (String item : palabras) { //siempre hay q especificar que tipo de variable manejamos
                    System.out.println(item);
                }
                break;
            case 2:
                int aleatorio = (int)(Math.random()*10);
                // String palabraAleatoria = palabras[aleatorio]; //no es necesario crear una variable intermedia
                System.out.println("La palabra aleatoria es : " + palabras[aleatorio]);
                break;
            case 3:
                sumaLetras = 0;
                for (String item : palabras) {
                    item.length(); //con esto obtenemos la longitud de cada palabra
                    sumaLetras += item.length();
                }
                System.out.println("El número todal de letras es : " + sumaLetras);
                break;
            case 4:
                if (sumaLetras == 0){
                    System.out.println("El número de letras es 0, posiblemente no las has contado");
                }else {
                    System.out.println("Ver número medio de letras " + sumaLetras/ palabras.length);
                }
                break;
            case 5 | 6:
                String pequenia = "aaaaaaaaaaaaaaaaaaaaa", grande = " ";

                for (String item : palabras) {
                    if (item.length()>grande.length()){
                        grande = item;
                    }
                    if (item.length()<pequenia.length()){
                        pequenia = item;
                    }
                }
                break;
        }//fin de swithc


        lecturaTeclado.close();

    }//fin de main
}//fin de clase
