package trabajadoresInterfaz;

import java.util.ArrayList;

public class Empresa {
    //variables
    private ArrayList<Persona> listaPersona;
    private String nombre;
    private int votos;
    private double beneficios;

    //Constructores

    public Empresa(){

    }
    public Empresa(String nombre, int beneficios){
        this.nombre = nombre;
        this.beneficios = beneficios;
        listaPersona = new ArrayList<>();
    }
    //métodos
    public void listarPersonas(){
        for (Persona item: listaPersona) {
            item.mostrarDatos();
        }
    }

    public void addPersona(Persona persona){
        listaPersona.add(persona);
        System.out.println("Persona añadida");
    }

    public void despedirPersona(String dni){
        for (int i = 0; i < listaPersona.size(); i++) {
            if(listaPersona.get(i).getDni().equalsIgnoreCase(dni)){
                listaPersona.remove(i);
                break;
            }
        }
    }

    public void buscarPersona(String dni){
        for (Persona item : listaPersona) {
            if (item.getDni().equalsIgnoreCase(dni)){
                item.mostrarDatos();
            }
        }
    }

    public void registrarVotacion(Comision comision){
        this.votos += comision.votar();
    }

    public void repartirBeneficios(){
        for (Persona item : listaPersona) {
            if (item instanceof Comision){
                ((Comision) item).obtenerBeneficio((int) beneficios);
            }
        }
    }

    //getter y setter

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }
}//fin de clase
