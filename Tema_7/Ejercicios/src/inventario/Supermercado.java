package inventario;

import java.util.ArrayList;

public class Supermercado<T> {

    //variables
    private ArrayList<T> listaGenero;
    //constructores


    public Supermercado() {
        this.listaGenero = new ArrayList<>();
    }

    //métodos
    public void anadirGenero(T genero){
        listaGenero.add(genero);
    }

    public void listarDatos(){
        for (T item : listaGenero) {
            if (item instanceof Alimento){
                ((Alimento) item).mostrarDatos();
            }else if (item instanceof Mueble){
                ((Mueble) item).mostrarDatosMueble();
            }
        }
    }

    public void mostrarPrecioFinales(){
        double precioTotal = 0;
        for (T item: listaGenero) {
            if (item instanceof Alimento){
                precioTotal += ((Alimento) item).getPrecio();
            }else if (item instanceof Mueble){
                precioTotal += ((Mueble) item).getPrecio();
            }
        }
        System.out.println(precioTotal);
    }

    //getter y setter


}//fin de clase
