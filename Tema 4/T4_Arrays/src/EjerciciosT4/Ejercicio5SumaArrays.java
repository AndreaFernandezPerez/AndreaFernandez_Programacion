package EjerciciosT4;

import java.util.Scanner;

public class Ejercicio5SumaArrays {
    public static void main(String[] args) {
        //creamos variables
        Scanner lecturaTeclado = new Scanner(System.in);
        int longitud;
        int sumaUno = 0;
        int sumaDos = 0;

        //Solicitamos por pantalla la longitud que queremos que tengan nuestros arrays
        System.out.println("Introduce la longitud del array");
        longitud = lecturaTeclado.nextInt();

        //Creamos los arrays y los valores de los array con las longitudes que nos han proporcionado
        int [] arrayUno = new int[longitud];
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = (int) (Math.random()*50+1);
            sumaUno += arrayUno[i];
        }

        int [] arrayDos = new int[longitud];
        for (int i = 0; i < arrayDos.length; i++) {
            arrayDos[i] = (int) (Math.random()*50+1);
        }

        //creamos un tercer array, con la misma longitud que los dos anteriores
        int [] arrayTres = new int[longitud];

        //rellenamos el tercer array con la suma de las posiciones Array1.posicion1 + array2.posicion = array3.posicion


        lecturaTeclado.close();

    }//fin de main
}//fin de clase
