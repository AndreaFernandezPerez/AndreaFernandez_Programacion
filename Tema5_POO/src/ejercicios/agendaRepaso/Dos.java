package ejercicios.agendaRepaso;

import java.util.ArrayList;

public class Dos {
    //variables
    private ArrayList<Persona> listaaa;

    //constructores
    public Dos(){
        this.listaaa = new ArrayList<>();
    }

    //métodos


    public void agregar(Persona persona){

        if (paxExiste(persona.getDni())==(null)){
            listaaa.add(persona);
        }else {
            System.out.println("Persona ya existe");
        }
    }
    public Persona paxExiste(String dni){

        Persona personaEncontrada = null;

        for (Persona item: listaaa){
            if (item.getDni().equalsIgnoreCase(dni)){
                return item;
            }
        }
        return personaEncontrada;
    }

    public void listar(){
        for (Persona item : listaaa) {
            item.mostrarDatos();
        }
    }

    public void borrar(String dni){
        if (paxExiste(dni) != null){
            listaaa.remove(paxExiste(dni));
            System.out.println("Persona borrada");
        }else {
            System.out.println("Persona no existe");
        }
    }

    public void buscar(String dni){
        if (paxExiste(dni) != null){
            paxExiste(dni).mostrarDatos();
        }
    }
    public void editar(String dni){
        if (paxExiste(dni) != null){
            Persona personEncontrada = paxExiste(dni);
            personEncontrada.setTelefono(12345654);
            personEncontrada.setNombre("Pepe");
        }
    }


    //getter y setter


    public ArrayList<Persona> getListaaa() {
        return listaaa;
    }

    public void setListaaa(ArrayList<Persona> listaaa) {
        this.listaaa = listaaa;
    }
}// fin de clase
