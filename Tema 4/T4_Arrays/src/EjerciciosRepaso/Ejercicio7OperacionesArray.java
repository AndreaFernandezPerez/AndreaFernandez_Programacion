package EjerciciosRepaso;

public class Ejercicio7OperacionesArray {
    public static void main(String[] args) {
        int [] numeros = new int[10];
        int ultima, primera;

        //Mostramos los datos separados por una coma
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*10);
           if (numeros[i] != numeros[numeros.length-1]){
               System.out.print(numeros[i] + ", ");
           }
           if (numeros[i] == numeros[numeros.length-1]){
               System.out.print(numeros[i]);
           }
        }
        System.out.println();
        //Incrementar en 1 los valores pares y en -1 los impares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] %2 == 0){
                numeros[i] += 1;
            }else {
                numeros[i] -= 1;
            }
            System.out.print(numeros[i]);
        }
        System.out.println();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 5){
                numeros[i] *= 2;
            }
            System.out.print(numeros[i]);
        }
        System.out.println();
        //Sumamos a cada valor un valor entero aleatorio entre -5 y 5.
        for (int i = 0; i < numeros.length; i++) {
            int aleatorio = (int)(Math.random()*11) - 5;
            numeros[i] += aleatorio;
        }
        for (int item : numeros) {
            System.out.print(item);
        }
        System.out.println();
        //Mover los datos una posición hacia la derecha
        ultima = numeros[numeros.length-1];
        primera = numeros[0];
        for (int i = numeros.length-1; i >= 0 ; i--) {
            if (i == 0){
                numeros[i] = ultima;
            }else {
                numeros[i] = numeros[i - 1];
            }
        }
        for (int item : numeros) {
            System.out.print(item);
        }


    }//fin de main
}//fin de clase
