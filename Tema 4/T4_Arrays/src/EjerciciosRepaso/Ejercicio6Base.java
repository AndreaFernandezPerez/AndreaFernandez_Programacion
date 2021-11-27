package EjerciciosRepaso;

public class Ejercicio6Base {
    public static void main(String[] args) {
        int [] numeros = new int[20];
        int suma = 0;

        //Damos valor al array
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*31);
            System.out.println(numeros[i]);
        }
        //Modificamos valores del array y contabilizamos cuantas veces lo hemos modificado
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6){
                numeros[i] = 8;
                suma++;
            }
            if (numeros[i] == 7){
                numeros[i] = 15;
                suma++;
            }
            if (numeros[i] == 20){
                numeros[i] = 10;
                suma++;
            }
        }
        //Imprimimos cuantos números se han modificado
        System.out.printf("Se han modificado %d valores\n", suma);

    }//fin de main
}//fin de clase
