public class Ejercicio4 {
    public static void main(String[] args) {
        int cuadrado [] = new int[20];
        int cubo [] = new int[20];
        int numero [] = new int[20];

        //generamos valores aleatorios para el array numero
        for (int i = 0; i < numero.length; i++) {
            int numAleatorio = (int)(Math.random()*101);
            numero [i] = numAleatorio;
        }

        //almacenamos los cuadrados de los valores del array número
        for (int i = 0; i < numero.length; i++) {
            int valoresCuadrado = (int)Math.pow(numero[i],2);
            cuadrado[i] = valoresCuadrado;
        }

        //almacenamos el cubo de los valores del array número
        for (int i = 0; i < numero.length; i++) {
            int valoresCubo = (int)Math.pow(numero[i],3 );
            cubo [i] = valoresCubo;
        }

        //para imprimirlo en tres columnas
        for (int i = 0; i < numero.length; i++) {

            System.out.printf("%d \t %d \t %d\n", numero[i], cuadrado[i], cubo[i]);
        }
        

    }//fin de main
}//fin de clase
