package bibliotecaInterfaz;

import java.util.ArrayList;

public class Biblioteca {
    //variables
    private ArrayList<Persona> listaPersonas;
    private ArrayList<Elemento> listaElementos;
    int numSocio =0;

    //constructores

    public Biblioteca() {
        this.listaPersonas = new ArrayList<>();
        this.listaElementos = new ArrayList<>();
    }

    //métodos
    public void registrarPersona(Persona persona){
        boolean paxExiste = false;

        for (Persona item : listaPersonas) {
            if (persona.getDni().equalsIgnoreCase(item.getDni())){
                paxExiste = true;
                break;
            }
        }
        if (paxExiste){
            if (persona instanceof Trabajador){
                System.out.println(persona.getClass().getSimpleName() + " ya registrado");
            }
            if (persona instanceof Socio){
                System.out.println(persona.getClass().getSimpleName() + " ya registrado");
            }
        }else {
            if (persona instanceof Socio){
                ((Socio) persona).setNumSocio(numSocio++);
            }else {
                listaPersonas.add(persona);
            }

            System.out.println(persona.getClass().getSimpleName() + " registrado");
        }

    }

    public void registrarElemento(Elemento elemento){
        listaElementos.add(elemento);
    }

    public void registrarAlquilable(Prestar prestable){
        this.listaElementos.add((Elemento) prestable);
    }

    public void realizarPrestamo(Socio socio, Prestar prestable){
        
        if (socio.getPrestamos().add(prestable)){
            System.out.println("Se ha realizado préstamo");
        }
    }

    public void devolverPrestamo(Socio socio, Prestar elemento){
        if (socio.getPrestamos().remove(elemento)){
            System.out.println("Se ha realizado la devolucion");
        }
    }

    public void elementosPrestados(){
        for (Elemento item : listaElementos) {
            if (item instanceof Prestar){
                if (item.estado == true){
                    item.mostrarElemento();
                }
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

    public ArrayList<Elemento> getListaElementos() {
        return listaElementos;
    }

    public void setListaElementos(ArrayList<Elemento> listaElementos) {
        this.listaElementos = listaElementos;
    }
}//fin de clase
