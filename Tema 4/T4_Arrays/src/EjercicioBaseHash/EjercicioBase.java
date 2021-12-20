package EjercicioBaseHash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class EjercicioBase {
    public static void main(String[] args) {

        /*
        * Vamos a crear una lista de coche*/

        Hashtable<String, Object[]> listaCoches = new Hashtable();

        Object [] coche = {"1128jpk","Opel", "Astra", 136};

        //agregamos coches
        listaCoches.put(coche[0].toString(), coche);//así garantizamos que la key y la matrícula va a ser la misma
        listaCoches.put("3315jjj", new Object[]{"3315jjj", "Seat", "Leon", 99});
        listaCoches.put("1234cds", new Object[]{"1234cds", "Audi", "A5", 220});

        //Pedir una matricula por teclado y saquemos todos los datos del coche encontrado
        //En el caso de no encontrar la matrícula, saltará un aviso

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la matricula a buscar");
        String matricula = sc.next();

        if (listaCoches.get(matricula)!=null){ //es decir, con esta sentencia nos aseguramos que la matrícula está en el hashTable
            Object [] cocheEncontrado = listaCoches.get(matricula);
            for (Object item : listaCoches.get(matricula)) { //en los paréntesis de get ponemos el nombre de la clave
                System.out.println(item);
            }
        }else {
            System.out.println("La matrícula no está en la lista");
        }
        sc.close();

        //sacar todos los datos de todos los coches con .keys
        //con este metodo primero seleccionamos la clave y después imprimimos los valores que contienen
        System.out.println("Imprimimos los valores de los coches con keys");
        Enumeration<String> listadoMatriculas = listaCoches.keys();

        while (listadoMatriculas.hasMoreElements()){
            String clave = listadoMatriculas.nextElement();
            Object[] elementosCoche = listaCoches.get(clave);

            for (Object item : elementosCoche) {
                System.out.println(item);
            }
            System.out.println();
        }

        //sacar todos los datos de todos los coches con .elements
        //con esto nos da los valores directamente de lo que contienen las claves
        System.out.println("Imprimimos los valores de los coches con elements");
        Enumeration<Object[]> listaCochesEnum = listaCoches.elements();

        while (listaCochesEnum.hasMoreElements()){
            Object [] cocheActual = listaCochesEnum.nextElement();

            for (Object item : cocheActual) {
                System.out.println(item);
            }
            System.out.println();
        }

    }//fin de main
}//fin de clase
