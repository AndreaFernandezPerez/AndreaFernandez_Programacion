package ejercicios.agenda;

import java.util.ArrayList;

public class Agenda {

    //variables

    private ArrayList <Persona> listaPersonas; //mejor no inicializarlo New Arraylist

    //constructores

    public Agenda(){
        this.listaPersonas = new ArrayList<>();
    }

    //métodos

    public void listar(){
        for (Persona item : listaPersonas) {
            item.mostrarDatos();
        }
    }

    public void agregar (Persona persona){
        listaPersonas.add(persona);
    }

    public void borrar (String dni){

    }

    public void editar (String dni){

    }

    public void buscar (String dni){
      
    }

    //métodos get y set

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}//fin de clase
