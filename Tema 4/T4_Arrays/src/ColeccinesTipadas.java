import java.util.ArrayList;

public class ColeccinesTipadas {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList();
        ArrayList<String > listaPalabras = new ArrayList();
        ArrayList<int[]> listaPersonas = new ArrayList<>(); //creamos un arrayList de arrays

        listaNumeros.add(123); //añadimos un valor
        listaNumeros.get(0); //vemos lo que hay en una posición
        listaNumeros.remove(0); //borramos lo que hay en una posición

        listaPalabras.add("Hola");
        listaPalabras.get(0);
        listaPalabras.remove(0);

        //recorremos listaNumeros
        for (Integer item : listaNumeros) {
        }

        //recorremos listaPalabras
        for (String item : listaPalabras) {
        }

    }//fin de main
}//fin de clase
