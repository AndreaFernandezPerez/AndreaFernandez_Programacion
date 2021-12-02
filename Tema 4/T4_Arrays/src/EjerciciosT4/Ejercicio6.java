package EjerciciosT4;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] numeros = new int[20];
        int sumaModificaciones = 0;

        //rellenamos el array
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int)(Math.random()*30);
        }

        //introducimos las evaluaciones
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6){
                numeros[i] = 8;
                sumaModificaciones++;
            }
            else if (numeros[i] == 7){
                numeros[i] = 15;
                sumaModificaciones++;
            }
            else if (numeros[i] == 20){
                numeros[i] = 10;
                sumaModificaciones++;
            }
        }
        System.out.printf("Se han modificado %d posiciones", sumaModificaciones);


    }//fin de main
}//fin de clase
