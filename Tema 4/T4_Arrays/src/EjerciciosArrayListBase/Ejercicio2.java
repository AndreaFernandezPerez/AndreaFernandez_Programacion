package EjerciciosArrayListBase;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        int suma = 0;
        double media = 0;
        int maximo = -999;
        int minimo = 999;

        for (int i = 0; i < 10; i++) {
            numeros.add((int)(Math.random()*101));
        }
        System.out.println(numeros);

        for (Integer item : numeros) {
            suma += item;
            if (item > maximo){
                maximo = item;
            }
            if (item < minimo){
                minimo = item;
            }
        }
        media = (double) suma/ numeros.size();

        // Collections.max(numeros); coge el número mas alto
        // Collections.min(numeros); coge el número mas bajo
       //  Collections.sort(numeros); los ordena de menor a mayor, después habría que coger la primera y última posición

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La media de los numeros es: " + media);
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);




    }//fin de main
}//fin de clase
