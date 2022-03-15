package idiomas;

import java.util.ArrayList;

public abstract class Idiomas {

    //variables
    private String nombre;
    private int numeroHablantes;
    private ArrayList<String> listaPalabras;

    //constructores

    public Idiomas(){}

    public Idiomas(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        this.listaPalabras = new ArrayList();
    }

    //métodos
    public abstract void saludar();

    public abstract void despedir();

    public void ingresarPalabra(String palabra){
        listaPalabras.add(palabra);
    }

    public void listarPalabras(){
        System.out.printf("Las palabras en el idioma %s son: ", nombre);
        for (String item : listaPalabras) {
            System.out.println(item);
        }
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHablantes() {
        return numeroHablantes;
    }

    public void setNumeroHablantes(int numeroHablantes) {
        this.numeroHablantes = numeroHablantes;
    }

    public ArrayList<String> getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(ArrayList<String> listaPalabras) {
        this.listaPalabras = listaPalabras;
    }
}//fin de clase
