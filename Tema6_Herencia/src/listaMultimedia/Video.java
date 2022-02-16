package listaMultimedia;

import java.util.ArrayList;

public final class Video extends Elemento{

    //variables
    private String director;
    private ArrayList<Actor> listaActores;

    //constructores
    public Video(){
        this.listaActores = new ArrayList<>();
    }
    public Video(String id, String titulo, String autor, int tamanio, String formato, String director){
        super(id, titulo, autor, tamanio, formato);
        this.director = director;
        this.listaActores = new ArrayList<>();
    }

    //métodos
    public void agregarActor(Actor actor){
        listaActores.add(actor);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mostramos datos de video");
        super.mostrarDatos();
        System.out.println("Director: " + director);
        System.out.println("Los actores son:");
        for (Actor item: listaActores) {
            item.mostrarDatos();
        }
    }

    public void metodoVideo(){

    }

    //getter y setter

}//fin de clase
