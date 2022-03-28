package inventario;

import java.util.ArrayList;

public class SupermecadoEspecifico<T extends Inventariable> {

    //variables
    private ArrayList<T> listaProductos;
    //constructores

    //métodos
    public void registrarElemento(T elemento){
        listaProductos.add(elemento);
    }

    public void mostrarPrecioFinales(){
        for (T item: listaProductos) {
            item.calcularPrecio();
        }
    }

    //getter y setter


}//fin de clase
