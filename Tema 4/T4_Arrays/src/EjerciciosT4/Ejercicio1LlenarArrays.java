package EjerciciosT4;

public class Ejercicio1LlenarArrays {
    public static void main(String[] args) {
        int [] numeros = new int[5];

        //Generamos números aleatorios entre 10 y 50, e imprimimos por pantalla
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int)(Math.random()*(50-10+1)+10);
            System.out.println(numeros[i]);
        }

    }//fin de main
}//fin de clase
