public class NumeroCuadradoCubo {
    public static void main(String[] args) {
        int cuadrado [] = new int[20];
        int cubo [] = new int[20];
        int numero [] = new int[20];

        //generamos valores aleatorios para el array numero
        for (int i = 0; i < numero.length; i++) {
            int numAleatorio = (int)(Math.random()*100);
            numero [i] = numAleatorio;
            System.out.printf("Valores del array %d \n", numero[i]);
        }

        //almacenamos los cuadrados de los valores del array número
        for (int i = 0; i < numero.length; i++) {
            int valoresCuadrado = (int)Math.pow(numero[i],2);
            cuadrado[i] = valoresCuadrado;
            System.out.printf("Valores al cuadrados %d \n", cuadrado[i] );
        }

        //almacenamos el cubo de los valores del array número
        for (int i = 0; i < numero.length; i++) {
            int valoresCubo = (int)Math.pow(numero[i],3 );
            cubo [i] = valoresCubo;
            System.out.printf("Valores al cubo %d \n", cubo[i]);
        }
        

    }//fin de main
}//fin de clase
