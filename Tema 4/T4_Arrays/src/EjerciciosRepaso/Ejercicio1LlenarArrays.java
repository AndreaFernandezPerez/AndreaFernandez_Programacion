package EjerciciosRepaso;

public class Ejercicio1LlenarArrays {
    public static void main(String[] args) {
        int [] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*((50-10+1)+10));
            System.out.println(numeros[i]);
        }

    }//fin de main
}//fin de clase
