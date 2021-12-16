package EjerciciosT4Parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16Garaje {
    public static void main(String[] args) {

        /*
        * Supongamos solo podemos tener 10 coches, si no hay espacio disponible debería indicarlo*/

        Scanner sc = new Scanner(System.in);
        int opcion;
        double coste = 0;
        ArrayList<Object[]> listaGaraje = new ArrayList<>();

        do {
            System.out.println("Que opción quieres realizar");
            System.out.println("1. Añadir coche al taller");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coches");
            System.out.println("4. Mostrar costes");
            System.out.println("5. Eliminar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    if (listaGaraje.size() < 5){
                    System.out.println("Introduce la marca");
                    String marca = sc.next();
                    System.out.println("Introduce el modelo");
                    String modelo = sc.next();
                    System.out.println("Introduce matrícula");
                    String matricula = sc.next();
                    System.out.println("Introduce el coste");
                    coste = sc.nextInt();
                    Object [] coche = {marca, modelo, matricula, coste};
                        System.out.println("Coche recepcionado");
                        listaGaraje.add(coche);
                    }else {
                        System.out.println("No hay espacio disponible");
                    }
                    break;
                case 2:
                    if (listaGaraje.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        for (Object [] coche : listaGaraje) {
                            System.out.println("Marca: " + coche[0] + "\tModelo: " + coche[1] +
                                    "\tMatricula: " + coche[2] + "\tCoste: " + coche[3]);
                        }
                    }
                    break;
                case 3:
                    if (listaGaraje.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        System.out.println("Introduce la matricula del coche a buscar");
                        String cocheBuscado = sc.next();
                        boolean encontrado = false;
                        for (Object [] coche : listaGaraje) {
                            //Hay alguna manera donde no haga falta poner la posicicion que ocupa matricula
                            //si no poner la variable
                            if (coche[2].toString().equalsIgnoreCase(cocheBuscado)){
                                encontrado = true;
                                System.out.println("Marca: " + coche[0] + "\tModelo: " + coche[1] +
                                        "\tMatricula: " + coche[2] + "\tCoste: " + coche[3]);
                                break;
                            }
                        }
                        if (!encontrado){
                            System.out.println("El coche no está en el garaje");
                        }
                    }
                    break;
                case 4:
                    double costeAcumulado = 0;
                    if (listaGaraje.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        for (Object [] coche : listaGaraje) {
                            costeAcumulado += (double) coche[3];
                        }
                        System.out.println("Tu coste acumulado es de " + costeAcumulado);
                    }
                    break;
                case 5:
                    if (listaGaraje.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        System.out.println("Introduce la matricula del coche a buscar");
                        String cocheBuscado = sc.next();
                        boolean encontrado = false;

                        for (int i = 0; i < listaGaraje.size(); i++) {
                            if (listaGaraje.get(i)[2].toString().equalsIgnoreCase(cocheBuscado)){
                                System.out.println("Coche borrado");
                                encontrado = true;
                                listaGaraje.remove(i);
                                break;
                            }
                        }
                        if (!encontrado){
                            System.out.println("Coche no encontrado en la lista");
                        }
                      }
                    break;
                case 6:
                    if (listaGaraje.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        listaGaraje.clear();
                        System.out.println("Lista vaciada");
                    }
                    break;
                case 7:
                    break;
            }
        }while (opcion != 7);

        sc.close();


    }//fin de main
}//fin de clase
