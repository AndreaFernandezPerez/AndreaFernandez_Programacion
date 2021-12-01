import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        int opcion;
        int[] numeros = null;



        do {
            System.out.println("1. Iniciar el array con un tamaño pedido por teclado");
            System.out.println("2. Guarda tantos números aleatorios como tamaño tenga el array");
            System.out.println("3. Lista solo aquellas posiciones don el valor sea superior a 10 y número par");
            System.out.println("4. Rota las posiciones del array a la izquierda");
            System.out.println("5. Lista todas las posiciones del array");
            System.out.println("¿Que opción quieres?");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Introduce la longitud que deseas que tenga el array");
                    longitud = sc.nextInt();
                    if (longitud > 0) {
                        numeros = new int[longitud];
                    } else {
                        System.out.println("No es posible crear el array");
                    }
                    break;
                case 2:
                    if (longitud > 0){
                        for (int i = 0; i < numeros.length; i++) {
                            numeros[i] = (int) (Math.random()*101);
                            System.out.println(numeros[i]);
                        }
                    }else {
                        System.out.println("No ha introducido una longitud");
                    }
                    break;
                case 3:
                    if (longitud > 0){
                        for (int i = 0; i < numeros.length; i++) {
                            if (numeros[i] > 10 && numeros[i] %2 == 0){
                                System.out.println(numeros[i]);
                            }
                        }
                    }else {
                        System.out.println("No ha introducido una longitud");
                    }
                    break;
                case 4:
                    if (longitud > 0){
                        for (int item : numeros) {
                        }
                        int primera = numeros[0];
                        for (int i = 0; i < numeros.length; i++) {
                            if (numeros[i] == numeros[numeros.length-1]){
                                numeros[i] = primera;
                            }else {
                                numeros [i] = numeros[i + 1];
                            }
                            System.out.println(numeros[i]);
                        }
                    }else {
                        System.out.println("No ha introducido una longitud");
                    }
                    break;
                case 5:
                    if (longitud > 0){
                        for (int item : numeros) {
                            System.out.println(item);
                        }
                    }else {
                        System.out.println("No ha introducido una longitud");
                    }
                    break;

            }//fin de switch
        }while (opcion != 0);




        sc.close();
    }//fin de main
}//fin de clase
