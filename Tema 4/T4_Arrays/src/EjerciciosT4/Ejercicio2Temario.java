package EjerciciosT4;

public class Ejercicio2Temario {
    public static void main(String[] args) {
        //creamos las variables
        String [] temario = {"Tema 1: Introducción","Tema 2: Identificadores","Tema 3: Estructuras","Tema 4: Colecciones","Tema 5: Orientación a objetos", "Tema 6: Clases y Objetos", "Tema 7; Abstracción, Herencia y Polimorfismo", "Tema 8: Ficheros y Excepciones", "Tema 9: Bases de datos", "Tema 10: Interfaces"};

        //mostramos por pantalla el número de valores del array
        System.out.println("Número de temas: " + temario.length);

        //imprimimos por pantalla todos los valores del array
        for (int i = 0; i < temario.length; i++) {
            System.out.println(temario[i]);
        }

    }//fin de main
}//fin de clase
