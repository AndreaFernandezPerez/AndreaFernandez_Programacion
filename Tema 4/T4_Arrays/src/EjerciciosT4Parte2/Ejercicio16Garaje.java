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
        double costeTotal = 0;
        ArrayList<Object[]> listaCoches = new ArrayList<>();

        do {
            System.out.println("Que opción quieres realizar");
            System.out.println("1. Añadir coche al taller");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coches");
            System.out.println("4. Mostrar costes");
            System.out.println("5. Eliminar coche");
            System.out.println("6. Vaciar garaje");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce la marca");
                    String marca = sc.next();
                    System.out.println("Introduce el modelo");
                    String modelo = sc.next();
                    System.out.println("Introduce el coste");
                    coste = sc.nextInt();
                    System.out.println("Introduce matrícula");
                    String matricula = sc.next();
                    Object [] coche = {marca, modelo, coste, matricula};
                    listaCoches.add(coche);
                    //si introduzco aqui la suma de los costes, me suma todos los costes aunque los coches ya no estén añadidos
                    costeTotal += coste;

                    break;
                case 2:
                    if (listaCoches.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        for (Object [] item : listaCoches) {
                            for (Object coches : item) {
                                System.out.println(coches + "\t");
                            }
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    if (listaCoches.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        System.out.println("Introduce la matricula del coche a buscar");
                        String cocheBuscado = sc.next();
                        for (Object [] coches : listaCoches) {
                            //Hay alguna manera donde no haga falta poner la posicicion que ocupa matricula
                            //si no poner la variable
                            if (coches[3].toString().equalsIgnoreCase(cocheBuscado)){
                                for (Object item : coches) {
                                    System.out.println(item);
                                }
                            }
                        }
                    }
                    break;
                case 4:
                    if (listaCoches.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        //si introduzco aqui la suma de los costes, me acumula el último valor
                        costeTotal += coste;
                        System.out.println("El coste acumulado de todos los coches es: " + costeTotal);
                    }
                    break;
                case 5:
                    if (listaCoches.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        System.out.println("Introduce la matricula del coche a buscar");
                        String cocheBuscado = sc.next();
                        if (listaCoches.contains(cocheBuscado)){
                            listaCoches.remove(cocheBuscado);
                        }
                        for (Object[] coches : listaCoches) {
                            for (Object item: coches) {
                                System.out.println(item);
                            }
                        }}
                    break;
                case 6:
                    if (listaCoches.size() == 0){
                        System.out.println("Introduce primero un coche");
                    }else {
                        for (int i = 0; i < listaCoches.size(); i++) {
                            listaCoches.remove(i);
                        }
                        for (Object [] coches : listaCoches) {
                            for (Object item : coches) {
                                System.out.println(item);
                            }
                        }
                    }
                    break;
            }
        }while (opcion != 0);







        sc.close();


    }//fin de main
}//fin de clase
