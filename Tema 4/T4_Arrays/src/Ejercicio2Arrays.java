public class Ejercicio2Arrays {
    public static void main(String[] args) {
        int numeros [] = new int[30];

        for (int i = 0; i < numeros.length; i++) {
            int aleatorios = (int)(Math.random()*10);
            numeros[i] = aleatorios;
            System.out.println(numeros[i]);
        }
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los número es: " + suma);

        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media = suma/numeros.length;
        }
        System.out.println("La media es igual a " + media);



    }//fin de main
}//fin de clase
