import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class Colecciones {
    /*
    Los ArrayList son dinamicos --> son modificables en tamaño
    add --> añadimos valores
    remove --> borramos los datos, y el arraylist se rearma
    si necesitamos preguntar el tamaño, utilizamos el método size()
     */
    public static void main(String[] args) {

        //lista de cualquir cosa --> OBJECT
        ArrayList listaCosas = new ArrayList();

        //para poder saber su tamaño
        listaCosas.size(); // devuelve el tamaño de la lista

        //añadimos valores a la lista
        listaCosas.add(5);
        int tamanio = listaCosas.size();
        System.out.println(tamanio);
        listaCosas.add("Andrea");
        tamanio = listaCosas.size();
        System.out.println(tamanio);

        //queremos sacar una posicion --> utilizamos metodo .get(i)  i = el valor que quiero saber
        listaCosas.get(0);
        int numero = (int)listaCosas.get(0); //casteamos listaCosas porque sabemos que es un int
        System.out.println("El valor es: " + numero);
        String palabra = String.valueOf(listaCosas.get(1)); //String.valueOf es el casteo de String
        System.out.println("El valor es: " + palabra);

        listaCosas.add(true);
        listaCosas.add(6);
        listaCosas.add(0.9);
        listaCosas.add(6);
        listaCosas.add("Hola");
        listaCosas.add(6);
        listaCosas.add(false);
        listaCosas.add(6);

        tamanio = listaCosas.size();
        System.out.println(tamanio);
        System.out.println(listaCosas);

        //sacamos todos los valores del arraylist en lineas diferentes
        for (int i = 0; i < listaCosas.size(); i++) {
            System.out.println(i+1 + " - " + listaCosas.get(i));
        }

        int posiciones = 1;
        for (Object item : listaCosas) {
            System.out.println(posiciones + " - " + item);
            posiciones++;
        }

        //para saber si contiene el valor
        listaCosas.contains("Andrea");

        //para borrar datos
        //con el metodo remove se pueden eliminar valores por porsiciones u objetos.
        //si nuestro ArrayList es un object (mejor no utilizar) se liará, por eso tenemos que indicar new Integer(el valor (5).
        listaCosas.remove(new Integer(5));


        //Buscar dentro de una lista la palabra "Andrea"
        //cuando la encuentre, sacar el mensaje : Palabra encontrada y el valor de la misma

        posiciones = 0;
        for (Object item: listaCosas) {
            if (item.equals("Hola")){
                System.out.println("Palabra encontrada");
                System.out.println("En la posición " + posiciones);
            }
            posiciones++;
        }

        int posicionElementos = listaCosas.indexOf("Andrea");
        if (posicionElementos >= 0){
            System.out.println("Palalabra encontrada");
            System.out.println("En la posición: " + posicionElementos);
        }else {
            System.out.println("La palabra no existe");
        }

        //pedir por consola una palabra a buscar
        //en el caso de que la palabra se encuentre en la lista, se modifique su valor por otro pedido por consola
        //en el caso de que la palabra no se encuentre en la lista, se agregará al final

        Scanner sc = new Scanner(System.in);
        System.out.println("Que palabras quieres buscar");
        String palabraBuscar = sc.next();

        int posicionEncontrada = listaCosas.indexOf(palabraBuscar);
        //listaCosas.contains(palabraBuscar); así tambien podemos buscar la palabra

        if (posicionEncontrada >= 0){
            // si va de 0 a n --> la palabra está
            System.out.println("Por que palabra quieres sustituir");
            palabraBuscar = sc.next();
            listaCosas.set(posicionEncontrada, palabraBuscar); // .set(la posicion que quiero sustituir , por el valor a sustituir
        }else {
            listaCosas.add(palabraBuscar);
        }
        System.out.println(listaCosas);

        //Borrar todos los 6 de la lista

        /*Como lo he hecho yo
        for (int i = 0; i < listaCosas.size(); i++) {
            if (listaCosas.contains(6)) {
                listaCosas.remove(listaCosas.indexOf(6));
            }
        }
        System.out.println(listaCosas);
        //como lo ha hecho borja

        /*
        for (int i = 0; i < listaCosas.size(); i++) {
           /* if (listaCosas.get(i).equals(6)) {
                listaCosas.remove(i);
            }
            Esto es lo que yo hice

            if (listaCosas.get(i) instanceof Integer){ //evaluamos primero si es un número entero
                if (((int)listaCosas.get(i)) == 6){ //y después preguntamos la condición
                    listaCosas.remove(i);
                }
            }
        }
        System.out.println(listaCosas);

         */

        listaCosas.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals(6);
            }
        });
        System.out.println(listaCosas);


        sc.close();

    }//fin de main
}//fin de clase
