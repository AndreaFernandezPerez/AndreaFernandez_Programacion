package ejercicios.agendaRepaso;

import java.util.ArrayList;

public class Agenda {
    //variables
    ArrayList<Persona> listaPersonas;

    //constructores
    public Agenda(){
        listaPersonas = new ArrayList<>();
    }

    //métodos

    public void agregarPersona(Persona persona){
        boolean existe = false;
        for (Persona item: listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(item.dni)){
                existe = true;
                break;
            }
        }
        if (existe){
            System.out.println("La persona ya existe");
        }else {
            listaPersonas.add(persona);
            System.out.println("Persona añadida");
        }
    }

    public void listarAgenda(){
        for (Persona item: listaPersonas) {
            System.out.println("Imprimiendo persona");
            item.mostrarDatos();
        }
    }

    public void borrarPersona(String dni){
        for (int i = 0; i < listaPersonas.size(); i++) {
            if (dni.equalsIgnoreCase(listaPersonas.get(i).getDni())){
                listaPersonas.remove(i);
                break;
            }
        }
        System.out.println("La persona se ha eliminado");
    }

    public void editarPersona(String dni){
        for (Persona item: listaPersonas) {
            if (item.getDni().equalsIgnoreCase(dni)){
                item.setNombre("Pepe");
                item.setTelefono(657483921);
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
