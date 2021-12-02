package EjerciciosT4;

public class Ejercicio2Arrays {
    public static void main(String[] args) {
        int numeros [] = new int[30];
        int suma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
           // int aleatorios = (int)(Math.random()*11);
            numeros[i] = (int)(Math.random()*11);
            System.out.println(numeros[i]);
        }

        //en el foreach generamos una variable nueva que tomara los valores que le indiquemos en la segunda variable
        for (int item : numeros) { //la variable item tomará los valores que hemos generado en el antorior for para el array
            suma += item; //suma = suma + item
        }


        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los número es: " + suma);

        media = (double) suma/ (double) numeros.length;

        System.out.printf("La media es igual a %.2f\n", media);



    }//fin de main
}//fin de clase
