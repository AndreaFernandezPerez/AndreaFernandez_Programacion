package ejercicios.agenda;

import java.util.ArrayList;

public class Agenda {

    //variables

    private ArrayList<Persona> listaPersonas; //mejor no inicializarlo New Arraylist

    //constructores

    public Agenda() {

        this.listaPersonas = new ArrayList<>();
    }

    //métodos

    public void agregarPersona(Persona persona) {

        /*
        boolean existe = false;
        for (Persona item : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(item.getDni())){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("La persona ya existe");
        }else {
            listaPersonas.add(persona);
        }*/

        //utilizando el metodo de si existePersona
        if (existePersona(persona.getDni()).equals(null)){
            listaPersonas.add(persona);
        }else {
            System.out.println("Persona ya existe");
        }

    }

    public void listar() {
        for (Persona item : listaPersonas) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public void borrarPersona(String dni) {

        for (int i = 0; i < listaPersonas.size(); i++) {
            if (dni.equalsIgnoreCase(listaPersonas.get(i).getDni())) {
                listaPersonas.remove(i);
                //recorremos la agenda
                //después hacemos una comparación, de si el dni que buscamos es igual al alguno que haya dentro
                //cogemos su posición y lo borramos
            }
        }
    }

    public boolean borrarPersona2(String dni) {

        /*
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (dni.equalsIgnoreCase(listaPersonas.get(i).getDni())) {
                listaPersonas.remove(i);
                return true;
            }
        }*/

        if (existePersona(dni) != null){
            listaPersonas.remove(existePersona(dni));
            return true;
        }
        return false;
    }

    public void buscarPersona(String dni) {
        /*
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(dni)){
                persona.mostrarDatos();
                break;
            }
        }*/

        if (existePersona(dni) != null){
            existePersona(dni).mostrarDatos();
        }
    }

    public void editar(String dni) {

        /*
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(dni)){
                persona.setNombre("Rodrigo");
                persona.setTelefono(678954321);
                break;
            }
        }*/

        if (existePersona(dni) != null){
            Persona personaEncontrada = existePersona(dni);
            personaEncontrada.setNombre("Pepito");
            personaEncontrada.setTelefono(618294647);

            existePersona(dni).setNombre("Rita");
            existePersona(dni).setTelefono(678543924);
        }
    }

    private Persona existePersona(String dni){

        Persona persona = null;
        for (Persona item :listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(item.getDni())){
                //persona = item; Es una manera correcta de hacerlo, pero la hay mas simle
                //break;
                return item;
            }
        }

        return persona;
    }

    //métodos get y set

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

}//fin de clase
