package EjerciciosRepaso;

public class Ejercicio4Base {
    public static void main(String[] args) {
        int [] numero = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];

        //Generamos valores aleatorios para el array número de entre 0 y 100
        System.out.println("Números aleatorios del array numero");
        for (int i = 0; i < numero.length; i++) {
            int aleatorios = (int) (Math.random()*101);
            numero[i] = aleatorios;
        }
        //En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero.
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }
        //En el array cubo se deben almacenar los cubos de los valores que hay en numero.
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);
        }

        //Lo imprimimos en tres columnas
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%d \t %d \t %d \n", numero[i], cuadrado[i], cubo[i]);
        }

    }//fin de main
}//fin de clase
