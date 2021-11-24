package EjerciciosT4;

import java.util.Scanner;

public class ArrayMultiSumaAristas {
    public static void main(String[] args) {
        Scanner lecturaTeclado = new Scanner(System.in);
        int filas, columnas;
        int numerosAleatorios[][];
        int sumatorioFila1 = 0, sumatorioFilaN = 0, sumatorioColumna1 = 0, sumatorioColumnaN = 0;

        System.out.println("Cuantas filas tendrá el array");
        filas = lecturaTeclado.nextInt();

        System.out.println("Cuantas columnas tendrá el array");
        columnas = lecturaTeclado.nextInt();

        numerosAleatorios = new int[filas][columnas];

        for (int i = 0; i < numerosAleatorios.length; i++) { //primer for vale para recorrer las filas
            for (int j = 0; j < numerosAleatorios[i].length; j++) { //segundo for vale para recorrer las columnas --> pregunta por la longitud de cada fila
                numerosAleatorios[i][j] = (int) (Math.random() * 21);
                System.out.print(numerosAleatorios[i][j] + "\t ");
            }
            System.out.print("\n");
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (i == 0) {
                    sumatorioFila1 += numerosAleatorios[i][j];
                }
                if (i == filas - 1) {
                    sumatorioFilaN += numerosAleatorios[i][j];
                }
                if (j == 0) {
                    sumatorioColumna1 += numerosAleatorios[i][j];
                }
                if (j == columnas - 1) {
                    sumatorioColumnaN += numerosAleatorios[i][j];
                }
            }
        }
        System.out.printf("La suma de la primera fila es %d, \n la suma de la última fila es %d\n", sumatorioFila1, sumatorioFilaN);
        System.out.printf("La suma de la primera columna es %d, \n la suma de la última columna es %d ", sumatorioColumna1, sumatorioColumnaN);


        //Lo mismo pero con un foreach

        int numeroFila = 0;

        for (int[] fila : numerosAleatorios) { // ponemos [] porque lo que recorremos es un array multidimensional

            //detectamos primera fila
            for (int columna : fila) {
                if (numeroFila == 0) {
                    sumatorioFila1 += columna;
                }
                //detectamos última fila
                if (numeroFila == filas - 1) {
                    sumatorioFilaN += columna;
                }
                //detectamos primera columna

                //detectamos última columna
            }


            numeroFila++;
        }


        lecturaTeclado.close();

    }//fin de main
}//fin de clase
