package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio5SumaArrays {
    public static void main(String[] args) {
        //creamos variables
        Scanner lecturaTeclado = new Scanner(System.in);
        int longitud;
        int [] arrayUno;
        int [] arrayDos;
        int [] arrayTres;

        //Solicitamos por pantalla la longitud que queremos que tengan nuestros arrays
        System.out.println("Introduce la longitud del array");
        longitud = lecturaTeclado.nextInt();

        //Creamos los arrays y los valores de los array con las longitudes que nos han proporcionado
        arrayUno = new int[longitud];
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) (Math.random()*51);
            System.out.println("Los valores del primer array son: " + arrayUno[i]);
        }

        arrayDos = new int[longitud];
        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i] = (int) (Math.random()*51);
            System.out.println("Los valores del segundo array son: " + arrayDos[i]);
        }

        //creamos un tercer array, con la misma longitud que los dos anteriores
        arrayTres = new int[longitud];

        //rellenamos el tercer array con la suma de las posiciones Array1.posicion1 + array2.posicion = array3.posicion
        for (int i = 0; i < arrayTres.length; i++) {
            arrayTres [i] = arrayUno [i] + arrayDos [i];
            System.out.println("Los valores del tercer array son: " + arrayTres[i]);
        }

        lecturaTeclado.close();

    }//fin de main
}//fin de clase
