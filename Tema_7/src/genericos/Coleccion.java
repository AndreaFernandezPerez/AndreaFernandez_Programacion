package genericos;

import java.util.ArrayList;

public class Coleccion<T, S, V> implements Organizable<S, V>{
    //variables
    private ArrayList<T> listaCosas;

    //constructor

    public Coleccion() {
        this.listaCosas = new ArrayList();
    }

    //métodos
    public void agregarCosas(T cosa){
        listaCosas.add(cosa);
    }

    @Override
    public void organizar(S criterio) {

    }

    @Override
    public V listar() {
        return null;
    }
    //getter y setter
}//fin de clase
