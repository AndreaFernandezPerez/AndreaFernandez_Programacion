import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        String [] palabras = new String[10];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Introduce una palabra");
            String palabra = lecturaTeclado.nextLine();
            palabras[i] = palabra;
        }
        System.out.println("1. Ver todas las palabras");
        System.out.println("2. Palabra al azar");
        System.out.println("3. Ver número de letras");
        System.out.println("4. Ver media de letras");
        System.out.println("5. Ver palabra con más letras");
        System.out.println("6. Ver palabra con menos letras");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }





        lecturaTeclado.close();

    }//fin de main
}//fin de clase
