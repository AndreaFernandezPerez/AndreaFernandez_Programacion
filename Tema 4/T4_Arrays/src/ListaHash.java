import java.util.Enumeration;
import java.util.Hashtable;

public class ListaHash {
    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        //para sacar el tamaño de la lista
        listaElementos.size();

        //añadir-guardar cosas a la lista
        listaElementos.put("1", "Elemento 1"); //pide objeto que es la clave y otro objeto que es lo que quiero guardar (el valor)
        listaElementos.put("2", "Elemento 2");
        listaElementos.put("3", false);
        listaElementos.put("4", new String[]{"Cosa 1","Cosa 2", "Cosa 3"});

        System.out.println(listaElementos.size());

        //Obtener elementos del HashTable
        listaElementos.get("4");
        String [] elementoEncontrado = (String[]) listaElementos.get("4"); //casteo a String[] ; hemos obtenido la posicion 4
        elementoEncontrado[0]= "Nuevo valor"; // en la posición 0, hemos guardado un nuevo elemento, y "Cosa 1" deja de existir
        for (String item : elementoEncontrado) {
            System.out.println(item);
        }

        //Borrar un elemento
        listaElementos.remove("1"); // en este caso eleminariamos "Elemento 1"
        listaElementos.get("1");//esto ya no devolvería nada, porque esa key ya no existe

        // buscar con que nos puede imprimir todos los valores
        listaElementos.elements(); //devuelve directamente los elementos
        listaElementos.keys();//devuelve directamente las claves
        listaElementos.keySet(); // con este se podría buscar con un foreach
        listaElementos.values();

        //como obtener/imprimir los datos del HashTable con .keys()

        System.out.println("Imprimimos todos los datos");
        Enumeration<Object> listaClaves = listaElementos.keys(); //lo hemos tipado como Object, xq el hashtable, así están tipadas las claves

        while (listaClaves.hasMoreElements()){ //si, listaClaves contiene mas elementos --> entramos en el while
            //hay elemento siguiente
            Object clave = listaClaves.nextElement();// con esto nos coge el elemento, la clave
            Object elemento = listaElementos.get(clave);
            System.out.println(elemento);
        }


    }//fin de main
}//fin de clase
