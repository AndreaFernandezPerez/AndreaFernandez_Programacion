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

    public void agregarPersona (Persona persona){

        listaPersonas.add(persona);
    }

    public void listar(){
        for (Persona item : listaPersonas) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public void borrarPersona (String dni){

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (dni.equalsIgnoreCase(listaPersonas.get(i).getDni())){
                listaPersonas.remove(i);
                //recorremos la agenda
                //después hacemos una comparación, de si el dni que buscamos es igual al alguno que haya dentro
                //cogemos su posición y lo borramos
            }
        }
    }

    public boolean borrarPersona2 (String dni){
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (dni.equalsIgnoreCase(listaPersonas.get(i).getDni())){
                listaPersonas.remove(i);
                return true;
            }
        }
        return false;
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
