package proyectoEnumInterfaz;

import java.util.ArrayList;

public class Seleccion {

    //variable
    private ArrayList<Persona> listaPersonas;

    //constructor


    public Seleccion() {
        this.listaPersonas = new ArrayList<>();
    }

    //métodos

    public void addPersona(Persona persona){
        this.listaPersonas.add(persona);
    }

    public void comprobarAtaque(){
        for (Persona item: listaPersonas) {
            if (!(item instanceof Entrenador)){
                ((Seleccionable)item).atacar();
            }
        }
    }

    //getter y setter

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}//fin de clase
