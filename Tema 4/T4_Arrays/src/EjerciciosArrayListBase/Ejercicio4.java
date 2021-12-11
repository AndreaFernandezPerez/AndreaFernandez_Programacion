package EjerciciosArrayListBase;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<Integer> numerosUno = new ArrayList<>();
        ArrayList<Integer> numerosDos = new ArrayList<>();
        int iguales = 0;

        for (int i = 0; i < 20; i++) {
           numerosUno.add((int)(Math.random()*101));
           numerosDos.add((int)(Math.random()*101));
        }
        System.out.println(numerosUno);
        System.out.println(numerosDos);

        for (int i = 0; i < numerosDos.size(); i++) {
            if (numerosDos.get(i) == numerosUno.get(i)){
                iguales++;
            }
        }
        System.out.printf("Ha habido %d coincidencias", iguales);
    }//fin de main
}//fin de clase
