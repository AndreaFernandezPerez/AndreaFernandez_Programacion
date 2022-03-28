package genericos;

import java.util.ArrayList;

public class ColeccionEspecifica<T extends Coleccionable> {
    //variables
    private ArrayList<T> listaCosas;

    //constructor

    public ColeccionEspecifica() {
        this.listaCosas = new ArrayList();
    }

    //métodos
    public void agregarCosas(T cosa){
        listaCosas.add(cosa);
    }

    //getter y setter
}//fin de clase
