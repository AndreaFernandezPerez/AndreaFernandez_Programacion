package examen1.restaurantePizzeria;

import java.util.ArrayList;

public class Pizza {

    //variables
    private String nombre;
    private double precio;
    private int id;
    private boolean estado;
    private ArrayList<Ingrediente> listaIngredientes;

    //contructures
    public Pizza(){

    }
    public Pizza( String nombre){

        this.nombre = nombre;
        listaIngredientes = new ArrayList<>();
    }
    public Pizza( String nombre, ArrayList listaIngredientes){
        this.nombre = nombre;
        this.listaIngredientes = new ArrayList<>();
    }

    //métodos

    public void calcularPrecio(){
        for (Ingrediente item: listaIngredientes) {
            // precio = precio + item.getPrecio(); precio = 0 + 0,70 (lo que vale la cebolla); precio = 0,70 + 0,50 queso
            precio += item.getPrecio();
        }
    }

    public void verDatos(){
        calcularPrecio();
        System.out.println(nombre);
        System.out.println(id);
        System.out.println(estado);
        System.out.println(precio);
        for (Ingrediente item : listaIngredientes) {
            System.out.println(item.getNombre() + " - " + item.getPrecio());
        }
    }

    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}//fin de clase
