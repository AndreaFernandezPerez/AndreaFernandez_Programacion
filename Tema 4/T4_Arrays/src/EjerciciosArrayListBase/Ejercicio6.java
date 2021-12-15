package EjerciciosArrayListBase;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Object[]> listaCoches = new ArrayList<>();
        Object [] cocheUno = {"Opel", "Astra", 136};
        Object [] cocheDos = {"Audi", "Q3", 160};
        Object[] cocheTres = {"Seat", "Ibiza", 98};

        listaCoches.add(cocheUno);
        listaCoches.add(cocheDos);
        listaCoches.add(cocheTres);
        listaCoches.add(new Object[]{"Ford", "Focus", 150});//otra manera de añadir el coche
        listaCoches.add(new Object[]{"Citroen", "DS5", 180});
        listaCoches.add(new Object[]{"Kia", "Picanto", 66});
        listaCoches.add(new Object[]{"VW", "Golf", 200});
        listaCoches.add(new Object[]{"Audi", "A4", 220});
        listaCoches.add(new Object[]{"Audi", "Q7", 300});

        listaCoches.get(0)[2] = 500; //con esto modificamos y añadimos valores nuevos

        //obtener coches

        Object[] cocheSeleccionado = listaCoches.get(0); // primero seleccionamos la posicion del arraylist
        System.out.println(cocheSeleccionado[1]);

        System.out.println(listaCoches.get(2)[0]); // de la segunda posicion del arrayList, imprimera la posicón 0

        for (int i = 0; i < listaCoches.size(); i++) { // esta versión no valdría porque nosotros indicamos el número de la posición
            System.out.printf("Marca: %s  Modelo: %s  CV:%d\n", listaCoches.get(i)[0], listaCoches.get(i)[1], listaCoches.get(i)[2]);
        }

        //manera correcta de imprimir todos los datos con un for normal
        for (int i = 0; i < listaCoches.size(); i++) {
            Object[] cocheActual = listaCoches.get(i);
            for (int j = 0; j < cocheActual.length; j++) {
                System.out.print ("\t" + cocheActual[j]);
            }
            System.out.println();
        }

        //manera coreccta de imprimir todos los datos con un foreach
        for (Object[] item: listaCoches) {
            //System.out.printf("Marca: %s  Modelo: %s  CV:%d\n", item[0], item[1], item[2]);

            for (Object coche : item) {
                System.out.println(coche + "\t");
            }
            System.out.println();
        }

        //Que marca quieres buscar: Mercedes
        //me dará todos los datos de los coches de esa marca

        System.out.println("Que marca quieres buscar");
        String marca = sc.next();

        for (Object[] coche : listaCoches) {
            if (coche[0].toString().equalsIgnoreCase(marca)){
                for (Object item : coche) {
                    System.out.println(item + "\t");
                }
            }
            System.out.println();
        }



        sc.close();

    }//fin de main
}//fin de clase
