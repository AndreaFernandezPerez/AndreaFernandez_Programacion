package equipoFutbol;

import java.util.ArrayList;

public final class Seleccion {
    //variables
    private ArrayList<Persona> listaPersonas;
    private int gastoAcumulado;

    //constructores
    public Seleccion(){
        this.listaPersonas = new ArrayList<>();
    }

    //métodos

    public void contratar(Persona persona){

        boolean personaExiste = false;

        for (Persona item : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(item.getDni())){
                personaExiste = true;
                break;
            }
        }
        if (personaExiste){
            if (persona instanceof Jugador){
                System.out.println(persona.getClass().getSimpleName());
                System.out.println("Jugador existe");
            }
            if (persona instanceof Entrenador){
                System.out.println(persona.getClass().getSimpleName());
                System.out.println("Entrenador existe");
            }
        }else {
            listaPersonas.add(persona);
            System.out.println("La persona ha sido contratada");

            /* utilizando método existePersona
            *
            * if(!existePersona(persona.getDni())){
            *   this.listaPersona.add(judador);
            * }
            * */
        }
    }

    /* método existe persona

    private boolean existePersona(String dni){

        boolean existe = false;

        for(Persona item : listaPersona){
            if(item.getDni().equalsIgnoreCase(dni)){
                return true;
            }
        }

        return existe;
    }
    * */

    public void verPosicion(String posicion){
        for (Persona item: listaPersonas) {
            if (item instanceof Jugador){
                if (((Jugador) item).getPosicion().equalsIgnoreCase(posicion)){
                    System.out.println(item.getClass().getSimpleName());
                    item.mostrarDatos();
                }
            }
        }
    }

    public void verJugadores(){
        for (Persona item : listaPersonas) {
            if (item instanceof Jugador){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    public void verEntrenadores(){
        for (Persona item : listaPersonas) {
            if (item instanceof Entrenador){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    public void verPlantilla(){
        int jugador = 0;
        int entrenador = 0;
        System.out.println("Plantilla");
        for (Persona item : listaPersonas) {
            System.out.println(item.getClass().getSimpleName());
            if (item instanceof Jugador){
                jugador++;
            }
            if (item instanceof Entrenador){
                entrenador++;
            }
            item.mostrarDatos();
        }
        System.out.println("El número de jugadores es: " + jugador);
        System.out.println("El número de entrenadores es: " + entrenador);
    }

    public void mostrarGastos(){
        for (Persona item : listaPersonas) {
            gastoAcumulado += item.getSueldo();
        }
        System.out.println("El gasto total es: " + gastoAcumulado);
    }

    //getter y setter


    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
}// fin de clase
