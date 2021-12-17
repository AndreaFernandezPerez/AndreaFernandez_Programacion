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


    }//fin de main
}//fin de clase
