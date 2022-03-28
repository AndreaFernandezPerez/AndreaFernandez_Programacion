package repasoEjercicios.idiomas;

import java.util.ArrayList;

public abstract class Idioma {

    //variables
    private String nombre;
    private int numeroHablantes;
    private ArrayList<String> palabras;

    //constructores

    public Idioma() {
    }

    public Idioma(String nombre, int numeroHablantes) {
        this.nombre = nombre;
        this.numeroHablantes = numeroHablantes;
        this.palabras = new ArrayList();
    }

    //métodos
    public abstract void saludar();
    public abstract void despedir();

    public void ingresarPalabra (String palabra){
        palabras.add(palabra);
    }

    public void listarPalabras(){
        System.out.printf("Las palabras en %s son:\n", getNombre());
        for (String item : palabras) {
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

    public ArrayList getPalabras() {
        return palabras;
    }

    public void setPalabras(ArrayList palabras) {
        this.palabras = palabras;
    }

}//fin de clase
